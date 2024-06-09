package sh.tech.lesson4_patterns.bridge;

public class ApplicationCreator {
    public static void main(String[] args) {
        Application[] applications = {
                new BankSystem(new JavaDev()),
                new StockExchange(new KotlinDev())
        };

        for (Application application : applications)
            application.developApplication();

        //new line for amend
        //second line for amend
        //and 3 rd line also

    }
}
