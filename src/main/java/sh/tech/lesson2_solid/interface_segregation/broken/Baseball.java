package sh.tech.lesson2_solid.interface_segregation.broken;

public class Baseball implements Sport{

    @Override
    public void playTennis() {

    }

    @Override
    public void playFootball() {

    }

    @Override
    public void playBaseball() {
        System.out.println("Player plays baseball");

    }
}
