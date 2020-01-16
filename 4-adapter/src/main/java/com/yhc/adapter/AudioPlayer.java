package com.yhc.adapter;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 20:56
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    @Override
    public void play(String type, String file) {
        if ("vlc".equalsIgnoreCase(type) || "mp4".equalsIgnoreCase(type)) {
            mediaPlayer = new MediaAdapter(type);
            mediaPlayer.play(type, file);
        } else {
            System.out.println("Invalid media. Type:" + type + "File:" + file);
        }
    }
}
