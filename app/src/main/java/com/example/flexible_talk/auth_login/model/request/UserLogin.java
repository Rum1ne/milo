package com.example.flexible_talk.auth_login.model.request;

public class UserLogin {
    public String email;
    public String password;

    public UserLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
