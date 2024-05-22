package sh.tech.lesson3_patterns.builder.inner_class_based;

public class Person {
    private final String firstName;
    private final String lastname;
    private final int age;
    private final String address;
    private final String phoneNumber;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder{
        private String firstName;
        private String lastname;
        private int age;
        private String address;
        private String phoneNumber;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}