package com.ibrahim.photographytips;


import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;


public class Zooming extends AppCompatActivity {

    private String imgId;
    InterstitialAd mInterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zooming);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3487493141935710/6836342380");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();



        Bundle extraData =getIntent().getExtras();
        if(extraData==null){

            return;
        }

        imgId=extraData.getString("imgKey");

        TouchImageView img = new TouchImageView(this);
        img.setImageResource(getResources().getIdentifier(imgId, "drawable", getPackageName()));
        img.setMaxZoom(4f);
        setContentView(img);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Zoom It");

        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.rgb(27, 24, 13));

        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:


                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }

                Intent intent = new Intent(this, TabDesign.class);
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }


    @Override
    public void onBackPressed() {

        super.onBackPressed();


        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


}
