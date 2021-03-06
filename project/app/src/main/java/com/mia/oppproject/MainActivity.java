package com.mia.oppproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mia.oppproject.Adapter.AdapterActivity;
import com.mia.oppproject.Command.CommandActivity;
import com.mia.oppproject.Proxy.ProxyActivity;
import com.mia.oppproject.State.StateActivity;
import com.mia.oppproject.Strategy.StrategyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(Pattern.PROXY);
    }

    public void startActivity(int type) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        switch (type) {
            case Pattern.STRATEGY:
                intent = new Intent(getApplicationContext(), StrategyActivity.class);
                break;
            case Pattern.STATE:
                intent = new Intent(getApplicationContext(), StateActivity.class);
                break;
            case Pattern.COMMAND:
                intent = new Intent(getApplicationContext(), CommandActivity.class);
                break;
            case Pattern.ADAPTER:
                intent = new Intent(getApplicationContext(), AdapterActivity.class);
                break;
            case Pattern.PROXY:
                intent = new Intent(getApplicationContext(), ProxyActivity.class);
                break;
        }
        startActivity(intent);
    }
}