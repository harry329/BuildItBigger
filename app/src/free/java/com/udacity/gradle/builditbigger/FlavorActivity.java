package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.androidjokedisplay.JokeDisplayActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

;

public class FlavorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
    }

    public void tellJoke(View view) {
        Intent intent = getIntent();
        String joke = intent.getStringExtra("JOKE");
        Intent jokeIntent = new Intent(this, JokeDisplayActivity.class);
        jokeIntent.putExtra("JOKE", joke + " free");
        startActivity(jokeIntent);
        finish();
    }
}
