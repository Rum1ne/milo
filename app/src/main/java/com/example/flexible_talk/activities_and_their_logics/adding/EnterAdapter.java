package com.example.flexible_talk.activities_and_their_logics.adding;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.flexible_talk.activities_and_their_logics.fragments.LoginFragment;
import com.example.flexible_talk.activities_and_their_logics.fragments.RegistrationFragment;

public class EnterAdapter extends FragmentPagerAdapter {
    final Fragment[] fragments = new Fragment[2];

    public EnterAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0] = new LoginFragment();
        fragments[1] = new RegistrationFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    public CharSequence getPageTitle(int position) {
        return position == 0 ? "Авторизация" : "Регистрация";
    }
}
