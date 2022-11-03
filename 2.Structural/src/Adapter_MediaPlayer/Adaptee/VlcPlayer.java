package Adapter_MediaPlayer.Adaptee;

import Adapter_MediaPlayer.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    //ConcreteAdaptee
    @Override
    public void playVlc(String fileName) {
        // TODO Auto-generated method stub
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // TODO Auto-generated method stub

    }
}
