package com.yhc.adapter;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 20:53
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {
        if ("vlc".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new VlcPlayer();
        } else if ("mp4".equalsIgnoreCase(type)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String type, String file) {
        if ("vlc".equalsIgnoreCase(type)) {
            advancedMediaPlayer.playVlc(file);
        } else if ("mp4".equalsIgnoreCase(type)) {
            advancedMediaPlayer.playMp4(file);
        }
    }
}
