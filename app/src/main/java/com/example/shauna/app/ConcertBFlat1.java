package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertBFlat1 extends AppCompatActivity {
    private Button PlayCSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_bflat1);

        final MediaPlayer playC= MediaPlayer.create(this,R.raw.cs);
        PlayCSound=(Button)this.findViewById(R.id.PlayCSound);
        PlayCSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playC.start();

            }
        });
    }
}
