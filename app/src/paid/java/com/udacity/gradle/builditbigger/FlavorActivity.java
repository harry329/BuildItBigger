package com.udacity.gradle.builditbigger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import com.example.androidjokedisplay.JokeDisplayActivity;


public class FlavorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("JOKE");
        Intent jokeIntent = new Intent(this, JokeDisplayActivity.class);
        jokeIntent.putExtra("JOKE", joke + " paid");
        startActivity(jokeIntent);
        finish();
    }
}
