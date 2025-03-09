package com.knr.quiz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
public class AuthenticationRequest {

    @NotBlank(message = "Username is required")
    @JsonProperty("username") // Maps the JSON property to this field
    private String username;

    @NotBlank(message = "Password is required")
    @JsonProperty("password")
    private String password;

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
