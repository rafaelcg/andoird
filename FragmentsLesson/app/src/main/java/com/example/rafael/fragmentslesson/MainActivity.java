package com.example.rafael.fragmentslesson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements topSectionFragment.TopSectionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void createMeme(String top, String bottom) {
        bottomPictureFragment bottomFragment = (bottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setMemeText(top, bottom);
    }
}
