package com.example.flexible_talk.activities_and_their_logics.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.flexible_talk.databinding.ActivityGreetingBinding;

public class GreetingActivity extends AppCompatActivity {
    ActivityGreetingBinding binding;
    public int k = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGreetingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        startActivity(new Intent(getContext(), MainScreenActivity.class));

//        binding.greetingHint0.setText(hints2[0]);
//        binding.greetingHint1.setText(hints2[1]);
//        binding.greetingHint2.setText(hints2[2]);
//        binding.greetingHint3.setText(hints2[3]);
//        binding.greetingHint4.setText(hints2[4]);
//        binding.greetingHint5.setText(hints2[5]);
//        binding.greetingHint6.setText(hints2[6]);
//
//        binding.greetingHint0.setVisibility(View.VISIBLE);
//        binding.arrow0.setVisibility(View.VISIBLE);
//
//        binding.buttonForGreetingHints.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.button_for_greeting_hints:
//                        ++k;
//                        if (k == hints2.length) {
//                            binding.greetingHint6.setVisibility(View.GONE);
//                            binding.arrow6.setVisibility(View.GONE);
//                        } else {
//                            switch (k) {
//                                case 1:
//                                    binding.greetingHint0.setVisibility(View.GONE);
//                                    binding.arrow0.setVisibility(View.GONE);
//                                    binding.greetingHint1.setVisibility(View.VISIBLE);
//                                    binding.arrow1.setVisibility(View.VISIBLE);
//                                    break;
//                                case 2:
//                                    binding.greetingHint1.setVisibility(View.GONE);
//                                    binding.arrow1.setVisibility(View.GONE);
//                                    binding.greetingHint2.setVisibility(View.VISIBLE);
//                                    binding.arrow2.setVisibility(View.VISIBLE);
//                                    break;
//                                case 3:
//                                    binding.greetingHint2.setVisibility(View.GONE);
//                                    binding.arrow2.setVisibility(View.GONE);
//                                    binding.greetingHint3.setVisibility(View.VISIBLE);
//                                    binding.arrow3.setVisibility(View.VISIBLE);
//                                    break;
//                                case 4:
//                                    binding.greetingHint3.setVisibility(View.GONE);
//                                    binding.arrow3.setVisibility(View.GONE);
//                                    binding.greetingHint4.setVisibility(View.VISIBLE);
//                                    binding.arrow4.setVisibility(View.VISIBLE);
//                                    break;
//                                case 5:
//                                    binding.greetingHint4.setVisibility(View.GONE);
//                                    binding.arrow4.setVisibility(View.GONE);
//                                    binding.greetingHint5.setVisibility(View.VISIBLE);
//                                    binding.arrow5.setVisibility(View.VISIBLE);
//                                    break;
//                                case 6:
//                                    binding.greetingHint5.setVisibility(View.GONE);
//                                    binding.arrow5.setVisibility(View.GONE);
//                                    binding.greetingHint6.setVisibility(View.VISIBLE);
//                                    binding.arrow6.setVisibility(View.VISIBLE);
//                                    break;
//                            }
//                        }
//                        break;
//                }
//            }
//       });

   }
}