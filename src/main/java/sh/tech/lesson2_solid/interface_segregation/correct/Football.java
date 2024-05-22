package sh.tech.lesson2_solid.interface_segregation.correct;

public class Football implements FootballInter {

    @Override
    public void playFootball() {
        System.out.println("Player plays football");
    }
}
