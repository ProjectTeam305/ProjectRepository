package presentation;

import java.util.Scanner;
import business.BorrowService;

/**
 * BorrowUI handles user interaction for the Borrow & Return System.
 */
public class BorrowUI {
    private BorrowService borrowService;
    private Scanner sc;

    public BorrowUI() {
        borrowService = new BorrowService();
        sc = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("=== Borrow & Return System ===");
        System.out.println("1. Borrow a Book");
        System.out.println("2. Return a Book");
        System.out.println("3. Track Due Dates");
        System.out.println("4. View Borrowed Books");
        System.out.println("5. Back to Main Menu");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Member ID: ");
                String memberID = sc.next();
                System.out.print("Enter Book ISBN: ");
                String ISBN = sc.next();
                borrowService.borrowBook(memberID, ISBN);
                break;

            case 2:
                System.out.print("Enter Book ISBN to return: ");
                String returnISBN = sc.next();
                borrowService.returnBook(returnISBN);
                break;

            case 3:
                borrowService.trackDueDates();
                break;

            case 4:
                borrowService.viewBorrowedBooks();
                break;

            case 5:
                System.out.println("Returning to Main Menu...");
                return;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
