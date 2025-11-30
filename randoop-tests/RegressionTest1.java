import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass7 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean15 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean26 = borrowService0.borrowBook("", "");
        java.lang.Class<?> wildcardClass27 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass7 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-10-31" + "'", str11, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass25 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        boolean boolean15 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean18 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        data.Borrow borrow2 = new data.Borrow("No due date found", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.borrowBook(0, 0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(10);
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) 'a');
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("", "No due date found.");
        java.lang.Class<?> wildcardClass7 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("hi!", "");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean27 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.Class<?> wildcardClass20 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook((int) (byte) 1, (int) 'a');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass5 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass9 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str16 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, (int) (byte) -1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (byte) 10);
        borrowUI0.returnBook(10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook(1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean30 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.Class<?> wildcardClass31 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass17 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found", "hi!");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean28 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean24 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean27 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str30 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2025-10-31" + "'", str30, "2025-10-31");
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean18 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("", "");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str29 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.borrowBook((int) '4', (int) (byte) -1);
        borrowUI0.returnBook((int) (short) -1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass6 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.lang.String str28 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2025-10-31" + "'", str28, "2025-10-31");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean29 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str32 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found." + "'", str32, "No due date found.");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.borrowBook(0, 100);
        java.lang.Class<?> wildcardClass8 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 100, 10);
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(10, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str24 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.borrowBook(0, (int) ' ');
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.borrowBook(1, (-1));
        borrowUI0.returnBook(10);
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) ' ');
        borrowUI0.borrowBook((int) (byte) -1, (int) (byte) 100);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        java.lang.String str22 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.Class<?> wildcardClass23 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass5 = borrow2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) -1);
        borrowUI0.returnBook(0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        boolean boolean11 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean25 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.borrowBook((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean18 = borrowService0.borrowBook("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.borrowBook(10, 10);
        borrowUI0.returnBook((int) '4');
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) 'a');
        borrowUI0.returnBook((int) (short) 100);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        data.Borrow borrow2 = new data.Borrow("", "2025-10-31");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean25 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean28 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.lang.String str16 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.showMenu();
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass10 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) 'a');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 1, (int) '4');
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        data.Borrow borrow2 = new data.Borrow("No due date found", "2025-10-31");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2025-10-31" + "'", str3, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.borrowBook((int) (byte) 10, (int) (short) -1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean7 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str24 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found." + "'", str24, "No due date found.");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("", "hi!");
        java.lang.Class<?> wildcardClass23 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2025-10-31" + "'", str22, "2025-10-31");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass12 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) 'a');
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) -1);
        borrowUI0.returnBook(1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean19 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean27 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str12 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        data.Borrow borrow2 = new data.Borrow("No due date found", "");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str25 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean28 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook(0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2025-10-31" + "'", str14, "2025-10-31");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(10, (int) ' ');
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "hi!");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        boolean boolean21 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook(0);
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean10 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) ' ', (int) (short) 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.returnBook((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) 'a', (int) (short) -1);
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "");
        boolean boolean15 = borrowService0.borrowBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) -1, (int) (byte) -1);
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 10, (int) ' ');
        borrowUI0.returnBook(100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean20 = borrowService0.returnBook("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        boolean boolean16 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        boolean boolean24 = borrowService0.returnBook("", "hi!");
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean30 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean33 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "");
        boolean boolean28 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.Class<?> wildcardClass29 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        boolean boolean21 = borrowService0.borrowBook("", "hi!");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean27 = borrowService0.returnBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) ' ');
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found", "hi!");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (short) -1, (int) 'a');
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) ' ');
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass3 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass14 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean25 = borrowService0.borrowBook("No due date found", "2025-10-31");
        java.lang.String str28 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found." + "'", str28, "No due date found.");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook(10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean25 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str30 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str33 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No due date found" + "'", str33, "No due date found");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
        borrowUI0.borrowBook(100, (int) 'a');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean25 = borrowService0.borrowBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(10, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.borrowBook((int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean29 = borrowService0.returnBook("No due date found.", "");
        boolean boolean32 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean25 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean9 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.borrowBook((-1), 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 0, 100);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass17 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) ' ');
        borrowUI0.borrowBook((-1), (-1));
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.borrowBook((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean25 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean30 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.borrowBook(0, 0);
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (short) 1);
        borrowUI0.returnBook((int) ' ');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.borrowBook((int) '4', 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.showMenu();
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) -1);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 0);
        borrowUI0.borrowBook(0, (int) '4');
        borrowUI0.borrowBook((int) 'a', (-1));
        borrowUI0.borrowBook((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean19 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (byte) 100, 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        boolean boolean27 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str30 = borrowService0.trackDueDates("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean9 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.borrowBook((int) ' ', 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.Class<?> wildcardClass7 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook(100, 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("", "No due date found.");
        java.lang.Class<?> wildcardClass17 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        data.Borrow borrow2 = new data.Borrow("No due date found", "No due date found");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "hi!");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.Class<?> wildcardClass11 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean19 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((-1), (int) (short) 0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass7 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        data.Borrow borrow2 = new data.Borrow("No due date found", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook(100);
        java.lang.Class<?> wildcardClass8 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(10, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook(1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.showMenu();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.borrowBook((int) '4', 1);
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        boolean boolean12 = borrow2.isValid();
        boolean boolean13 = borrow2.isValid();
        boolean boolean14 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-10-31" + "'", str15, "2025-10-31");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean25 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass16 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.returnBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (byte) 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str16 = borrowService0.trackDueDates("hi!", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.Class<?> wildcardClass20 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.Class<?> wildcardClass11 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("No due date found", "");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.borrowBook((-1), (int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str29 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str32 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found." + "'", str29, "No due date found.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found." + "'", str32, "No due date found.");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (-1));
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.returnBook((int) (short) -1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.Class<?> wildcardClass11 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("");
        java.lang.String str30 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2025-10-31" + "'", str30, "2025-10-31");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (short) 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.borrowBook("", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass4 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean25 = borrowService0.borrowBook("hi!", "");
        boolean boolean28 = borrowService0.borrowBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        boolean boolean22 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.borrowBook(1, (int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean6 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean9 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean21 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass20 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean25 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean28 = borrowService0.borrowBook("", "No due date found.");
        java.lang.Class<?> wildcardClass29 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) ' ');
        borrowUI0.borrowBook((-1), (-1));
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean9 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass9 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList6 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean9 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean12 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(10, (int) '4');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean26 = borrowService0.borrowBook("", "");
        java.lang.String str29 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str32 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean35 = borrowService0.returnBook("hi!", "");
        java.lang.String str38 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found" + "'", str32, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "No due date found" + "'", str38, "No due date found");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.borrowBook((int) '4', 1);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass2 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook(1);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        boolean boolean28 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean31 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.Class<?> wildcardClass32 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.Class<?> wildcardClass9 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        java.lang.String str20 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean17 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass20 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-10-31" + "'", str6, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean19 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean21 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean24 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean29 = borrowService0.returnBook("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("", "");
        java.lang.Class<?> wildcardClass19 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-10-31" + "'", str7, "2025-10-31");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean13 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str19 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean23 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2025-10-31" + "'", str23, "2025-10-31");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str26 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) -1, 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean30 = borrowService0.returnBook("hi!", "");
        boolean boolean33 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (short) -1, (int) 'a');
        borrowUI0.borrowBook((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("");
        java.lang.String str30 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.returnBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) -1, 1);
        borrowUI0.borrowBook((int) (byte) 0, 10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean30 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.String str33 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList35 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No due date found." + "'", str33, "No due date found.");
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass27 = strList26.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.borrowBook((int) (short) -1, (int) (byte) 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str19 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (byte) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean26 = borrowService0.borrowBook("", "No due date found");
        boolean boolean29 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) '4');
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str9 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        boolean boolean22 = borrowService0.returnBook("", "No due date found.");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "");
        boolean boolean28 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass31 = strList30.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "hi!");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean5 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-10-31" + "'", str6, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean5 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }
}

