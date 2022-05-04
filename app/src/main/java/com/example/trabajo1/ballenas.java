package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ballenas extends AppCompatActivity {
    Button button_ballenas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ballenas);
        button_ballenas = (Button) findViewById(R.id.button_ballena);
        button_ballenas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ballenas.this, ballenainfo.class);
                startActivity(j);
            }
        });

    }
}