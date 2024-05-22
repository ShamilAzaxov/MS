package sh.tech.lesson2_solid.interface_segregation.broken;

public class Football implements Sport{
    @Override
    public void playTennis() {

    }

    @Override
    public void playFootball() {
        System.out.println("Player plays football");

    }

    @Override
    public void playBaseball() {

    }
}
