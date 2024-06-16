package com.demo.learncomputercourse;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int SPLAISH_TIMMER = 1300;
    private int pStatus = 0;
    private Handler handler = new Handler();

    static  int access$008(SplashActivity splashActivity) {
        int i = splashActivity.pStatus;
        splashActivity.pStatus = i + 1;
        return i;
    }

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() { 
            @Override 
            public void run() {
                SplashActivity.this.startActivity(new Intent(SplashActivity.this.getApplicationContext(), MainActivity.class));
                SplashActivity.this.finish();
            }
        }, this.SPLAISH_TIMMER);
        this.progressBar = (ProgressBar) findViewById(R.id.progressWheel);
        new Thread(new Runnable() { 
            @Override 
            public void run() {
                while (SplashActivity.this.pStatus <= 100) {
                    SplashActivity.this.handler.post(new Runnable() { 
                        @Override 
                        public void run() {
                            SplashActivity.this.progressBar.setProgress(SplashActivity.this.pStatus);
                        }
                    });
                    try {
                        Thread.sleep(12L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SplashActivity.access$008(SplashActivity.this);
                }
            }
        }).start();
    }
}
