package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BorrowUITest {

    private BorrowService borrowService;

    @BeforeEach
    void setUp() {
        borrowService = new BorrowService();
    }

    @Test
    void borrowBook() {
        boolean result = borrowService.borrowBook("user123", "bookABC");
        assertTrue(result, "Borrowing should succeed");
    }

    @Test
    void returnBook() {
        borrowService.borrowBook("user123", "bookABC");
        boolean result = borrowService.returnBook("user123", "bookABC");
        assertTrue(result, "Returning should succeed");
    }

    @Test
    void trackDueDates() {
        borrowService.borrowBook("user123", "bookABC");
        String dueDate = borrowService.trackDueDates("user123", "bookABC");
        assertEquals("2025-10-31", dueDate, "Due date should match expected value");
    }

    @Test
    void viewBorrowedBooks() {
        borrowService.borrowBook("user123", "bookABC");
        var books = borrowService.viewBorrowedBooks("user123");
        assertTrue(books.contains("bookABC"), "Borrowed book should be listed");
    }
}

