package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tigres extends AppCompatActivity {
    Button button_tigre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tigres);
        button_tigre = (Button) findViewById(R.id.button_tigre);
        button_tigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Tigres.this,tigresinfo.class);
                startActivity(n);
            }
        });
    }
}