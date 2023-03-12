package com.example.flexible_talk.auth_login.model.request;

public class UserRegister extends UserLogin{
    public String nickName;

    public UserRegister(String email, String password, String nickName) {
        super(email, password);
        this.nickName = nickName;
    }
}
