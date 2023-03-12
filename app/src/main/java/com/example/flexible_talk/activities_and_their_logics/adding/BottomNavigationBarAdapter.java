package com.example.flexible_talk.activities_and_their_logics.adding;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.flexible_talk.activities_and_their_logics.fragments.ChatFragment;
import com.example.flexible_talk.activities_and_their_logics.fragments.HomeFragment;
import com.example.flexible_talk.activities_and_their_logics.fragments.SearchFragment;

public class BottomNavigationBarAdapter extends FragmentPagerAdapter {
    final Fragment[] fragments = new Fragment[3];

    public BottomNavigationBarAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0] = new HomeFragment();
        fragments[1] = new SearchFragment();
        fragments[2] = new ChatFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }


}
