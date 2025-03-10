package com.knr.quiz.repository;

import com.knr.quiz.model.QuizUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuizUserRepository extends JpaRepository<QuizUser, Long> {

    Optional<QuizUser> findByUsername(String username);
}
