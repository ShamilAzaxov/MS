package sh.tech.lesson3_patterns.prototype.example2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(2L, "Shamil");
        Person person1 = person.clonePerson();
        System.out.println(person1);
        System.out.println(person1 == person);



        Car car = new Car(2L, "green");
        Car car1;
        try {
            car1 = (Car) car.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(car1);
        System.out.println(car1 == car);
    }
}
