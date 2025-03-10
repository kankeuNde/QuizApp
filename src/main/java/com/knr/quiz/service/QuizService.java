package com.knr.quiz.service;

import com.knr.quiz.model.Quiz;
import com.knr.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz createQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }

    public Quiz UpdateQuiz(Quiz quiz){
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(Long id){
        quizRepository.deleteById(id);
    }

    public List<Quiz> getAllQuizzes(){
        return quizRepository.findAll();
    }

    public Optional<Quiz> getQuizById(Long id){
        return quizRepository.findById(id);
    }

}
