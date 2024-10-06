import java.util.Random;

public class CreditCardPayment implements PaymentMethod {
    private final String cardNumber;
    private final String cardHolderName;
    private final String expiryDate;
    private final String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void processPayment(double amount) {
        if (validateCardDetails()) {
            boolean paymentSuccess = new Random().nextBoolean(); // Randomly simulate success/failure (это я для себя)
            if (paymentSuccess) {
                System.out.println("Successfully processed credit card payment of $" + amount);
            } else {
                System.out.println("Credit card payment failed.");
            }
        } else {
            System.out.println("Invalid credit card details.");
        }
    }

    private boolean validateCardDetails() {
        return cardNumber.length() == 16 && !cardHolderName.isEmpty() && !expiryDate.isEmpty() && cvv.length() == 3;
    }
}