package factoryDesignPattern;

public class CreditPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card.");
    }
}