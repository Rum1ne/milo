package com.example.flexible_talk.auth_login.provider.auth;

import com.example.flexible_talk.auth_login.model.request.UserLogin;
import com.example.flexible_talk.auth_login.model.request.UserRegister;
import com.example.flexible_talk.auth_login.model.response.Token;

import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.Call;

public interface AuthService {
    @POST("/login")
    Call<Token> login(@Body UserLogin user);

    @POST("/register")
    Call<Token> register(@Body UserRegister user);
}
