package presentation;

import java.util.Scanner;
import business.borrowUI;

/**
 * BorrowUI handles user interaction for the Borrow & Return System.
 */
public class BorrowUI {
    private final borrowUI borrowUI;
    private final Scanner sc;

    public BorrowUI() {
        borrowUI = new borrowUI( );
        sc = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("=== Borrow & Return System ===");
        System.out.println("1. Borrow a Book");
        System.out.println("2. Return a Book");
        System.out.println("3. Track Due Dates");
        System.out.println("4. View Borrowed Books");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter choice:    ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Member ID: ");
                int memberID = Integer.parseInt(sc.next());
                System.out.print("Enter Book ISBN: ");
                int ISBN = Integer.parseInt(sc.next());
                borrowUI.borrowBook(memberID, ISBN);
                break;

            case 2:
                System.out.print("Enter Book ISBN to return: ");
                int returnISBN = Integer.parseInt(sc.next());
                borrowUI.returnBook(returnISBN);
                break;

            case 3:
                borrowUI.trackDueDates();
                break;

            case 4:
                borrowUI.viewBorrowedBooks();
                break;

            case 5:
                System.out.println("Returning to Main Menu...");
                return;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
