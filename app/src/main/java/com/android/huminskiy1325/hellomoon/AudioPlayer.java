package com.android.huminskiy1325.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.VideoView;

/**
 * Created by cubru on 08.01.2017.
 */

public class AudioPlayer {

    private MediaPlayer mPlayer;
    public final static String TAG = "TAGB";

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void pause() {
        if (mPlayer != null)
            mPlayer.pause();
    }

    public void play(Context context) {
        Log.i(TAG, "BEFORE mPlayer.start()");

        if (mPlayer == null)
            mPlayer = MediaPlayer.create(context, R.raw.one_small_step);
        if (mPlayer != null) {
            if (!mPlayer.isPlaying())
                mPlayer.start();
            else
                // stop();
                mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        stop();
                    }
                });
        }

        mPlayer.start();
    }
}
