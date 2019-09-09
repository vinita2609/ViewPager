package com.example.viewpager;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mintent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(mintent);
                finish();
            }
        }, 2000);

     //   Toast.makeText(getApplicationContext(),".",Toast.LENGTH_SHORT).show();
    }
}
