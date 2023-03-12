package com.example.flexible_talk.activities_and_their_logics.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.flexible_talk.R;
import com.example.flexible_talk.activities_and_their_logics.fragments.ChatFragment;
import com.example.flexible_talk.activities_and_their_logics.fragments.HomeFragment;
import com.example.flexible_talk.activities_and_their_logics.fragments.RegistrationFragment;
import com.example.flexible_talk.activities_and_their_logics.fragments.SearchFragment;
import com.example.flexible_talk.databinding.ActivityMainScreenBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainScreenActivity extends AppCompatActivity {

    ActivityMainScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);


        Button button_to_profile = findViewById(R.id.button_to_profile);
        button_to_profile.setOnClickListener(v -> startActivity(new Intent(MainScreenActivity.this, ProfileActivity.class)));

        Button button_to_nots = findViewById(R.id.button_to_notification);
        button_to_nots.setOnClickListener(v -> startActivity(new Intent(MainScreenActivity.this, NotificationActivity.class)));


//        Bitmap pp = (Bitmap) getIntent().getParcelableExtra("pp");
//        ImageView imageView = findViewById(R.id.profile_picture);
//        imageView.setImageBitmap(pp);
        Uri pp = getIntent().getParcelableExtra("pp");
        ImageView profile_picture = findViewById(R.id.profile_picture);
        profile_picture.setImageURI(pp);


        loadFragment(new HomeFragment());

        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.home:
                    fragment = new HomeFragment();
                    break;
                case R.id.search:
                    fragment = new SearchFragment();
                    break;
                case R.id.chat:
                    fragment = new ChatFragment();
                    break;
            }

            return loadFragment(fragment);
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.page, fragment).commit();
            return true;
        }
        return false;
    }

}