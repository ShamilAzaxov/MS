package sh.tech.lesson3_patterns.factory.example2;

public class SeaLogisticsFactory implements LogisticsFactory{
    @Override
    public Logistics createInstance() {
        return new SeaLogistics();
    }
}
