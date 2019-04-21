package com.lone.soulmatedating;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.facebook.login.LoginManager;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.lone.soulmatedating.Accounts.Login_A;
import com.lone.soulmatedating.Accounts.Login_Phone_A;

import java.util.Arrays;

public class Next extends AppCompatActivity {

    private Button next;

    //-- ad purpose
    private InterstitialAd mInterstitialAd;
    private boolean showAdd = true;
    private int buttonpressed = 0;

    public CustomProgressBar customProgressBar;
    private boolean showLoadingBar = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_next);

        next = (Button)findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (mInterstitialAd.isLoaded() && showAdd) {


                    mInterstitialAd.show();

                }else {

                    Log.d("TAG", "The interstitial wasn't loaded yet.");

                    startActivity(new Intent(Next.this, Login_A.class));
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                    finish();

                }
            }
        });

        //--ad purpose
        MobileAds.initialize(Next.this, getResources().getString(R.string.admob_app_id));
        mInterstitialAd = new InterstitialAd(Next.this);
        mInterstitialAd.setAdUnitId(getString(R.string.my_Interstitial_Add_2));
        mInterstitialAd.loadAd(new AdRequest.Builder()
                .addTestDevice("547BABAE3AB2FE105C08D5339A13F684")
                .build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {


            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {


                startActivity(new Intent(Next.this, Login_A.class));
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                finish();

            }
        });


        //------------------

        //--custom loading bar area

        customProgressBar = new CustomProgressBar(Next.this);
        customProgressBar.show();
        stopLoadingBar();


        //---------
    }

    private void stopLoadingBar(){

        if(!showLoadingBar){

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    customProgressBar.hide();
                    //Toast.makeText(Matched_Activity.this, "No match found!", Toast.LENGTH_LONG).show();

                }
            }, 5000);

            showLoadingBar = true;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
