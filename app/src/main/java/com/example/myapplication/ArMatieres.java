package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArMatieres extends AppCompatActivity {
    private Button button2_1,button2_2,button2_3,button2_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ar_matieres);

        button2_1 = (Button) findViewById(R.id.button2_1);
        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        button2_2 = (Button) findViewById(R.id.button2_2);
        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });

        button2_3 = (Button) findViewById(R.id.button2_3);
        button2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
            }
        });
        button2_4 = (Button) findViewById(R.id.button2_4);
        button2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });

    }

    public void openActivity5() {
        Intent intent = new Intent(this, ArUnites.class);

        startActivity(intent);
    }
    public void openActivity6() {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }
    public void openActivity7() {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }
    public void openActivity8() {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }


}