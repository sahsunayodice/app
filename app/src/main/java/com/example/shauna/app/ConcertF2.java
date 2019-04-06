package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertF2 extends AppCompatActivity {
    private Button MajorCSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_f2);

        final MediaPlayer playC= MediaPlayer.create(this,R.raw.cs);
        MajorCSound=(Button)this.findViewById(R.id.MajorCSound);
        MajorCSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playC.start();

            }
        });
    }
}
