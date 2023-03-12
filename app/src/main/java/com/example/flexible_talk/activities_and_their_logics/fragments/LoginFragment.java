package com.example.flexible_talk.activities_and_their_logics.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.flexible_talk.activities_and_their_logics.activities.MainScreenActivity;
import com.example.flexible_talk.activities_and_their_logics.adding.AsyncExecutor;
import com.example.flexible_talk.databinding.FragmentLoginBinding;
import com.example.flexible_talk.auth_login.model.request.UserLogin;
import com.example.flexible_talk.auth_login.model.response.Token;
import com.example.flexible_talk.auth_login.provider.auth.AuthProvider;

import java.io.IOException;
import java.util.Objects;

import retrofit2.Response;

public class LoginFragment extends Fragment {

    private final AuthProvider provider = new AuthProvider();
    private final AsyncExecutor executor = new AsyncExecutor();

    FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        binding.buttonEnter.setOnClickListener(view -> {
            String email = binding.inputEmail.getInputText();
            String password = binding.inputPassword.getInputText();

            final UserLogin userLogin = new UserLogin(email, password);

            executor.execute(new AsyncExecutor.AsyncExecutable() {

                private Response<Token> response;
                @Override
                public void doInBackground() {
                    response = provider.login(userLogin);

                }

                @Override
                public void doInUiThread() {
                    if (response != null && response.isSuccessful()) {
                        Toast.makeText(getContext(), response.body().token, Toast.LENGTH_SHORT).show();
                    } else {
                        try {
                            Toast.makeText(getContext(), response.errorBody().string(), Toast.LENGTH_SHORT).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            });
        });

        binding.buttonEnter.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), MainScreenActivity.class));
            requireActivity().finish();
        });


        return binding.getRoot();
    }
}