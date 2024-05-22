package sh.tech.lesson3_patterns.factory.example2;

public class LandLogistics implements Logistics{
    @Override
    public void carryCargo() {
        System.out.println("Carry cargo with land transportation");
    }
}
