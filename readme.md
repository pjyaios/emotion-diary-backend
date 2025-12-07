# DB 설치 및 테이블 생성

1. Docker 실행 및 도커 터미널 실행
2. Postgre 이미지 다운로드
   1. docker pull postgres
3. 이미지 확인
   1. docker images
4. 컨테이너 생성
   1. docker run -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=1234 -d postgres
5. 컨테이너 조회 및 접속
   1. docker ps
   2. docker exec -it [CONTAINER ID] bin/bash
   3. psql -U postgres
6. 테이블 생성
   1. CREATE DATABASE emotiondiary;

# 웹서비스 실행

1. JAVA 21 이상 설치
2. 실행
   - ./gradlew bootRun
3. 빌드
   - ./gradlew build

# 웹서비스 종료

1. 터미널 실행
2. 해당 포트를 사용중인 프로세스 조회
   - Sudo lost -I :8080
3. PID 조회 후 활성 상태 보기에서 해당 프로세스 중료

# API 테스트

1. 리스트 조회
   - GET http://localhost:8080/diaries
2. 단일 항목 조회
   - GET http://localhost:8080/diaries/1
3. 생성
   - POST http://localhost:8080/diaries
     {"createdDate": 1764331194,"emotionId": 1,"content": "good!"}
4. 수정
   - PUT http://localhost:8080/diaries/1
     {"createdDate": 1764331194,"emotionId": 1,"content": "good!"}
5. 삭제
   - DELETE http://localhost:8080/diaries/1
