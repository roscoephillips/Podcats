package com.example.android.podcats;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Context context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View trackItemView = convertView;
        if (trackItemView == null) {
            trackItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tracklist_item, parent, false);
        }

        Track currentTrack = getItem(position);

        //Finds Textview in the tracklist with the ID podcast_title.
        TextView podcastTitleTextView = (TextView) trackItemView.findViewById(R.id.podcast_title);
        podcastTitleTextView.setText(currentTrack.getPodcastTitle());

        //Finds Textview in the tracklist with the ID podcast_episode.
        TextView episodeNameTextView = (TextView) trackItemView.findViewById(R.id.podcast_episode);
        episodeNameTextView.setText((currentTrack.getPodcastEpisode()));


        //Finds ImageView in the tracklist with the ID podcast_thumbnail.
        ImageView podcastThumbnail = (ImageView) trackItemView.findViewById(R.id.podcast_thumbnail);

        //Gets the image resource ID from currentTrack object and sets as podcast's image.
        podcastThumbnail.setImageResource(currentTrack.getPodcastImageResId());

        return trackItemView;
    }
}
