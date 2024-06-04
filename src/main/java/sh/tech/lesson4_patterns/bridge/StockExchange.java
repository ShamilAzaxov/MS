package sh.tech.lesson4_patterns.bridge;

public class StockExchange extends Application{

    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developApplication() {
        System.out.println("Stock exchange in progress");
        getDeveloper().writeCode();
    }
}
