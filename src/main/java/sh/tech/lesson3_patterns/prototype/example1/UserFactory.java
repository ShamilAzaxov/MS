package sh.tech.lesson3_patterns.prototype.example1;

public class UserFactory {
    User user;

    public UserFactory(User user) {
        this.user = user;
    }
    public User clone(){
        return (User) user.copy();
    }
}
