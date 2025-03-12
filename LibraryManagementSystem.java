package assigments;

import java.util.Scanner;

class Book {
    String title;
    int ID;
    int publicationYear;
    boolean isBorrowed;
    int dueDate;
    int borrowerId;

    public Book(String title, int ID, int publicationYear) {
        this.title = title;
        this.ID = ID;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
        this.dueDate = 0;
        this.borrowerId = 0;
    }

    public void borrowBook(int memberId, int dueDate) {
        this.isBorrowed = true;
        this.dueDate = dueDate;
        this.borrowerId = memberId;
    }

    public void returnBook() {
        this.isBorrowed = false;
        this.dueDate = 0;
        this.borrowerId = 0;
    }

    public double calculateOverdueFine(int returnDate) {
        if (!this.isBorrowed || returnDate <= this.dueDate) {
            return 0.0;
        }
        return 0.50 * (returnDate - this.dueDate);
    }
}

class Member {
    String name;
    int ID;
    int registrationDate;
    int borrowedBookId;

    public Member(String name, int ID, int registrationDate) {
        this.name = name;
        this.ID = ID;
        this.registrationDate = registrationDate;
        this.borrowedBookId = 0;
    }

    public void borrowBook(int bookId) {
        this.borrowedBookId = bookId;
    }

    public void returnBook() {
        this.borrowedBookId = 0;
    }
}

class Library {
    Book currentBook;
    Member currentMember;
    int totalBooks = 0;
    int totalMembers = 0;
    int borrowedBooks = 0;
    double overdueFines = 0.0;

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Book ID: ");
        int ID = scanner.nextInt();
        if (ID == -1) return;
        System.out.print("Publication Year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine();

        currentBook = new Book(title, ID, publicationYear);
        totalBooks++;
        System.out.println("Book added successfully.");
    }

    public void addMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Member Name: ");
        String name = scanner.nextLine();
        System.out.print("Member ID: ");
        int ID = scanner.nextInt();
        if (ID == -1) return;
        System.out.print("Registration Date (YYYYMMDD): ");
        int registrationDate = scanner.nextInt();
        scanner.nextLine();

        currentMember = new Member(name, ID, registrationDate);
        totalMembers++;
        System.out.println("Member added successfully.");
    }

    public void borrowBook() {
        if (currentBook == null || currentMember == null) {
            System.out.println("No book or member found.");
            return;
        }
        if (currentBook.isBorrowed) {
            System.out.println("Book is already borrowed.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter due date (YYYYMMDD): ");
        int dueDate = scanner.nextInt();

        currentBook.borrowBook(currentMember.ID, dueDate);
        currentMember.borrowBook(currentBook.ID);
        borrowedBooks++;
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook() {
        if (currentBook == null || currentMember == null || !currentBook.isBorrowed) {
            System.out.println("No borrowed book to return.");
            return;
        }

        overdueFines += currentBook.calculateOverdueFine(20240601); // Assuming return date
        currentBook.returnBook();
        currentMember.returnBook();
        borrowedBooks--;
        System.out.println("Book returned successfully.");
    }

    public void displayStatistics() {
        System.out.println("Library Statistics:");
        System.out.println("Number of books: " + totalBooks);
        System.out.println("Number of members: " + totalMembers);
        System.out.println("Currently borrowed books: " + borrowedBooks);
        System.out.println("Overdue fines collected: $" + overdueFines);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to the Library Management System!");

        // Add a book
        System.out.println("\nEnter book details:");
        library.addBook();

        // Add a member
        System.out.println("\nEnter member details:");
        library.addMember();

        // Main menu loop
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Statistics");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.borrowBook();
                    break;
                case 2:
                    library.returnBook();
                    break;
                case 3:
                    library.displayStatistics();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        System.out.println("Thank you for using the Library Management System!");
    }
}

