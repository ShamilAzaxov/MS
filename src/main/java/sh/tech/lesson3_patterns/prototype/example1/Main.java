package sh.tech.lesson3_patterns.prototype.example1;

public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "Shamil", "Azakhov", 26);
        UserFactory userFactory = new UserFactory(user);
        User factory = userFactory.clone();
        System.out.println(user == factory);

    }
}
