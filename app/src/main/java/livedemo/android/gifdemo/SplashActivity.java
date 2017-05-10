package livedemo.android.gifdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private GifWebView gifWebView;
    private static int SPLASH_TIME_OUT = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();



        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                gifWebView = (GifWebView) findViewById(R.id.GifImageView);
                gifWebView.setGifImageResource(R.drawable.ic_splash);
                startActivity(new Intent(SplashActivity.this,MainActivity.class));

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
