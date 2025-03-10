package com.knr.quiz.service;

import com.knr.quiz.model.Answer;
import com.knr.quiz.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public Answer addAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    public Answer updateAnswer(Answer answer){
        return answerRepository.save(answer);
    }

    public void deleteAnswer(Long id){
        answerRepository.deleteById(id);
    }

    public List<Answer> getAnswerByQuestionId(Long questionId){
        return answerRepository.getAnswersByQuestionId(questionId);
    }

}
