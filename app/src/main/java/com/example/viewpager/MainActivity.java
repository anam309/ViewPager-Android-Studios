package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initviewpager();
    }

    private void initviewpager() {
        viewpager=findViewById(R.id.studentviewpager);
        tabLayout=findViewById(R.id.studenttablayout);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new FragmentA(),"Fragment A");
        viewPagerAdapter.AddFragment(new FragmentB(),"Fragment B");
        viewPagerAdapter.AddFragment(new FragmentC(),"Fragment C");
        viewPagerAdapter.AddFragment(new FragmentD(),"Fragment D");
        viewpager.setOffscreenPageLimit(viewPagerAdapter.getCount());

        viewpager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewpager);
    }
}