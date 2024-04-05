import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        this.balance += amount;
        System.out.println("Deposit successful. New balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Withdrawal amount exceeds balance. Transaction cancelled.");
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
