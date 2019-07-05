package com.example.survivalguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



    }

    public void navigate(View view)
    {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.history:
                intent = new Intent(MainActivity.this, History.class);
                break;
            case R.id.calendar:
                intent = new Intent(MainActivity.this, Calendar.class);
                break;
            case R.id.map:
                intent = new Intent(MainActivity.this, CampusMap.class);
                break;
            case R.id.jargons:
                intent = new Intent(MainActivity.this, CampusJargons.class);
                break;
            case R.id.faq:
                intent = new Intent(MainActivity.this, FAQ.class);
                break;
            case R.id.tips:
                intent = new Intent(MainActivity.this, Tips.class);
                break;
        }



        //Intent intent = new Intent(MainActivity.this, History.class);
        startActivity(intent);
    }
}
