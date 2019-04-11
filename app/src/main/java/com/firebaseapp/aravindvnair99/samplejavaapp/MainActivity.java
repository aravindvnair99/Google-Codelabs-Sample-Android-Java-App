package com.firebaseapp.aravindvnair99.samplejavaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        Toast myToast = Toast.makeText(this, "Hey there!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view) {
        TextView showCountTextView = findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        int count = Integer.parseInt(countString);
        count++;
        showCountTextView.setText(String.format(Locale.getDefault(), "%d", count));

    }

    public void randomMe(View view) {
        Intent randomIntent = new Intent(this, SecondActivity.class);
        TextView showCountTextView = findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        int count = Integer.parseInt(countString);
        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);
    }
}