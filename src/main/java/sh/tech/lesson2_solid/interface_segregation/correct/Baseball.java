package sh.tech.lesson2_solid.interface_segregation.correct;

public class Baseball implements BaseballInter {
    @Override
    public void playBaseball() {
        System.out.println("Player plays baseball");

    }
}
