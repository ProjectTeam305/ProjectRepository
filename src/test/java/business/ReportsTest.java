package business;

import org.junit.jupiter.api.*;
import presentation.PReports;
import data.DReports;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReportsTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    /// ### ///
    @Test
    void testShowBorrowedCallsPresentation() {
        Reports.showBorr();
        String output = out.toString();
        assertTrue(output.contains("All Borrowed"), "Expected output to contain 'All Borrowed'");
    }

    @Test
    void testShowAvailableCallsPresentation() {
        Reports.showAv();
        String output = out.toString();
        assertTrue(output.contains("All Available"), "Expected output to contain 'All Available'");
    }

    @Test
    void testOverdueReportDoesNotThrow() {
        assertDoesNotThrow(Reports::overdueReport, "overdueReport() should not throw any exceptions");
    }
}
