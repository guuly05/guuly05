package assigments;

import java.util.Scanner;

class PasswordVault {
    private String masterPassword;
    private String storedService = "";
    private String storedPassword = "";

    public PasswordVault(String masterPassword) {
        this.masterPassword = masterPassword;
    }

    public boolean authenticate(String password) {
        return this.masterPassword.equals(password);
    }

    public void storePassword(String service, String password) {
        if (!storedService.isEmpty()) {
            System.out.println("A password is already stored. Overwriting...");
        }
        this.storedService = service;
        this.storedPassword = password;
        System.out.println("Password stored successfully.");
    }

    public String retrievePassword(String service) {
        if (storedService.equals(service)) {
            return "Stored password for " + service + ": " + storedPassword;
        } else {
            return "No password found for " + service;
        }
    }

    public void updatePassword(String service, String newPassword) {
        if (storedService.equals(service)) {
            this.storedPassword = newPassword;
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("No password found for " + service);
        }
    }

    public void deletePassword(String service) {
        if (storedService.equals(service)) {
            storedService = "";
            storedPassword = "";
            System.out.println("Password deleted successfully.");
        } else {
            System.out.println("No password found for " + service);
        }
    }
}


