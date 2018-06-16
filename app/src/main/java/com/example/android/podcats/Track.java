package com.example.android.podcats;


public class Track {

    // Name of podcast */
    private String mPodcastTitle;

    // Name of episode */
    private String mPodcastEpisode;

    // Drawable resource ID
    private int mPodcastImageResId;



    public Track(String vTitle, String vEpisode, int imageResId)
    {
        mPodcastTitle = vTitle;
        mPodcastEpisode = vEpisode;
        mPodcastImageResId = imageResId;
    }

    public String getPodcastTitle() {
        return mPodcastTitle;
    }

    public String getPodcastEpisode() {
        return mPodcastEpisode;
    }

    public int getPodcastImageResId() {
        return mPodcastImageResId;
    }
}
