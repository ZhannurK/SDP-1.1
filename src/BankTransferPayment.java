import java.util.Random;

public class BankTransferPayment implements PaymentMethod {
    private final String accountNumber;
    private final String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void processPayment(double amount) {
        if (validateAccountDetails()) {
            boolean paymentSuccess = new Random().nextBoolean();
            if (paymentSuccess) {
                System.out.println("Successfully processed bank transfer payment of $" + amount);
            } else {
                System.out.println("Bank transfer payment failed.");
            }
        } else {
            System.out.println("Invalid bank account details.");
        }
    }

    private boolean validateAccountDetails() {
        return accountNumber.length() >= 10 && !bankName.isEmpty();
    }
}