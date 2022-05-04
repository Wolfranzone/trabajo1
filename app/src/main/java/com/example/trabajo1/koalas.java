package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class koalas extends AppCompatActivity {
    Button button_koala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koalas);
        button_koala = (Button) findViewById(R.id.button_koala);
        button_koala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(koalas.this, koalainfo.class);
                startActivity(l);
            }
        });
    }
    }