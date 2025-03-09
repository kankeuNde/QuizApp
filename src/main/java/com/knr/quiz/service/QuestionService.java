package com.knr.quiz.service;

import com.knr.quiz.model.Question;
import com.knr.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question addQuestion(Question question){
        return questionRepository.save(question);
    }

    public List<Question> getQuestionByQuizId(Long quizId){
        return questionRepository.findByQuizId(quizId);
    }

    public Question updateQuestion(Question question){
        return questionRepository.save(question);
    }

    public void deleteQuestion(Long quizId){
        questionRepository.deleteById(quizId);
    }
}
