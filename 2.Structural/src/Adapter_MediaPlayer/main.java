package Adapter_MediaPlayer;

import Adapter_MediaPlayer.Adapter.AudioPlayer;

public class main {
    //Client
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
