# 두커(두호 커뮤니티)

<p align="center">
  <br>
  <img src="./images/common/main.png">
  <br>
</p>


## 프로젝트 소개

<p align="justify">
프로젝트 개요/동기
</p>
- CRUD 기능을 구현한 커뮤니티 프로젝트
- 첫 개인 프로젝트로 FE - BE 간의 통신과 기본 지식을 얻고자 진행한 프로젝트
- 풀스택 개발
<p align="center">
<img src="./images/common/tree.png">
</p>

<br>

## 기술 스택

### Tools

|Java | Kotlin | Spring Boot |  React   |  MySQL   |
| :--------: | :--------: | :--------: | :------: | :-----: |
|   ![java]    |  ![kotlin]    | ![spring]    | ![react] | ![mysql] |

### etc
|Amazon EC2 | Amazon RDS |  Amazon S3 |
| :--------: | :--------: | :------: | 
|   ![ec2]    |   ![rds]    | ![s3] | 

<br>

## 구현 기능

### 게시글/댓글 CRUD, 검색, 좋아요 기능 구현

### 연간 Top3게시글 추천, 최신 게시물 페이징 처리, 인기 검색어 기능 로직 구현

### Spring Data JPA + QueryDSL을 활용한 데이터 접근 기술 구현

### Java to Kotlin 리팩토링 진행

<br>

## 배운 점 & 아쉬운 점

<p align="justify">

</p>

<br>

## 개발 일정

<details>
<summary>개발 일정</summary>


### 2023-07-01
- 요구사항 정리 및 SQL 작성

### 2023-07-05
- 기본적인 구조 완성(로그인)

### 2023-07-10
- 로그인 기능 구현(JWT)
- 완전한 구현은 X

### 2023-07-12
- 로그인 기능 까지의 페이지 구현(React)

### 2023-07-15
- 개인정보 수정 로직, 주간 TOP3 게시물 로직, 최신 게시물 로직 구현

### 2023-07-17
- 개인정보 페이지 구현

### 2023-07-20
- 페이지 디자인 재구성

### 2023-07-24
- 게시물 상세 페이지 구현 및 연결 완료

### 2023-07-25
- 댓글 기능, 좋아요 기능 구현

### 2023-07-26
- 게시물, 댓글, 좋아요 삭제 로직 구현
- api 분리(React)
- 프론트 실시간 반응 처리(댓글,좋아요 등 *아직 미완)
- 검색 페이지 구현중

### 2023-07-27
- 검색 기능 구현
- 인기 검색어 기능 구현

### 2023-07-31
- 파일(게시글 사진, 동영상, 기타 파일, 프로필 사진)업로드 구현중

### 2023-08-01
- 파일 업로드/조회 구현 완료
- 프로필 사진 구현
- 게시물 수정 구현(파일 제외)

### 2023-08-02
- 동영상 업로드/조회 구현
- 페이지 디자인 재구성
- 댓글 수정 구현

### 2023-08-03
- 페이지 디자인 재구성
- 좋아요 로직 수정
- 조회수가 계속 증가하는 문제 해결

### 2023-08-04
- 파일 다운로드 구현(어떤 파일이던)
- 이미지 로딩 방식 변경(blob)
- 동영상 로딩 구현중(blob)

### 2023-08-05
- 동영상 로드 구현
- 검색/댓글 프로필사진 로드 방식 변경

### 2023-08-06
- 페이지 디자인 수정
- 파일 다운로드 시 파일명이 지정 안되는 문제 해결
- 불필요한 의존관계 정리

### 2023-08-07
- 로그인 방식 변경
- 기존은 그냥 jwt토큰만 이용 -> refresh토큰 활용(적용중)

### 2023-08-08
- refresh토큰을 활용한 로그인 로직 적용 완료
- 좋아요 로직 개선
- 기본 프로필 제공

### 2023-08-09
- 로그인 로직 변경에 의한 오류 해결
- refreshToken 관련 로직도 불필요한 요청이 많아보여 수정 예정
- 토큰 저장방식 변경(localStorage / 보안 이슈 차차 해결할 예정)
- 메인 디자인좀 구상해볼 예정

### 2023-08-14
- 반복되는 패턴 일반화(진행중)

### 2023-08-15
- 저장소 변경(로컬 -> aws_s3)
- 배포(aws-ec2,rds)

### 2023-08-16
- 배포 완료
- 좋아요 개수 음수로 나오는 버그 수정 / 댓글창 댓글 내용 남아있는 버그 수정

# 2023-11-10
- Kotlin으로 리팩토링(추가)

## 2023-11-13
- Spring Data JPA + QueryDSL 활용 * 긴 쿼리의 가독성 해결
</details>

<!-- Stack Icon Refernces -->

[java]: /images/stack/java.png
[kotlin]: /images/stack/kotlin.svg
[spring]: /images/stack/springboot.png
[react]: /images/stack/react.png
[mysql]: /images/stack/rds_mysql.png
[ec2]: /images/stack/ec2.png
[rds]: /images/stack/rds.png
[s3]: /images/stack/s3.png
