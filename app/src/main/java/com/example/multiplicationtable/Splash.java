package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private static int SPLASH_SCREEN = 2500;

    Animation topAnim, bottomAnim;
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        imageView= findViewById(R.id.imageView);
        textView= findViewById(R.id.textView);

        imageView.setAnimation(topAnim);
        textView.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);



    }
}