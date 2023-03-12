package com.example.flexible_talk.activities_and_their_logics.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flexible_talk.R;
import com.example.flexible_talk.databinding.ActivityProfileBinding;


public class ProfileActivity extends AppCompatActivity {

    ActivityProfileBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button return_button = findViewById(R.id.button_to_return);
        return_button.setOnClickListener(v -> finish());

    }
}