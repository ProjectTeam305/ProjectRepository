
import presentation.BorrowUI;

import java.util.Scanner;


/**
 * Main class for the Library Management System.
 * Acts as the starting point for the application.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        BorrowUI borrowUI = new BorrowUI();

        System.out.println("===== Library Management System =====");
        System.out.println("1. Book Management");
        System.out.println("2. Member Management");
        System.out.println("3. Borrow & Return System");
        System.out.println("4. Reports & Notifications");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Book Management Menu");
                break;

            case 2:
                System.out.println("Member Management Menu");
                break;

            case 3:
                borrowUI.showMenu();  // ✅ Connected to your Borrow & Return
                break;

            case 4:
                System.out.println("Reports & Notifications Menu");
                break;

            case 5:
                System.out.println("Exiting... Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }

        sc.close();
    }
}
