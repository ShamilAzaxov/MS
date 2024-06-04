package sh.tech.lesson3_patterns.builder.inner_class_based;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().firstName("Shamil").lastname("Azakhov").age(30).build();
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
        System.out.println(person.getFirstName());
        System.out.println(person);
    }
}
