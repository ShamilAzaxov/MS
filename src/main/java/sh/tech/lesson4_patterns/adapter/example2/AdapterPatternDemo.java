package sh.tech.lesson4_patterns.adapter.example2;

// AdapterPatternDemo.java
public class AdapterPatternDemo {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalProcessor();
        payPalProcessor.processPayment(100.0);

        NewPaymentGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);
        stripeAdapter.processPayment(200.0);
    }
}