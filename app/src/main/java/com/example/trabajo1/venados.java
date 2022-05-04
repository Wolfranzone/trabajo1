package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class venados extends AppCompatActivity {
Button button_venado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venados);
        button_venado = (Button) findViewById(R.id.button_venado);
        button_venado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(venados.this,venadoinfo.class);
                startActivity(p);
            }
        });
    }
}