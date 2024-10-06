import java.util.Random;

public class PayPalPayment implements PaymentMethod {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        if (validateEmail()) {
            boolean paymentSuccess = new Random().nextBoolean();
            if (paymentSuccess) {
                System.out.println("Successfully processed PayPal payment of $" + amount);
            } else {
                System.out.println("PayPal payment failed.");
            }
        } else {
            System.out.println("Invalid PayPal email.");
        }
    }

    private boolean validateEmail() {
        return email.contains("@") && email.endsWith(".com");
    }
}