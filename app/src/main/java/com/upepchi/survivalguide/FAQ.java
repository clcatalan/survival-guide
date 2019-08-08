package com.upepchi.survivalguide;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        getSupportActionBar().hide();
    }

    public void onClick (View view){

        switch(view.getId())
        {
            case(R.id.q1):
                TextView tview1 = findViewById(R.id.ans1);
                if(tview1.getVisibility() == View.GONE)
                    tview1.setVisibility(View.VISIBLE);
                else
                    tview1.setVisibility(View.GONE);
                break;
            case(R.id.q2):
            TextView tview2 = findViewById(R.id.ans2);
            if(tview2.getVisibility() == View.GONE)
                tview2.setVisibility(View.VISIBLE);
            else
                tview2.setVisibility(View.GONE);
            break;
            case(R.id.q3):
                TextView tview3 = findViewById(R.id.ans3);
                if(tview3.getVisibility() == View.GONE)
                    tview3.setVisibility(View.VISIBLE);
                else
                    tview3.setVisibility(View.GONE);
                break;
            case(R.id.q4):
                TextView tview4 = findViewById(R.id.ans4);
                if(tview4.getVisibility() == View.GONE)
                    tview4.setVisibility(View.VISIBLE);
                else
                    tview4.setVisibility(View.GONE);
                break;
            case(R.id.q5):
                TextView tview5 = findViewById(R.id.ans5);
                if(tview5.getVisibility() == View.GONE)
                    tview5.setVisibility(View.VISIBLE);
                else
                    tview5.setVisibility(View.GONE);
                break;
            case(R.id.q6):
                TextView tview6 = findViewById(R.id.ans6);
                if(tview6.getVisibility() == View.GONE)
                    tview6.setVisibility(View.VISIBLE);
                else
                    tview6.setVisibility(View.GONE);
                break;
            case(R.id.q7):
                TextView tview7 = findViewById(R.id.ans7);
                if(tview7.getVisibility() == View.GONE)
                    tview7.setVisibility(View.VISIBLE);
                else
                    tview7.setVisibility(View.GONE);
                break;
            case(R.id.q8):
                TextView tview8 = findViewById(R.id.ans8);
                if(tview8.getVisibility() == View.GONE)
                    tview8.setVisibility(View.VISIBLE);
                else
                    tview8.setVisibility(View.GONE);
                break;
            case(R.id.q9):
                TextView tview9 = findViewById(R.id.ans9);
                if(tview9.getVisibility() == View.GONE)
                    tview9.setVisibility(View.VISIBLE);
                else
                    tview9.setVisibility(View.GONE);
                break;
            case(R.id.q10):
                TextView tview10 = findViewById(R.id.ans10);
                if(tview10.getVisibility() == View.GONE)
                    tview10.setVisibility(View.VISIBLE);
                else
                    tview10.setVisibility(View.GONE);
                break;
            case(R.id.q11):
                TextView tview11 = findViewById(R.id.ans11);
                if(tview11.getVisibility() == View.GONE)
                    tview11.setVisibility(View.VISIBLE);
                else
                    tview11.setVisibility(View.GONE);
                break;
            case(R.id.q12):
                TextView tview12 = findViewById(R.id.ans12);
                if(tview12.getVisibility() == View.GONE)
                    tview12.setVisibility(View.VISIBLE);
                else
                    tview12.setVisibility(View.GONE);
                break;
            case(R.id.q13):
                TextView tview13 = findViewById(R.id.ans13);
                if(tview13.getVisibility() == View.GONE)
                    tview13.setVisibility(View.VISIBLE);
                else
                    tview13.setVisibility(View.GONE);
                break;
            case(R.id.q14):
                TextView tview14 = findViewById(R.id.ans14);
                if(tview14.getVisibility() == View.GONE)
                    tview14.setVisibility(View.VISIBLE);
                else
                    tview14.setVisibility(View.GONE);
                break;
        }
    }

}
