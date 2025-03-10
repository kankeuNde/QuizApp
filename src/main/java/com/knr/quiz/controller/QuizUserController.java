package com.knr.quiz.controller;

import com.knr.quiz.dto.AuthenticationRequest;
import com.knr.quiz.model.QuizUser;
import com.knr.quiz.service.QuizUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class QuizUserController {

    private final QuizUserService quizUserService;

    @Autowired
    public QuizUserController(QuizUserService quizUserService){
        this.quizUserService = quizUserService;
    }

    // GET all users
    @GetMapping
    public ResponseEntity<List<QuizUser>> getAllUsers() {
        List<QuizUser> users = quizUserService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // GET user by ID
    @GetMapping("/{id}")
    public ResponseEntity<QuizUser> getUserById(@PathVariable Long id){
        return quizUserService.findUserById(id)
                .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // POST create a new user
    @PostMapping
    public ResponseEntity<QuizUser> createUser(@RequestBody QuizUser user){
        QuizUser quizUser = quizUserService.registerUser(user);
        return new ResponseEntity<>(quizUser, HttpStatus.CREATED);
    }

    // PUT update an existing user
    @PutMapping("/{id}")
    public ResponseEntity<QuizUser> updateUser(@PathVariable Long id, @RequestBody QuizUser user){
        user.setId(id); // Ensure the ID is set for the update
        QuizUser updatedUser = quizUserService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // DELETE a user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        quizUserService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // POST authenticate a user
    @PostMapping("/authenticate")
    public ResponseEntity<Boolean> authenticateUser(@RequestBody AuthenticationRequest authRequest){
        boolean isAuthenticated = quizUserService.authenticateUser(authRequest.getUsername(), authRequest.getPassword());
        return new ResponseEntity<>(isAuthenticated, HttpStatus.OK);
    }
}
