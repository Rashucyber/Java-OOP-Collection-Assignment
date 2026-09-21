class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    int accountNumber;
    String customerName;
    double balance;

    Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        Account a = new Account(101, "Riya", 5000);

        try {
            a.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}