package com.example.android.podcats;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.podcats.MainActivity.EPISODE_TITLE;
import static com.example.android.podcats.MainActivity.PODCAST_TITLE;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.podcast_now_playing);

        //Toolbar button to go back to previous activity.
        Toolbar myToolbar = (Toolbar) findViewById(R.id.now_playing_toolbar);
        myToolbar.setTitle(getString(R.string.now_playing));
        myToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

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



