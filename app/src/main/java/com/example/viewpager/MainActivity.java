package com.example.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentCollectionAdapter adapter;
    private CircleIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        indicator =(CircleIndicator)findViewById(R.id.indicator);
        adapter = new FragmentCollectionAdapter(this);
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);

    }
}
