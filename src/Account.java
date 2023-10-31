import java.util.Scanner;

class Account {
    private double balance;

    Account() {
        this.balance = 0;
    }

    public void deposit(double newCash) {
        this.balance += newCash;
    }

    public void withdraw(double minusCash) {
        if (minusCash <= this.balance)
            this.balance -= minusCash;
        else
            System.out.println("Forbidden.");
    }

    public double getBalance() {
        return this.balance;
    }
}

