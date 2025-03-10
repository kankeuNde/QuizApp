package com.knr.quiz.service;

import com.knr.quiz.model.QuizUser;
import com.knr.quiz.repository.QuizUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizUserService {
    @Autowired
    QuizUserRepository quizUserRepository;

    public QuizUser registerUser(QuizUser user){
        return quizUserRepository.save(user);
    }

    public QuizUser updateUser(QuizUser user){
        return quizUserRepository.save(user);
    }

    public Optional<QuizUser> findUserById(Long id){
        return quizUserRepository.findById(id);
    }

    public Optional<QuizUser> findUserByUsername(String username){
        return quizUserRepository.findByUsername(username);
    }

    public boolean authenticateUser(String username, String password){
        return true;
    }

    public List<QuizUser> getAllUsers(){
        return quizUserRepository.findAll();
    }

    public void deleteUser(Long id) {
        quizUserRepository.deleteById(id);
    }
}
