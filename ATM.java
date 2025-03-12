package assigments;

import java.util.*;

public class ATM {
    static int pin = 1234;
    static int balance = 1000;

    public static int deposit(int x) {
        balance += x;
        return balance;
    }

    public static int withdraw(int x) {
        balance -= x;
        return balance;
    }

    public void printInfo() {
        System.out.println("----------------------------");
        System.out.println("Welcome to C.U.M Bank, choose an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("Enter your account PIN: ");
        int enteredPin = scanner.nextInt();
        while (enteredPin != pin) {
            System.out.println("Incorrect PIN, try again: ");
            enteredPin = scanner.nextInt();
        }

        int choice;
        do {
            atm.printInfo();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    while (depositAmount <= 0) {
                        System.out.println("Invalid value, try again: ");
                        depositAmount = scanner.nextInt();
                    }
                    balance = deposit(depositAmount);
                    System.out.println("Your new balance is: " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    while (withdrawAmount < 0 || withdrawAmount > balance) {
                        System.out.println("Invalid amount, enter a valid number: ");
                        withdrawAmount = scanner.nextInt();
                    }
                    balance = withdraw(withdrawAmount);
                    System.out.println("You withdrew: " + withdrawAmount + ". Remaining balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using C.U.M Bank!");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 4);


    }
}
