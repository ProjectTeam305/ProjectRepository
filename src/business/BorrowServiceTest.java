package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BorrowServiceTest {

    private BorrowUI.BorrowService borrowService;

    @BeforeEach
    void setUp() {
        borrowService = new BorrowUI.BorrowService();
    }

    @Test
    void borrowBook() {
        boolean result = borrowService.borrowBook("user123", "bookABC");
        assertTrue(result, "Book should be borrowed successfully");
    }

    @Test
    void returnBook() {
        borrowService.borrowBook(" user221", "bookABC");
        boolean result = borrowService.returnBook("user221", "bookABC");
        assertTrue(result, "Book should be returned successfully");
    }

    @Test
    void trackDueDates() {
        borrowService.borrowBook("user123", "bookABC");
        String dueDate = borrowService.trackDueDates("user123", "bookABC");
        assertNotNull(dueDate, "Due date should not be null");
    }

    @Test
    void viewBorrowedBooks() {
        borrowService.borrowBook("user123", "bookABC");
        List<String> books;
        books = borrowService.viewBorrowedBooks("user123");
        assertEquals(1, books.size(), "User should have one borrowed book");
        assertTrue(books.contains("bookABC"), "Borrowed book should be listed");
    }
}

