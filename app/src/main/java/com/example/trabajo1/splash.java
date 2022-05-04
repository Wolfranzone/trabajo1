package com.example.trabajo1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {
    ImageView imageView,imageView2,rino;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask tarea=new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo=new Timer();
        tiempo.schedule(tarea, 5000);


        //animacion
        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        rino=findViewById(R.id.rino);
        lottieAnimationView=findViewById(R.id.rino);


        rino.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        imageView.animate().translationY(1700).setDuration(1000).setStartDelay(4000);
        imageView2.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
    }
}
