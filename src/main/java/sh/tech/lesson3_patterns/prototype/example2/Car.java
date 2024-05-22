package sh.tech.lesson3_patterns.prototype.example2;

public class Car {
    private Long id;
    private String color;

    public Car(Long id, String color) {
        this.id = id;
        this.color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Car(id, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
