package Adapter_MediaPlayer;

public class main {
    //Client
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer(); //Concrete Adapter

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
