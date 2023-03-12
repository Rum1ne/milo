package com.example.flexible_talk.activities_and_their_logics.activities;

import static com.example.flexible_talk.activities_and_their_logics.activities.Hints.hints1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.flexible_talk.R;
import com.example.flexible_talk.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    public int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.hints.setText(hints1[c]);

        binding.hintsButton.setOnClickListener(v -> {
            switch (v.getId()) {
                case R.id.hints_button:
                    if (c == 1) {
                        startActivity(new Intent(MainActivity.this, MainScreenActivity.class));
                        finish();
                    } else {
                        ++c;
                        binding.hints.setText(hints1[c]);
                    }
                    break;
            }
        });
    }
}