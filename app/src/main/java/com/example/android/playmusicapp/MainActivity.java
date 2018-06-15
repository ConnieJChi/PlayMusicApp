package com.example.android.playmusicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = MediaPlayer.create(this, R.raw.crazy);
    }



    public void onClickStart(View v) {
        m.start();
    }

    public void onClickPause(View v) {
        m.pause();
    }
}
