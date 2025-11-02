package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * BorrowService contains the business logic for borrowing and returning books.
 */
public class BorrowUI {

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

    public void showMenu() {
        System.out.println("Showing menu...");
    }

    public static class BorrowService {

        private final Map<String, List<String>> borrowedBooks = new HashMap<>();
        private final Map<String, String> dueDates = new HashMap<>();

        public boolean borrowBook(String userId, String bookId) {
            borrowedBooks.computeIfAbsent(userId, k -> new ArrayList<>()).add(bookId);
            dueDates.put(userId + ":" + bookId, "2025-10-31");
            return true;
        }

        public boolean returnBook(String userId, String bookId) {
            List<String> books = borrowedBooks.getOrDefault(userId, new ArrayList<>());
            boolean removed = books.remove(bookId);
            dueDates.remove(userId + ":" + bookId);
            return removed;
        }

        public String trackDueDates(String userId, String bookId) {
            return dueDates.getOrDefault(userId + ":" + bookId, "No due date found");
        }

        public List<String> viewBorrowedBooks(String userId) {
            return borrowedBooks.getOrDefault(userId, Collections.emptyList());
        }
    }

    static class BorrowUITest {

        private BorrowUI borrowUI;

        @BeforeEach
        void setUp() {
            borrowUI = new BorrowUI();
        }

        @Test
        void borrowBook() {
            // This method only prints, so we can't assert much unless we refactor
            borrowUI.borrowBook(123, 456);
        }

        @Test
        void returnBook() {
            borrowUI.returnBook(456);
        }

        @Test
        void trackDueDates() {
            borrowUI.trackDueDates();
        }

        @Test
        void viewBorrowedBooks() {
            borrowUI.viewBorrowedBooks();
        }
    }
}