package data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BorrowTest {

    @Test
    void testBorrowCreation() {
        Borrow borrow = new Borrow("user123", "bookABC");
        assertEquals("user123", borrow.getMemberID());
        assertEquals("bookABC", borrow.getISBN());
    }

    @Test
    void testValidBorrow() {
        Borrow borrow = new Borrow("user123", "bookABC");
        assertTrue(borrow.isValid());
    }

    @Test
    void testInvalidBorrow() {
        Borrow borrow = new Borrow("", "");
        assertFalse(borrow.isValid());
    }
}

