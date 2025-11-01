package factoryDesignPattern;
public class PaymentFactory {

    public static Payment createPayment(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Payment type cannot be null");
        }

        return switch (type.toLowerCase()) {
            case "cash" -> new CashPayment();
            case "credit" -> new CreditPayment();
            case "bitcoin" -> new BitcoinPayment();
            default -> throw new IllegalArgumentException("Unknown payment method: " + type);
        };
    }
}