package business;

/**
 * BorrowService contains the business logic for borrowing and returning books.
 */
public class BorrowService {

    public void borrowBook(String memberID, String ISBN) {
        System.out.println("Book with ISBN " + ISBN + " borrowed by member " + memberID);
    }

    public void returnBook(String ISBN) {
        System.out.println("Book with ISBN " + ISBN + " returned.");
    }

    public void trackDueDates() {
        System.out.println("Showing all due dates...");
    }

    public void viewBorrowedBooks() {
        System.out.println("Listing all borrowed books...");
    }
}
