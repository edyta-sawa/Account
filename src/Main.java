import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Your current balance is: " + account.getBalance());
        System.out.println("Make a deposit: ");
        Scanner input = new Scanner(System.in);
        double newCash = input.nextDouble();
        account.deposit(newCash);
        System.out.println("Make a withdrawal: ");
        double minusCash = input.nextDouble();
        account.withdraw(minusCash);
        System.out.println("Your current balance is: " + account.getBalance());
    }
}
