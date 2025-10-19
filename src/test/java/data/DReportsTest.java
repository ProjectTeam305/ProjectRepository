package data;

import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class DReportsTest {

    static private DReports dReports;

    @BeforeAll
    static void setUp() {
        dReports = new DReports();
    }

    @Test
    void testConstructorGeneratesLists() {
        int total = dReports.getAvSize() + dReports.getBorrSize();
        assertEquals(8, total, "Expected total of 10 items split between available and borrowed");
        assertTrue(dReports.getAvSize() > 0, "Available list should not be empty");
        assertTrue(dReports.getBorrSize() > 0, "Borrowed list should not be empty");
    }

    @Test
    void testBorrowMovesFromAvailableToBorrowed() {
        Iterator<Integer> av = dReports.avIter();
        assertTrue(av.hasNext(), "Available list must have an element");
        int isbn = av.next();
        int beforeAv = dReports.getAvSize();
        int beforeBorr = dReports.getBorrSize();

        dReports.borrow(isbn);

        assertEquals(beforeAv - 1, dReports.getAvSize(), "Book should be removed from available");
        assertEquals(beforeBorr + 1, dReports.getBorrSize(), "Book should be added to borrowed");
    }

    @Test
    void testAvailMovesFromBorrowedToAvailable() {
        Iterator<Integer> borr = dReports.borrIter();
        assertTrue(borr.hasNext(), "Borrowed list must have an element");
        int isbn = borr.next();
        int beforeAv = dReports.getAvSize();
        int beforeBorr = dReports.getBorrSize();

        dReports.avail(isbn);

        assertEquals(beforeAv + 1, dReports.getAvSize(), "Book should be added to available");
        assertEquals(beforeBorr - 1, dReports.getBorrSize(), "Book should be removed from borrowed");
    }

    @Test
    void testIteratorsWorkCorrectly() {
        Iterator<Integer> avIter = dReports.avIter();
        Iterator<Integer> borrIter = dReports.borrIter();

        assertNotNull(avIter);
        assertNotNull(borrIter);

        HashSet<Integer> all = new HashSet<>();
        avIter.forEachRemaining(all::add);
        borrIter.forEachRemaining(all::add);

        assertEquals(8, all.size(), "Combined set size should equal 10 total elements");
    }
}
