package com.example.jokeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jTextView = (TextView)findViewById(R.id.JokeView);
        Intent in = getIntent();
        jTextView.setText(in.getStringExtra("Joke"));
    }
}
