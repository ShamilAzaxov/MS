package sh.tech.lesson3_patterns.builder.setter_based;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder().setMake("Mercedes").setColor("Green").setModel("GTR").build();
        System.out.println(car);
    }
}
