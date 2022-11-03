package Adapter_MediaPlayer.Adapter;

import Adapter_MediaPlayer.AdvancedMediaPlayer;
import Adapter_MediaPlayer.MediaPlayer;
import Adapter_MediaPlayer.Adaptee.Mp4Player;
import Adapter_MediaPlayer.Adaptee.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    //Adapter
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        // TODO Auto-generated method stub
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}