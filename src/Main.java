public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        paymentProcessor.addPaymentMethod(new CreditCardPayment("1234567812345678", "John Doe", "12/25", "123"));
        paymentProcessor.addPaymentMethod(new PayPalPayment("john.doe@example.com"));

        paymentProcessor.processPayment("CreditCardPayment", 100.00);
        paymentProcessor.processPayment("PayPalPayment", 200.00);

        BankTransferPayment bankTransferPayment = new BankTransferPayment("1234567890", "Bank of America");
        paymentProcessor.addPaymentMethod(bankTransferPayment);
        paymentProcessor.processPayment("BankTransferPayment", 300.00);
    }
}