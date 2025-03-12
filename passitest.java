package assigments;

import java.util.Scanner;

public class passitest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set your master password: ");
        String masterPassword = scanner.nextLine();
        PasswordVault vault = new PasswordVault(masterPassword);

        while (true) {
            System.out.print("\nEnter master password to access vault: ");
            String inputPassword = scanner.nextLine();

            if (!vault.authenticate(inputPassword)) {
                System.out.println("Incorrect password. Try again.");
                continue;
            }

            while (true) {
                System.out.println("\nOptions: store, retrieve, update, delete, exit");
                System.out.print("Enter command: ");
                String command = scanner.nextLine();

                if (command.equals("store")) {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    vault.storePassword(service, password);
                } else if (command.equals("retrieve")) {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.println(vault.retrievePassword(service));
                } else if (command.equals("update")) {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    vault.updatePassword(service, newPassword);
                } else if (command.equals("delete")) {
                    System.out.print("Enter service name: ");
                    String service = scanner.nextLine();
                    vault.deletePassword(service);
                } else if (command.equals("exit")) {
                    System.out.println("Logging out...");
                    break;
                } else {
                    System.out.println("Invalid command.");
                }
            }
        }
    }
}