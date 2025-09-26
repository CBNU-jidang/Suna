package com.example.sbb.question;

import org.springframework.data.jpa.repository.JpaRepository;

//Repository는 db에 데이터들을 저장, 조회, 수정, 삭제 할 수 있도록 함
//JpaRepository 상속(JpaRepository는 이미 함수를 가지고 있어서 데이터작업을 더 편하게 해줌)
//<Question, Integer>은 Question 엔티티로 레퍼지토리를 생성하겠다는 의미(Integer는 Question의 기본키)
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
}