package sh.tech.lesson2_solid.interface_segregation.broken;

public class Tennis implements Sport{
    @Override
    public void playTennis() {
        System.out.println("Player plays tennis");
    }

    @Override
    public void playFootball() {

    }

    @Override
    public void playBaseball() {

    }
}
