package com.example.android.miwok;

public class Song {

    private String mSongTime;
    private String mSongName;


    public Song(String song, String time) {

        mSongName = song;
        mSongTime = time;

    }

    public String getSongTime() {
        return mSongTime;
    }

    public String getSongName() {
        return mSongName;
    }


}
