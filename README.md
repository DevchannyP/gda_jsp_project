# 🎓 EduProject Platform

> 수강 관리 + 팀 프로젝트 매칭 + 멘토링 기능이 통합된 실전형 교육 플랫폼  
> 강사, 수강생, 관리자, 멘토 모두를 위한 All-in-One 시스템입니다.

---

## 📌 목차 (Table of Contents)

1. [📖 프로젝트 개요](#📖-프로젝트-개요)
2. [🚀 주요 기능 요약](#🚀-주요-기능-요약)
3. [🖼️ UI 화면 구성 및 흐름도](#🖼️-ui-화면-구성-및-흐름도)
4. [🗃️ ERD (Entity Relationship Diagram)](#🗃️-erd-entity-relationship-diagram)
5. [📄 화면설계서 및 요구사항 명세](#📄-화면설계서-및-요구사항-명세)
6. [🛠 기술 스택 및 시스템 구조](#🛠-기술-스택-및-시스템-구조)
7. [📡 API 명세 (Swagger)](#📡-api-명세-swagger)
8. [💻 설치 및 실행 방법](#💻-설치-및-실행-방법)
9. [✅ 테스트 내역 및 결과](#✅-테스트-내역-및-결과)
10. [🎬 프로젝트 시연 영상](#🎬-프로젝트-시연-영상)
11. [👥 팀 소개 및 역할](#👥-팀-소개-및-역할)
12. [📎 기타 자료](#📎-기타-자료)
13. [📄 라이선스](#📄-라이선스)

---

## 📖 프로젝트 개요

| 항목 | 설명 |
|------|------|
| 프로젝트명 | EduProject Platform |
| 개발 기간 | 2025.04.25 ~ 2025.05.21 |
| 주요 대상 | 수강생, 강사, 관리자, 멘토 |
| 핵심 목적 | 실시간 수강, 팀 프로젝트 매칭, 멘토링, 관리자 시스템 제공 |
| 배포 환경 | VSCode 기반 모노레포 (Spring Boot + React) |

---

## 🚀 주요 기능 요약

| 분류 | 기능 |
|------|------|
| 인증 | 회원가입, 로그인, 이메일 인증, 소셜 로그인 (Naver OAuth) |
| 수강 | 강의 등록, 스트리밍 재생, 피드백/평점 |
| 게시판 | 강의 게시판, 질문/문의 게시판, 댓글/답글 |
| 결제 | 장바구니, 결제 처리, 결제 성공/실패 안내 |
| 프로젝트 | 팀 모집, 태그 필터링, 매칭 관리 |
| 멘토링 | 게시판 작성, 멘토 답변, 멘토 신청 |
| 관리자 | 회원/강의/게시판 관리, 권한 변경 |

---

## 🖼️ UI 화면 구성 및 흐름도

```mermaid
flowchart TD
    Login[로그인] --> Main[메인 대시보드]
    Main --> Lectures[강의 목록 및 재생]
    Main --> Projects[팀 프로젝트 게시판]
    Main --> Mentoring[멘토링 게시판]
    Main --> Profile[마이페이지]
    Main --> Admin[관리자 기능]


📎 Figma 시안: 화면설계서.pdf

🗃️ ERD (Entity Relationship Diagram)
정규화 기반 ERD (3NF)

주요 테이블: users, lectures, projects, feedback, payments, mentorings 등

📎 ERD PDF 다운로드: ERD.pdf

📎 ERD Cloud 공유 링크: https://erdcloud.com/project/eduproject-platform

📄 화면설계서 및 요구사항 명세
문서명	설명	링크
화면설계서	전체 UI 구조, 페이지 레이아웃, 컴포넌트 정의 포함	화면설계서.pdf
요구사항 정의서	기능별 UR/FR/NFR/정책 정의	요구사항정의서.pdf
작업 WBS	일정, 담당자, 완료율 포함 WBS	WBS-작업현황표.xlsx

🛠 기술 스택 및 시스템 구조
계층	기술
프론트엔드	React.js (Next.js App Router), Tailwind CSS
백엔드	Spring Boot 3.x, JPA, Security, JWT
인증	Naver OAuth, 이메일 인증, 세션+JWT 혼합
DB	MySQL
도구	GitHub Actions, Postman, Figma, ERDCloud

mermaid
복사
편집
graph TD
    User --> FE[Next.js]
    FE --> API[Spring Boot]
    API --> DB[(MySQL)]
    API --> Mail[SMTP 인증]
    API --> OAuth[Naver OAuth]
📡 API 명세 (Swagger)
Swagger 문서 자동 생성 및 실시간 테스트 가능

예시: http://localhost:8080/swagger-ui/index.html

💻 설치 및 실행 방법
bash
복사
편집
# 백엔드 실행
cd backend
./gradlew bootRun

# 프론트엔드 실행
cd frontend
npm install
npm run dev
📎 .env 샘플 포함: env-example

✅ 테스트 내역 및 결과
기능	담당자	결과
이메일/소셜 로그인	김준희, 박찬희	✅ 완료
강의 등록 → 결제 → 수강	김준희	✅ 완료
멘토링 → 프로젝트 매칭	소정훈	✅ 완료
관리자 기능 전반	박찬희	✅ 완료

📎 테스트 목록 전체: 기능별 테스트결과.pdf

🎬 프로젝트 시연 영상
📹 EduProject 시연 영상 (YouTube)
📎 시연 영상 녹화 파일 (로컬용)

영상은 주요 흐름 (회원가입 → 강의 수강 → 팀 프로젝트 매칭 → 멘토링) 순서로 진행됩니다.

👥 팀 소개 및 역할
이름	역할	주요 담당
🧑‍💻 박찬희	Backend 리드	ERD, API, 강의/결제/멘토링/게시판
👩‍💻 김준희	Frontend 리드	UI 구현, 로그인/회원가입/결제
👨‍💻 소정훈	Fullstack	팀 프로젝트, 멘토링, 문의 게시판

📎 기타 자료
WBS/일정표: docs/WBS-작업현황표.xlsx

회고 및 보고서: docs/팀_회고_보고서.pdf

GitHub Project Board: 🔗 Link to Kanban

📄 라이선스
본 프로젝트는 MIT License 하에 공개되어 있으며, 자유롭게 사용/수정 가능합니다. 다만, 상업적 활용 시 출처를 반드시 표시해 주세요.

yaml

---

## 📌 참고: `docs` 폴더 구성 예시

/docs
├── ERD.pdf
├── 화면설계서.pdf
├── 요구사항정의서.pdf
├── WBS-작업현황표.xlsx
├── 시연영상.mp4
├── 기능별_테스트결과.pdf
├── 팀_회고_보고서.pdf
└── env-example
