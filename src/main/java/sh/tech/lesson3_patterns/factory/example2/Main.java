package sh.tech.lesson3_patterns.factory.example2;

public class Main {
    public static void main(String[] args) {
        var instanceOfLogistics = createInstanceOfLogistics(Instance.LAND_LOGISTICS);
        var instance = instanceOfLogistics.createInstance();
        instance.carryCargo();
    }
    private static LogisticsFactory createInstanceOfLogistics(Instance instance){
        return switch (instance){
            case LAND_LOGISTICS -> new LandLogisticsFactory();
            case SEA_LOGISTICS -> new SeaLogisticsFactory();
        };
    }
}
