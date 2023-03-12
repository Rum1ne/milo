package com.example.flexible_talk.activities_and_their_logics.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import com.example.flexible_talk.R;
import com.example.flexible_talk.activities_and_their_logics.adding.Not;
import com.example.flexible_talk.activities_and_their_logics.adding.NotsAdapter;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    ArrayList<Not> nots = new ArrayList<>();
    private String name = "unknown";
    private int pp = R.drawable.person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button return_button = findViewById(R.id.button_to_return);
        return_button.setOnClickListener(v -> finish());

        setInitialNots();
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.nots_list);

        NotsAdapter adapter = new NotsAdapter(getLayoutInflater(), nots);
        recyclerView.setAdapter(adapter);

    }



    private void setInitialNots() {
        for (int i = 0; i < 25; ++i) {
            nots.add(new Not(name, pp, Not.getRandomDoing()));
        }

    }
}