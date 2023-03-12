package com.example.flexible_talk.auth_login.provider.auth;

import com.example.flexible_talk.auth_login.model.request.UserLogin;
import com.example.flexible_talk.auth_login.model.request.UserRegister;
import com.example.flexible_talk.auth_login.model.response.Token;
import com.example.flexible_talk.auth_login.provider.API;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthProvider {
    private final AuthService service;

    public AuthProvider() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.service = retrofit.create(AuthService.class);
    }

    public Response<Token> login(UserLogin user) {
        Call<Token> request = service.login(user);
        try {
            return request.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Response<Token> register(UserRegister user) {
        Call<Token> request = service.register(user);
        try {
            return request.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
