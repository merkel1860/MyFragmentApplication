package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_friend);
        TextView textView = findViewById(R.id.button_add);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        textView.setText(currentDateTimeString);
    }
}