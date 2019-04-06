package com.example.shauna.app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConcertG2 extends AppCompatActivity {
    private Button MajorGSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_g2);

        final MediaPlayer playG= MediaPlayer.create(this,R.raw.gscale);
        MajorGSound=(Button)this.findViewById(R.id.MajorGSound);
        MajorGSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playG.start();

            }
        });
    }
}
