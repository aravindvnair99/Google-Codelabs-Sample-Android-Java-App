package com.firebaseapp.aravindvnair99.samplejavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber() {
        TextView randomView = findViewById(R.id.textview_random);
        TextView headingView = findViewById(R.id.textview_label);
        int count = getIntent().getIntExtra(TOTAL_COUNT, 0);
        Random random = new Random();
        AtomicInteger randomInt = new AtomicInteger();
        if (count > 0) {
            randomInt.set(random.nextInt(count));
        }
        randomView.setText(String.format(Locale.getDefault(), "%d", randomInt.get()));
        headingView.setText(getString(R.string.random_heading, count));
    }
}
