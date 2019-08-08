package com.upepchi.survivalguide;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class Calendar_Full_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar__full_1);
        getSupportActionBar().hide();

        ImageView imgview = findViewById(R.id.calendar_full1);
        Drawable bitmap = getResources().getDrawable(R.drawable.uplb_academic_calendar1);
        imgview.setImageDrawable(bitmap);

        PhotoViewAttacher imgAttacher = new PhotoViewAttacher(imgview);
        imgAttacher.update();
    }
}
