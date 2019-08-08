package com.upepchi.survivalguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        getSupportActionBar().hide();

        ImageView imgview = findViewById(R.id.calendar1);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calendar.this, Calendar_Full_1.class);
                startActivity(intent);
            }
        });

        ImageView imgview2 = findViewById(R.id.calendar2);
        imgview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calendar.this, Calendar_Full_2.class);
                startActivity(intent);
            }
        });

    }
}
