# 📚 GDA JSP Project – JSP 기반 교육 플랫폼 (Fullstack MVC)

> 강의 수강, 프로젝트 매칭, 멘토링 등 교육 전반을 아우르는 JSP 웹 플랫폼
> 
> 
> 설계/ERD/요구정의서 등 산출물 완비 + GitHub 브랜치 전략 기반 실무형 협업 프로젝트
> 

[🎬 시연 영상](https://www.youtube.com/watch?v=dD76U35wdmM) | [📁 GitHub 저장소](https://github.com/DevchannyP/gda_jsp_project)

---

## 🧩 프로젝트 개요

| 항목 | 내용 |
| --- | --- |
| 프로젝트명 | GDA JSP Project |
| 개발 기간 | 2025.04.25 ~ 2025.05.21 |
| 팀 구성 | 박찬희, 김준희, 소정훈 (3인 풀스택 협업) |
| 기술 스택 | `JSP`, `Servlet`, `JSTL`, `JDBC`, `MySQL`, `MVC Pattern` |
| 개발 도구 | Eclipse / VSCode, Apache Tomcat 9.x, MySQL 8.x |
| 주요 기능 | 회원가입, 강의 수강, 팀 프로젝트, 멘토링, 장바구니, 관리자 기능 등 |

> 💡 ERD, UI 화면설계서, 요구정의서, PPT 포함 모든 산출물 완비
> 

---

## 🧠 역할 분담 및 기여도

| 이름 | 주요 기능 구현 | 비고 |
| --- | --- | --- |
| **박찬희** | 전체 기획/ERD/요구정의서 작성강의 등록/수강/강의문의/장바구니 | Full 기획 + 백엔드 + JSP UI |
| **김준희** | 로그인/회원가입/이메일 인증결제 처리 전체 | 인증 흐름 및 결제 전담 |
| **소정훈** | 팀 프로젝트 등록조건 기반 매칭 시스템멘토링 게시판 | 게시판/매칭 로직 중심 |

---

## 🧰 프로젝트 폴더 구조 (실제 기준)

```
📦 gda_jsp_project/
├── 📁 docs/                   # 설계서, ERD, 요구정의서 등 산출물
├── 📁 src/
│   └── 📁 main/
│       ├── 📁 java/
│       │   ├── controller/   # Servlet 기반 Controller
│       │   ├── model/        # DAO, DTO, Mapper, Provider
│       │   ├── service/      # 비즈니스 로직
│       │   └── utils/        # 공통 유틸 클래스
│       └── 📁 webapp/
│           ├── WEB-INF/     # web.xml, JSP 설정
│           ├── views/       # JSP UI
│           └── static/      # JS, CSS, 이미지
```

---

## 🖼️ 화면설계서 (UI 설계 기반)

- [📄 화면설계서 1](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%99%94%EB%A9%B4%EC%84%A4%EA%B3%84%EC%84%9C-1.pdf) (강의/수강/장바구니 등)
- [📄 화면설계서 2](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%99%94%EB%A9%B4%EC%84%A4%EA%B3%84%EC%84%9C-2.pdf) (팀 프로젝트/멘토링 등)

| 주요 화면 | 기능 |
| --- | --- |
| 강의 목록 | 수강 신청, 별점 피드백 |
| 장바구니 | 강의 추가/삭제, 결제 연결 |
| 프로젝트 등록 | 조건 기반 팀 매칭 |
| 멘토링 게시판 | 멘토 신청 및 승인 |
| 관리자 페이지 | 전체 회원, 강의, 게시판 관리 |

---

## 🗃️ 데이터베이스 설계 (ERD + 정의서)

- [📊 ERD (이미지)](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/ERD.png)
- [📑 요구사항 정의서](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%EC%A0%95%EC%9D%98%EC%84%9C.xlsx)
- [📑 테이블 정의서](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%85%8C%EC%9D%B4%EB%B8%94%EC%A0%95%EC%9D%98%EC%84%9C.xlsx)

> 정규화된 10개 이상의 테이블을 기반으로 실무형 ERD 작성
> 
> 
> 회원, 강의, 수강, 장바구니, 결제, 프로젝트, 멘토링, 관리자 등 포함
> 

---

## 🚀 주요 기능 요약

| 영역 | 기능 |
| --- | --- |
| 🔐 인증 | 회원가입, 로그인, 이메일 인증 |
| 🎓 강의 | 강의 등록/목록/상세/피드백 |
| 🛒 수강 신청 | 장바구니 추가, 수강 신청, 수강 내역 |
| 👥 팀 프로젝트 | 조건 기반 프로젝트 매칭 |
| 🧑‍🏫 멘토링 | 신청 → 승인 → 게시판 피드백 |
| 🧾 게시판 | 강의/프로젝트/멘토링 통합 게시판 |
| ⚙️ 관리자 | 전체 회원, 강의, 게시글 관리 |

---

## 🛠 실행 방법

```bash
# 1. MySQL DB 설정
DB 이름: gda_jsp
계정: root / 비밀번호: 1234

# 2. Eclipse or VSCode로 프로젝트 임포트
- Dynamic Web Project로 불러오기
- WEB-INF/web.xml, context.xml 설정 확인
- JDBC 드라이버 포함 (MySQL 8.x 이상)

# 3. Tomcat 9.x 실행
http://localhost:8080/gda_jsp_project 접속

# 4. 초기 데이터
src/sql/ 경로에 테스트용 insert 쿼리 포함
```

---

## 🎬 프로젝트 발표자료

- [📽️ 발표용 슬라이드 (10장)](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8ppt.pdf)
    - 개요 → UI 흐름 → ERD → 역할 → 기능 시연 → 후기

---

## 🧪 테스트 및 협업 전략

| 항목 | 내용 |
| --- | --- |
| 테스트 플로우 | 로그인 → 수강 신청 → 장바구니 → 결제 → 관리자 승인 |
| GitHub 전략 | `main` + `feature/{기능}` 브랜치 운영 |
| 커밋 규칙 | `feat:`, `fix:`, `docs:` 등 [Conventional Commits](https://www.conventionalcommits.org/) |

---

## 📄 라이선스

```
MIT License
본 프로젝트는 자유롭게 사용/수정/배포 가능
단, 반드시 **저작자 표기** 및 **GitHub 출처 링크 명시** 필요
```

---## 🔗 참고 및 산출물 폴더

| 항목 | 링크 |
| --- | --- |
| 📁 GitHub 저장소 | [github.com/DevchannyP/gda_jsp_project](https://github.com/DevchannyP/gda_jsp_project) |
| 🎥 시연 영상 | [YouTube](https://www.youtube.com/watch?v=dD76U35wdmM) |
| 📂 전체 산출물 보기 | [docs/ 폴더](https://github.com/DevchannyP/gda_jsp_project/tree/main/docs) |
