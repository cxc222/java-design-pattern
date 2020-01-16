package com.yhc.adapter;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 20:52
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {
        // do nothing
    }

    @Override
    public void playMp4(String file) {
        System.out.println("play mp4 file " + file);
    }
}
