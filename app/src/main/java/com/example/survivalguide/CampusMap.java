package com.example.survivalguide;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class CampusMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_map);
        getSupportActionBar().hide();

        OrientationEventListener orientationListener = new OrientationEventListener(getApplicationContext()) {
            @Override
            public void onOrientationChanged(int i) {
                if (i == 0 || i == 180)
                    setContentView(R.layout.activity_campus_map);
                else if (i == 90 || i == 270) {
                    setContentView(R.layout.activity_map_full);
                    ImageView imgView = findViewById(R.id.campus_map);
                    Drawable bitmap = getResources().getDrawable(R.drawable.uplb_campus_map);
                    imgView.setImageDrawable(bitmap);

                    PhotoViewAttacher imgAttacher = new PhotoViewAttacher(imgView);
                    imgAttacher.update();
                }
            }
        };

        if (orientationListener.canDetectOrientation())
            orientationListener.enable();

    }

}
