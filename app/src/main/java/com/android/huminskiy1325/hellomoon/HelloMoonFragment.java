package com.android.huminskiy1325.hellomoon;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

/**
 * Created by cubru on 08.01.2017.
 */

public class HelloMoonFragment extends Fragment {

    private Button mButtonPlay;
    private Button mButtonStop;
    private Button mButtonPause;
    private Button mButtonVideo;
    private AudioPlayer mPlayer = new AudioPlayer();
    private VideoPlayer mVideo = new VideoPlayer();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_hello_moon, null);

        mButtonPlay = (Button) view.findViewById(R.id.hello_moonPlayButton);
        mButtonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.play(getActivity());

            }
        });

        mButtonPause = (Button) view.findViewById(R.id.hello_moonPauseButton);
        mButtonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.pause();
            }
        });

        mButtonStop = (Button) view.findViewById(R.id.hello_moonStopButton);
        mButtonStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPlayer.stop();
            }
        });

       // mVideo = (VideoView)view.findViewById(R.id.hello_moonVideo);
        mButtonVideo = (Button) view.findViewById(R.id.hello_moonVideoButton);
        mButtonVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mVideo.play_video();
            }
        });

        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPlayer.stop();
    }
}
