import java.util.Scanner;

public class ATM {
    public static Scanner sc = new Scanner(System.in);
    public static Bankaccount account = new Bankaccount();

    public static void displaymenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("Please choose an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
    }

    public static int getChoice() {
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }

    public static void withdraw() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("You have withdrawn " + amount + " from your account.");
            System.out.println("Your new balance is " + account.getbalance());
        } else {
            System.out.println("Sorry, you cannot withdraw more than your balance.");
            System.out.println("Your current balance is " + account.getbalance());
        }
    }

    public static void deposit() {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("You have deposited " + amount + " into your account.");
        System.out.println("Your new balance is " + account.getbalance());
    }

    public static void checkbalance() {
        System.out.println("Your current balance is " + account.getbalance());
    }

    public static void exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            displaymenu();
            int choice = getChoice();
            switch (choice) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkbalance();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

class Bankaccount {
    private double balance;

    public Bankaccount() {
        balance = 1000;
    }

    public double getbalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}