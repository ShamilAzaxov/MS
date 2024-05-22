package sh.tech.lesson2_solid.interface_segregation.correct;

public class Tennis implements TennisInter {
    @Override
    public void playTennis() {
        System.out.println("Player plays tennis");
    }

}
