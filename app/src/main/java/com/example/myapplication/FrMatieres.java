package com.example.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrMatieres extends AppCompatActivity {
    private Button button1_2,button1_3,button1_01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fr_matieres);
        button1_2 = (Button) findViewById(R.id.button1_2);
        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
            }
        });
        button1_3 = (Button) findViewById(R.id.button1_3);
        button1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity10();
            }
        });
        button1_01 = (Button) findViewById(R.id.button1_01);
        button1_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity11();
            }
        });
    }
    public void openActivity9() {
        Intent intent = new Intent(this, FrUnites.class);
        startActivity(intent);
    }
    public void openActivity10() {
        Intent intent = new Intent(this, Activity10.class);
        startActivity(intent);
    }
    public void openActivity11() {
        Intent intent = new Intent(this, Activity11.class);
        startActivity(intent);
    }
    }


