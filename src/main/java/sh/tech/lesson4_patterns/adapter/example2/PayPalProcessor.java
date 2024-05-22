package sh.tech.lesson4_patterns.adapter.example2;

// PayPalProcessor.java
public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

