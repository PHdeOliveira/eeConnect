package com.learn.eeConnect;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;


public class LogoSplash extends Activity {
    private static final int SPLASH_DISPLAY_TIME = 500; // splash screen delay time

    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.logo);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(LogoSplash.this, NewActivity.class);

                LogoSplash.this.startActivity(intent);
                LogoSplash.this.finish();

                // transition from splash to main menu
                overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);

            }
        }, SPLASH_DISPLAY_TIME);
    }
}