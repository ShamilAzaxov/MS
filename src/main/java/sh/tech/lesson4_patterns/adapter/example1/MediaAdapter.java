package sh.tech.lesson4_patterns.adapter.example1;

public class MediaAdapter implements MediaPlayer {

    VlcMediaPlayer vlcMediaPlayer;
    Mp4MediaPlayer mp4MediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            vlcMediaPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")) {
            mp4MediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            vlcMediaPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            mp4MediaPlayer.playMp4(fileName);
        }
    }
}
