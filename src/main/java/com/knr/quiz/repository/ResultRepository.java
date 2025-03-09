package com.knr.quiz.repository;

import com.knr.quiz.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    @Query("SELECT r FROM Result r WHERE r.user.id = ?1")
    List<Result> getResultsByUserId(Long userId);
    @Query("SELECT r FROM Result r WHERE r.quiz.id = ?1")
    List<Result> getResultsByQuizId(Long quizId);
}
