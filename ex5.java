package Lab03;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String name;
    private double balance;

    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.printf("Account No: %s | Name: %s | Balance: %.2f%n",
                accountNumber, name, balance);
    }
}

public class Lab03Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = Integer.parseInt(sc.nextLine());
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i + 1));

            String accNo;
            while (true) {
                System.out.print("Account number (14 digits): ");
                accNo = sc.nextLine();
                if (accNo.matches("\\d{14}")) {
                    break;
                }
                System.out.println("Invalid. Must be exactly 14 digits.");
            }
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            accounts[i] = new Account(accNo, name, balance);

            System.out.print("1 = Deposit, 2 = Withdraw: ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.print("Amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (choice == 1) {
                accounts[i].deposit(amount);
            } else if (!accounts[i].withdraw(amount)) {
                System.out.println("Insufficient funds.");
            }

            System.out.println("--- Updated Account Details ---");
            accounts[i].display();
        }

        sc.close();
    }
}
