package sh.tech.lesson4_patterns.adapter.example2;

// StripeGateway.java
public class StripeGateway implements NewPaymentGateway {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}

