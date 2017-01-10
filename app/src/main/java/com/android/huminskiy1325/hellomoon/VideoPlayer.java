package com.android.huminskiy1325.hellomoon;

import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by cubru on 09.01.2017.
 */

public class VideoPlayer {

    private final String mVideoPath = "android.resource://com.android.huminskiy1325.hellomoon/" +R.raw.apollo_17_stroll;
   // private Uri resourceUri = Uri.parse("android.resource://" + "com.android.huminskiy1325.hellomoon/raw/apollo_17_stroll");
    private Uri resourceUri = Uri.parse("android.resource://" + "com.android.huminskiy1325.hellomoon/raw/apollo_17_stroll");
    private VideoView mVideoView;

    public void play_video() {

        if (mVideoView == null) {
           // mVideoView.setVideoPath(mVideoPath);
            mVideoView.setVideoURI(Uri.parse("android.resource://com.android.huminskiy1325.hellomoon"+ R.raw.apollo_17_stroll));
            mVideoView.setMediaController(null);
            mVideoView.start();
        }
        else
            mVideoView.stopPlayback();

    }
}
