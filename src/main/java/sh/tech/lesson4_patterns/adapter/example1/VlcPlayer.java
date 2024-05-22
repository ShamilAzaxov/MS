package sh.tech.lesson4_patterns.adapter.example1;

public class VlcPlayer implements VlcMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
