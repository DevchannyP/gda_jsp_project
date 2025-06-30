# 📚 GDA JSP Project

> JSP 기반의 강의 수강, 프로젝트 매칭, 멘토링 기능이 포함된 웹 플랫폼  
> 화면설계서, ERD, 요구정의서 등 **모든 산출물 포함**  
> 팀 협업형 프로젝트로 GitHub와 VSCode 기반으로 공동 개발

---

## 📌 목차

1. [📖 프로젝트 개요](#📖-프로젝트-개요)
2. [🚀 핵심 기능 요약](#🚀-핵심-기능-요약)
3. [🖼️ UI 화면 설계서](#🖼️-ui-화면-설계서)
4. [🗃️ 데이터베이스 ERD](#🗃️-데이터베이스-erd)
5. [📄 요구사항 및 테이블 정의](#📄-요구사항-및-테이블-정의)
6. [🎬 프로젝트 발표자료](#🎬-프로젝트-발표자료)
7. [🛠 실행 방법 및 환경](#🛠-실행-방법-및-환경)
8. [👥 팀 구성 및 역할](#👥-팀-구성-및-역할)
9. [📎 기타 자료 및 참고](#📎-기타-자료-및-참고)
10. [📄 라이선스](#📄-라이선스)

---

## 📖 프로젝트 개요

| 항목 | 내용 |
|------|------|
| 프로젝트명 | GDA JSP Project |
| 개발 기간 | 2025.04.25 ~ 2025.05.21 |
| 주요 기능 | 회원가입, 로그인, 강의 수강, 팀 프로젝트, 멘토링, 관리자 기능 등 |
| 개발 방식 | 팀 협업, GitHub 기반 브랜치 전략 운영 |
| 기술 스택 | JSP, Servlet, JSTL, MySQL, JDBC, MVC 패턴 |

---

## 🚀 핵심 기능 요약

- 📌 회원가입 / 로그인 / 이메일 인증
- 🎓 강의 등록, 수강, 피드백 및 평점
- 📂 게시판: 강의 / 프로젝트 / 문의 / 멘토링
- 🧑‍🤝‍🧑 팀 프로젝트 매칭 시스템
- 🧑‍🏫 멘토 지원 및 게시판 피드백
- ⚙️ 관리자 페이지: 전체 회원/강의 관리

---

## 🖼️ UI 화면 설계서

📂 화면 설계에 대한 시각 자료입니다. 각 화면의 레이아웃 및 UX 흐름을 포함합니다.

- [`화면설계서-1.pdf`](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%99%94%EB%A9%B4%EC%84%A4%EA%B3%84%EC%84%9C-1.pdf)
- [`화면설계서-2.pdf`](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%99%94%EB%A9%B4%EC%84%A4%EA%B3%84%EC%84%9C-2.pdf)

> 🔍 로그인, 강의목록, 강의상세, 팀프로젝트 등록, 멘토 신청 등 전체 플로우 포함

---

## 🗃️ 데이터베이스 ERD

- [`ERD.png`](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/ERD.png)  
> 📌 회원, 강의, 프로젝트, 게시판, 피드백, 멘토링 등 10개 이상의 테이블로 정규화됨

---

## 📄 요구사항 및 테이블 정의

📝 시스템의 요구사항 및 테이블 구조를 구조화하여 정리한 문서입니다.

- [`요구사항정의서.xlsx`](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%EC%A0%95%EC%9D%98%EC%84%9C.xlsx)
- [`테이블정의서.xlsx`](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%85%8C%EC%9D%B4%EB%B8%94%EC%A0%95%EC%9D%98%EC%84%9C.xlsx)

> ✅ 각 테이블의 속성, 제약조건, 관계 등을 포함한 실무형 문서

---

## 🎬 프로젝트 발표자료

- [`프로젝트ppt.pdf`](https://github.com/DevchannyP/gda_jsp_project/blob/main/docs/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8ppt.pdf)

> 발표용 10슬라이드 구성: 프로젝트 개요, UI 시연, ERD, 역할 분담, 개발 후기 등 포함

---

## 🛠 실행 방법 및 환경

```bash
# 서버 실행 방식 (Tomcat 9.x 기준)
1. Eclipse 또는 VSCode에서 Dynamic Web Project 로딩
2. WebContent에 JSP 파일 배치
3. WEB-INF/web.xml 및 JDBC 연결 설정
4. MySQL DB 생성 및 초기 데이터 입력

# DB 설정
DB Name: gda_jsp
User: root
Password: 1234

# 포트 설정
localhost:8080/gda_jsp_project

```

👥 팀 구성 및 역할
이름	역할	담당 기능
박찬희	Fullstack / 기획	ERD 설계, 기능 정의, 강의/결제/멘토링
김준희	프론트 JSP	회원가입, 로그인, 결제 화면, 마이페이지
소정훈	백엔드 JSP	팀프로젝트 매칭, 멘토링 게시판, 이메일 인증

📎 기타 자료 및 참고
📌 📂 docs/ 폴더 전체 보기

📎 GitHub 브랜치 전략: main + 기능별 브랜치(feature/login, feature/project, 등)

🧪 테스트 시나리오 문서(추가 가능 시): tests/ 폴더 또는 Notion 문서 연동

📄 라이선스
본 프로젝트는 MIT 라이선스를 따르며, 자유롭게 활용 가능합니다.
단, 상업적 사용 시 반드시 저작자 명시 및 원문 링크를 포함해 주세요.
