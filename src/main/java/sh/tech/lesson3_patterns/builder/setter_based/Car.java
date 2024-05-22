package sh.tech.lesson3_patterns.builder.setter_based;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;

    private Car() {
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private String engine;

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.make = this.make;
            car.color = this.color;
            car.engine = this.engine;
            car.year = this.year;
            car.model = this.model;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
