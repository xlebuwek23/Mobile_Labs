package com.example.labs;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labs.Work10.Work10Activity;
import com.example.labs.Work11.Work11Activity;
import com.example.labs.Work12.Work12Activity;
import com.example.labs.Work13.Work13Activity;
import com.example.labs.Work14.Work14Activity;
import com.example.labs.Work9.Work9Activity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button9).setOnClickListener(view -> openActivity(Work9Activity.class));
        findViewById(R.id.button10).setOnClickListener(view -> openActivity(Work10Activity.class));
        findViewById(R.id.button11).setOnClickListener(view -> openActivity(Work11Activity.class));
        findViewById(R.id.button12).setOnClickListener(view -> openActivity(Work12Activity.class));
        findViewById(R.id.button13).setOnClickListener(view -> openActivity(Work13Activity.class));
        findViewById(R.id.button14).setOnClickListener(view -> openActivity(Work14Activity.class));
        findViewById(R.id.button15).setOnClickListener(view -> openActivity(Work15Activity.class));
    }

    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(MainActivity.this, activityClass);
        startActivity(intent);
    }
}
