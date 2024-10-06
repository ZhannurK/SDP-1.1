import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {
    private final List<PaymentMethod> paymentMethods;

    public PaymentProcessor() {
        this.paymentMethods = new ArrayList<>();
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    public void processPayment(String method, double amount) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            if (paymentMethod.getClass().getSimpleName().equalsIgnoreCase(method)) {
                paymentMethod.processPayment(amount);
                return;
            }
        }
        System.out.println("Payment method not found: " + method);
    }
}