package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class zorros extends AppCompatActivity {
Button button_zorro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zorros);
        button_zorro = (Button) findViewById(R.id.button_zorro);
        button_zorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(zorros.this,zorroinfo.class);
                startActivity(q);
            }
        });
    }
}