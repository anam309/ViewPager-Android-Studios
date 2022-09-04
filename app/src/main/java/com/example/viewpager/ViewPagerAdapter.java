package com.example.viewpager;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> FragmentArrayList;
    ArrayList<String> FragmentTitle;


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

        FragmentArrayList = new ArrayList<>();
        FragmentTitle = new ArrayList<>();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return FragmentArrayList.get(position);
    }


    public void AddFragment(Fragment fragment,String title) {
        FragmentArrayList.add(fragment);
        FragmentTitle.add(title);
    }

    @Override
    public int getCount() {
        return FragmentArrayList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentTitle.get(position);
    }
}
