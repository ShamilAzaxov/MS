package sh.tech.lesson4_patterns.adapter.example1;

public class Mp4Player implements Mp4MediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}