package sh.tech.lesson4_patterns.bridge;

public class BankSystem extends Application{

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developApplication() {
        System.out.println("Bank system in progress");
        getDeveloper().writeCode();
    }
}
