package model.mapper;

import model.dto.ReviewDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReviewMapper {

    /**
     * 📌 특정 강의의 리뷰 목록 조회 (user_interactions 기반)
     */
    @Select("""
        SELECT 
            interaction_id AS reviewId,
            target_id AS lectureId,
            title AS reviewer,
            rating,
            content,
            created_at
        FROM user_interactions
        WHERE target_type = 'LECTURE'
          AND target_id = #{lectureId}
          AND interaction_kind = 'FEEDBACK'
        ORDER BY created_at DESC
    """)
    List<ReviewDTO> getReviewsByLectureId(@Param("lectureId") int lectureId);

    /**
     * 📌 리뷰 등록 (reviews 테이블 기준)
     */
    @Insert("""
        INSERT INTO reviews (target_id, content, rating, user_id, created_at)
        VALUES (#{targetId}, #{content}, #{rating}, #{userId}, NOW())
    """)
    void insertReview(ReviewDTO dto);

    /**
     * 📌 평균 평점 갱신
     */
    @Update("""
        UPDATE lectures l
        SET l.avg_rating = (
            SELECT IFNULL(ROUND(AVG(r.rating), 1), 0)
            FROM reviews r
            WHERE r.target_id = #{lectureId}
        )
        WHERE l.lecture_id = #{lectureId}
    """)
    void updateLectureRating(@Param("lectureId") int lectureId);

    /**
     * 📌 수강 여부 확인 (enrollments 기준)
     */
    @Select("""
        SELECT COUNT(*) > 0
        FROM enrollments
        WHERE user_id = #{userId}
          AND lecture_id = #{lectureId}
    """)
    boolean hasEnrolled(@Param("userId") int userId, @Param("lectureId") int lectureId);

    /**
     * 📌 리뷰 작성 여부 확인 (user_interactions 기준)
     */
    @Select("""
        SELECT COUNT(*) > 0
        FROM user_interactions
        WHERE user_id = #{userId}
          AND target_id = #{lectureId}
          AND target_type = 'LECTURE'
          AND interaction_kind = 'FEEDBACK'
    """)
    boolean hasReviewed(@Param("userId") int userId, @Param("lectureId") int lectureId);

    /**
     * 📌 수강 완료 여부 확인 (lecture_contents + progress_logs 기준)
     * - 진도율 평균이 100%여야 함
     */
    @Select("""
        SELECT AVG(progress_percent) = 100
        FROM progress_logs pl
        JOIN lecture_contents lc ON pl.content_id = lc.content_id
        WHERE pl.user_id = #{userId}
          AND lc.lecture_id = #{lectureId}
    """)
    boolean hasCompletedWithFullProgress(@Param("userId") int userId, @Param("lectureId") int lectureId);
}
