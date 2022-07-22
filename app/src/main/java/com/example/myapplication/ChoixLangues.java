package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoixLangues extends AppCompatActivity {
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choix_langues);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this, FrMatieres.class);
        intent.putExtra("langue","ar");
        startActivity(intent);
    }
    public void openActivity4() {
        Intent intent = new Intent(this, ArMatieres.class);
        intent.putExtra("langue","fr");
        startActivity(intent);
    }
}