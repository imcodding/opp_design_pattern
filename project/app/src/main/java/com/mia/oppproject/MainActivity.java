package com.mia.oppproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mia.oppproject.Strategy.StrategyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(Pattern.STRATEGY);
    }

    public void startActivity(int type) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        switch (type) {
            case Pattern.STRATEGY:
                intent = new Intent(getApplicationContext(), StrategyActivity.class);
                break;
        }
        startActivity(intent);
    }
}