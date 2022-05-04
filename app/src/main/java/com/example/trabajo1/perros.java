package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perros extends AppCompatActivity {
    Button button_perro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perros);
        button_perro = (Button) findViewById(R.id.button_perro);
        button_perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(perros.this,perroinfo.class);
                startActivity(m);
            }
        });

    }
}