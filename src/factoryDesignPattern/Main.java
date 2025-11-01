package factoryDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // with factory
     /*   Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment type (cash/credit/bitcoin): ");
        String type = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try {
            Payment payment = PaymentFactory.createPayment(type);
            payment.pay(amount);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }*/

    // without factory
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payment type (cash/credit/bitcoin): ");
        String type = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        Payment payment;

        // Without factory: we create objects manually
        if (type.equalsIgnoreCase("cash")) {
            payment = new CashPayment();
        } else if (type.equalsIgnoreCase("credit")) {
            payment = new CreditPayment();
        } else if (type.equalsIgnoreCase("bitcoin")) {
            payment = new BitcoinPayment();
        } else {
            System.out.println("Unknown payment type: " + type);
            scanner.close();
            return; // exit program
        }

        // Use the payment
        payment.pay(amount);

        scanner.close();
    }

}