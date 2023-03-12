package com.example.flexible_talk.activities_and_their_logics.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.flexible_talk.activities_and_their_logics.adding.EnterAdapter;
import com.example.flexible_talk.databinding.ActivityEnterBinding;

public class EnterActivity extends AppCompatActivity {

    ActivityEnterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Thread(()-> {
            try {
                Thread.sleep(600);
                runOnUiThread(() -> {
                    binding.movingPart.setVisibility(View.VISIBLE);
                });
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        binding.page.setAdapter(new EnterAdapter(getSupportFragmentManager()));
        binding.tabs.setupWithViewPager(binding.page);
    }
}