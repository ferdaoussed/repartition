package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity12 extends AppCompatActivity {
    private Button button12,button12_1,button12_2,button12_3,button12_4,button12_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity12_1();
            }
        });
        button12_1 = (Button) findViewById(R.id.button12_1);
        button12_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity12_2(); }});

        button12_2 = (Button) findViewById(R.id.button12_2);
        button12_2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) { openActivity12_3(); }});

          button12_3 = (Button) findViewById(R.id.button12_3);
          button12_3.setOnClickListener(new View.OnClickListener() {
         @Override
          public void onClick(View v) { openActivity12_4(); }});

        button12_4 = (Button) findViewById(R.id.button12_4);
        button12_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity12_5(); }});

        button12_5 = (Button) findViewById(R.id.button12_5);
        button12_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity12_6(); }});


    }
    public void openActivity12_1() {
        Intent intent = new Intent(this, Activity12_1.class);
        startActivity(intent);
    }
    public void openActivity12_2() {
        Intent intent = new Intent(this, Activity12_2.class);
        startActivity(intent);
    }
    public void openActivity12_3() {
        Intent intent = new Intent(this, Activity_13.class);
        startActivity(intent);
    }
    public void openActivity12_4() {
        Intent intent = new Intent(this, Activity_14.class);
        startActivity(intent);
    }
    public void openActivity12_5() {
        Intent intent = new Intent(this, Activity_15.class);
        startActivity(intent);
    }
    public void openActivity12_6() {
        Intent intent = new Intent(this, Activity_16.class);
        startActivity(intent);
    }
}
