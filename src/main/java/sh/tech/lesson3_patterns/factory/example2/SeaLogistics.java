package sh.tech.lesson3_patterns.factory.example2;

public class SeaLogistics implements Logistics{
    @Override
    public void carryCargo() {
        System.out.println("Carry cargo with sea transportation");
    }
}
