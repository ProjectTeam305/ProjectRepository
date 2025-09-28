package business;

/**
 * BorrowService contains the business logic for borrowing and returning books.
 */
public class borrowUI {

    public void borrowBook(int memberID, int ISBN) {
        System.out.println("Book with ISBN " + ISBN + " borrowed by member " + memberID);
    }

    public void returnBook(int ISBN) {
        System.out.println("Book with ISBN " + ISBN + " returned.");
    }

    public void trackDueDates() {
        System.out.println("Showing all due dates...");
    }

    public void viewBorrowedBooks() {
        System.out.println("Listing all borrowed books...");
    }
}
