package sh.tech.lesson4_patterns.adapter.example2;

// StripeAdapter.java
public class StripeAdapter implements PaymentProcessor {
    private NewPaymentGateway stripeGateway;

    public StripeAdapter(NewPaymentGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.makePayment(amount);
    }
}

