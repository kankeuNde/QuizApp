package com.knr.quiz.repository;

import com.knr.quiz.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> getAnswersByQuestionId(Long questionId);
}
