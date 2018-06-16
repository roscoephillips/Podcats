package com.example.android.podcats;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.podcats.MainActivity.EPISODE_TITLE;
import static com.example.android.podcats.MainActivity.PODCAST_ART;
import static com.example.android.podcats.MainActivity.PODCAST_TITLE;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_now_playing);

        Intent nowPlayingActivity = getIntent();
        String podcastTitle = nowPlayingActivity.getStringExtra(PODCAST_TITLE);
        String episodeTitle = nowPlayingActivity.getStringExtra(EPISODE_TITLE);
        int podcastArt = nowPlayingActivity.getIntExtra("PODCAST_ART",444);

        //Displays podcast name.
        TextView podcastTitleTextView = (TextView) findViewById(R.id.now_playing_podcast_title);
        podcastTitleTextView.setText(podcastTitle);

        //Displays episode name.
        TextView episodeTitleTextView = (TextView) findViewById(R.id.now_playing_episode_title);
        episodeTitleTextView.setText(episodeTitle);

        //Displays podcast artwork in NowPlaying.
        ImageView podcastArtImageView = (ImageView) findViewById(R.id.now_playing_thumbnail);
        podcastArtImageView.setImageResource(podcastArt);



    }
}



