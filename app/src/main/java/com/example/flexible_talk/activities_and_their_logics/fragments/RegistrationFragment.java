package com.example.flexible_talk.activities_and_their_logics.fragments;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.flexible_talk.R;
import com.example.flexible_talk.activities_and_their_logics.activities.MainActivity;
import com.example.flexible_talk.activities_and_their_logics.activities.MainScreenActivity;
import com.example.flexible_talk.auth_login.model.request.UserRegister;
import com.example.flexible_talk.databinding.FragmentRegistrationBinding;

import java.io.ByteArrayOutputStream;
import java.util.Objects;

public class RegistrationFragment extends Fragment {

    FragmentRegistrationBinding binding;
    private final int PickImage = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false);
        binding.registrationButton.setOnClickListener(view -> {
            final String email = binding.inputEmailRegistration.getInputText();
            final String password = binding.inputPasswordRegistration.getInputText();
            final String repeatPassword = binding.repeatPassword.getInputText();
            final String nickName = binding.nickname.getInputText();
            if (!password.equals(repeatPassword)) {
                return;
            }
            final UserRegister userRegister = new UserRegister(email, password, nickName);

        });

        binding.registrationButton.setOnClickListener(v -> {
            startActivity(new Intent(getContext(), MainActivity.class));
            requireActivity().finish();
        });

        binding.buttonToChangePp.setOnClickListener(v -> {
            Intent photoIntent = new Intent(Intent.ACTION_PICK);
            photoIntent.setType("image/*");
            startActivityForResult(photoIntent, PickImage);
        });

        return binding.getRoot();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case PickImage:
                if (resultCode == RESULT_OK) {
                    Uri image = data.getData();
                    if (image != null) {
                        binding.profilePicture.setImageURI(image);
                        Intent intent = new Intent(getContext(), MainScreenActivity.class);
                        intent.putExtra("pp", image);
                    }
                }

        }
    }
}

