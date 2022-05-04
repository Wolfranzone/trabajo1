package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class elefantes extends AppCompatActivity {
    Button button_elefante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elefantes);
        button_elefante = (Button) findViewById(R.id.button_elefante);
        button_elefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(elefantes.this, elefanteinfo.class);
                startActivity(k);
            }
        });

    }
}