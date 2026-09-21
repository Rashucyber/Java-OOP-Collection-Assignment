import java.util.Scanner;

interface Payment {
    void pay(double amount);
    void getPaymentStatus();
}

class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }

    public void getPaymentStatus() {
        System.out.println("Payment Successful");
    }
}

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }

    public void getPaymentStatus() {
        System.out.println("Payment Successful");
    }
}

class NetBankingPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Net Banking");
    }

    public void getPaymentStatus() {
        System.out.println("Payment Successful");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter payment method (1-Credit Card, 2-UPI, 3-Net Banking): ");
        int choice = sc.nextInt();

        Payment p;

        if (choice == 1)
            p = new CreditCardPayment();
        else if (choice == 2)
            p = new UPIPayment();
        else
            p = new NetBankingPayment();

        p.pay(amount);
        p.getPaymentStatus();
    }
}