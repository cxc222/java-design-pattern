package com.yhc.adapter;

/**
 * @author zff (cxc222)
 * @create 2020-01-16 20:49
 */
public class Application {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("vlc", "钢铁侠.vlc");
        player.play("mp4", "周杰伦.mp4");
        player.play("avi", "老师.avi");
    }
}
