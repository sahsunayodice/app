package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertBFlat4 extends AppCompatActivity {
    private Button MajorBbSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_bflat4);

        final MediaPlayer playBb= MediaPlayer.create(this,R.raw.bs);
        MajorBbSound=(Button)this.findViewById(R.id.Tuner);
        MajorBbSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBb.start();

            }
        });
    }
}
