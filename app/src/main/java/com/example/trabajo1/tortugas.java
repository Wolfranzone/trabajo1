package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tortugas extends AppCompatActivity {
    Button button_tortuga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tortugas);
        button_tortuga = (Button) findViewById(R.id.button_tortuga);
        button_tortuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(tortugas.this,tortugainfo.class);
                startActivity(o);
            }
        });
    }
}