package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_13 extends AppCompatActivity {
//semaine4
private Button button13_1,button13_2,button13_3,button13_4,button13_5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        setContentView(R.layout.activity_13);
        button13_1 = (Button) findViewById(R.id.button13_1);
        button13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity13_1();
            }
        });
        button13_2= (Button) findViewById(R.id.button13_2);
        button13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity13_2();
            }
        });
        button13_3 = (Button) findViewById(R.id.button13_3);
        button13_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity13_3();
            }
        });
        button13_4 = (Button) findViewById(R.id.button13_4);
        button13_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity13_4();
            }
        });
        button13_5 = (Button) findViewById(R.id.button13_5);
        button13_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity13_5();
            }
        });
    }
    public void openActivity13_1(){
        Intent intent = new Intent(this, Activity_13_1.class);
        startActivity(intent);
    }
    public void openActivity13_2(){
        Intent intent = new Intent(this,Activity_13_2.class);
        startActivity(intent);
    }
    public void openActivity13_3(){
        Intent intent = new Intent(this, Activity_13_3.class);
        startActivity(intent);
    }
    public void openActivity13_4(){
        Intent intent = new Intent(this, Activity_13_4.class);
        startActivity(intent);
    }
    public void openActivity13_5(){
        Intent intent = new Intent(this, Activity_13_5.class);
        startActivity(intent);
    }
}

