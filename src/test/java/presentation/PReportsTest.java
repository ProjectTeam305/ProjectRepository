package presentation;

import data.DReports;
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PReportsTest {

    private PReports pReports;
    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        pReports = new PReports(new DReports());
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void testValidateISBNValid() {
        assertTrue(pReports.validateISBN(12345678));
    }

    @Test
    void testValidateISBNInvalid() {
        assertFalse(pReports.validateISBN(123));
        String output = out.toString();
        assertTrue(output.contains("falsely formatted"));
    }

    @Test
    void testAllBorrowedPrintsExpectedLines() {
        pReports.AllBorrowed();
        String output = out.toString();
        assertTrue(output.contains("All Borrowed"), "Should print header 'All Borrowed'");
    }

    @Test
    void testAllAvailablePrintsExpectedLines() {
        pReports.AllAvailable();
        String output = out.toString();
        assertTrue(output.contains("All Available"), "Should print header 'All Available'");
    }

    @Test
    void testMenuListValidInput() {
        String input = "1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        PReports local = new PReports(new DReports());
        local.sc = scanner;

        int choice = local.menuList();
        assertEquals(1, choice);
    }

    @Test
    void testSleepingReadsInput() {
        String input = "continue\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);
        PReports local = new PReports(new DReports());
        local.sc = scanner;

        local.sleeping();
        String output = out.toString();
        assertTrue(output.contains("continue") || output.contains("Insert"), "Should prompt user to continue");
    }
}
