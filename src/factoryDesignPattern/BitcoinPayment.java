package factoryDesignPattern;

public class BitcoinPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " BTC via Bitcoin network.");
    }
}