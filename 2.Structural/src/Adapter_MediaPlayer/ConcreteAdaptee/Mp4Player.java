package Adapter_MediaPlayer.ConcreteAdaptee;

import Adapter_MediaPlayer.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    //Concrete Adaptee
    @Override
    public void playVlc(String fileName) {
        // TODO Auto-generated method stub

    }

    @Override
    public void playMp4(String fileName) {
        // TODO Auto-generated method stub
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
