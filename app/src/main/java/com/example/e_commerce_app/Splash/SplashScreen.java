package com.example.e_commerce_app.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.e_commerce_app.R;
import com.example.e_commerce_app.login.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView view = findViewById(R.id.splashLogo);

        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 4 seconds
                    sleep(4*1000);

                    Intent intent=new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(intent);
                    finish();

                    //Remove activity
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        // start thread
        background.start();
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.side_slide);
        view.startAnimation(myanim);

    }
}