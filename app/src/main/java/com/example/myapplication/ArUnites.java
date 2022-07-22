package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArUnites extends AppCompatActivity {
    private Button button5;
    String sourceUnité = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ar_unites);
        sourceUnité = getIntent().getStringExtra("SourceUnité");
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity12();
            }
        });
    }
    public void openActivity12() {
        if(sourceUnité.equals("ar")){
            Intent intent = new Intent(this, Activity12.class);
            startActivity(intent);
        }


    }
}
