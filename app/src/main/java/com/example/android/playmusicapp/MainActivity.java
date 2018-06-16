package com.example.android.playmusicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m = MediaPlayer.create(this, R.raw.crazy);

//        int i = R.raw.crazy;
    }



    public void onClickStart(View v) {
        Toast.makeText(MainActivity.this, "Playing!", Toast.LENGTH_SHORT).show();
        m.start();
        m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "Finished Playing!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickPause(View v) {
        Toast.makeText(MainActivity.this, "Paused", Toast.LENGTH_SHORT).show();
        m.pause();
    }
}
