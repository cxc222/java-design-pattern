package com.yhc.adapter;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 20:51
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {
        System.out.println("play vlc file " + file);
    }

    @Override
    public void playMp4(String file) {
        // do nothing
    }
}
