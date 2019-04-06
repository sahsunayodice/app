package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertEFlat1 extends AppCompatActivity {
    private Button MajorFSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_eflat1);

        final MediaPlayer playF= MediaPlayer.create(this,R.raw.fs);
        MajorFSound=(Button)this.findViewById(R.id.MajorFSound);
        MajorFSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playF.start();

            }
        });
    }
}
