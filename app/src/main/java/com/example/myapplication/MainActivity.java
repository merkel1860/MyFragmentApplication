package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment currentFragment = getSupportFragmentManager().
                findFragmentById(R.id.fragment_container);
        if(currentFragment == null){
            Fragment friendFragment = new FriendFragment();
            getSupportFragmentManager().
                    beginTransaction().
                    add(R.id.fragment_container,friendFragment).
                    commit();
        }
    }
}