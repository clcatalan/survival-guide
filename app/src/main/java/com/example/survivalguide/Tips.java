package com.example.survivalguide;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        getSupportActionBar().hide();
    }

    public void onClick (View view) {

        switch (view.getId()) {
            case (R.id.tq1):
                TextView tview1 = findViewById(R.id.tqa1);
                if (tview1.getVisibility() == View.GONE)
                    tview1.setVisibility(View.VISIBLE);
                else
                    tview1.setVisibility(View.GONE);
                break;
            case (R.id.tq2):
                TableLayout tview2 = findViewById(R.id.tqa2);
                if (tview2.getVisibility() == View.GONE)
                    tview2.setVisibility(View.VISIBLE);
                else
                    tview2.setVisibility(View.GONE);
                break;
            case (R.id.tq3):
                TableLayout tview3 = findViewById(R.id.tqa3);
                if (tview3.getVisibility() == View.GONE)
                    tview3.setVisibility(View.VISIBLE);
                else
                    tview3.setVisibility(View.GONE);
                break;
            case (R.id.tq4):
                TextView tview4 = findViewById(R.id.tqa4);
                if (tview4.getVisibility() == View.GONE)
                    tview4.setVisibility(View.VISIBLE);
                else
                    tview4.setVisibility(View.GONE);
                break;
            case (R.id.tq5):
                TextView tview5 = findViewById(R.id.tqa5);
                if (tview5.getVisibility() == View.GONE)
                    tview5.setVisibility(View.VISIBLE);
                else
                    tview5.setVisibility(View.GONE);
                break;
            case (R.id.tq6):
                TextView tview6 = findViewById(R.id.tqa6);
                if (tview6.getVisibility() == View.GONE)
                    tview6.setVisibility(View.VISIBLE);
                else
                    tview6.setVisibility(View.GONE);
                break;
            case (R.id.tq7):
                TextView tview7 = findViewById(R.id.tqa7);
                if (tview7.getVisibility() == View.GONE)
                    tview7.setVisibility(View.VISIBLE);
                else
                    tview7.setVisibility(View.GONE);
                break;
            case (R.id.tq8):
                TextView tview8 = findViewById(R.id.tqa8);
                if (tview8.getVisibility() == View.GONE)
                    tview8.setVisibility(View.VISIBLE);
                else
                    tview8.setVisibility(View.GONE);
                break;
            case (R.id.tq9):
                TextView tview9 = findViewById(R.id.tqa9);
                if (tview9.getVisibility() == View.GONE)
                    tview9.setVisibility(View.VISIBLE);
                else
                    tview9.setVisibility(View.GONE);
                break;
            case (R.id.tq10):
                TextView tview10 = findViewById(R.id.tqa10);
                if (tview10.getVisibility() == View.GONE)
                    tview10.setVisibility(View.VISIBLE);
                else
                    tview10.setVisibility(View.GONE);
                break;
            case (R.id.tq11):
                TextView tview11 = findViewById(R.id.tqa11);
                if (tview11.getVisibility() == View.GONE)
                    tview11.setVisibility(View.VISIBLE);
                else
                    tview11.setVisibility(View.GONE);
                break;
        }
    }
}
