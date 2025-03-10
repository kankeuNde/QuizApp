package com.knr.quiz.service;

import com.knr.quiz.model.Result;
import com.knr.quiz.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public Result submitResult(Result result){
        return resultRepository.save(result);
    }

    public Result updateResult(Result result){
        return resultRepository.save(result);
    }

    public List<Result> getResultsByUserId(Long userId){
        return resultRepository.getResultsByUserId(userId);
    }

    public List<Result> getResultsByQuizId(Long quizId){
        return resultRepository.getResultsByQuizId(quizId);
    }

    public void deleteResult(Long resultId){
        resultRepository.deleteById(resultId);
    }
}
