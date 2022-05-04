package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    //VARIABLE
    ImageButton  imageButton;
    ImageButton  imageButton2;
    ImageButton  imageButton3;
    ImageButton  imageButton4;
    ImageButton  imageButton5;
    ImageButton  imageButton6;
    ImageButton  imageButton7;
    ImageButton  imageButton8;
    ImageButton  imageButton9;


    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Trabajo1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        imageButton = (ImageButton) findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, leones.class);
                startActivity(i);
            }
        });
        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, elefantes.class);
                startActivity(a);
            }
        });
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, zorros.class);
                startActivity(b);
            }
        });
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, koalas.class);
                startActivity(c);
            }
        });
        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this, venados.class);
                startActivity(e);
            }
        });
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(MainActivity.this, tortugas.class);
                startActivity(f);
            }
        });
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this, Tigres.class);
                startActivity(g);
            }
        });
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(MainActivity.this, perros.class);
                startActivity(h);
            }
        });
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);

        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, ballenas.class);
                startActivity(j);
            }
        });


    }

        }

