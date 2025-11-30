import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.returnBook(1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "hi!");
        java.lang.String str16 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean27 = borrowService0.returnBook("2025-10-31", "");
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
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass15 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("2025-10-31");
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
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.Class<?> wildcardClass26 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        boolean boolean28 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.String str29 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str32 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found" + "'", str32, "No due date found");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str22 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean18 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        boolean boolean23 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean23 = borrowService0.returnBook("", "No due date found");
        boolean boolean26 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass4 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.Class<?> wildcardClass27 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "");
        boolean boolean15 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean21 = borrowService0.returnBook("", "No due date found");
        java.lang.String str24 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean27 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2025-10-31" + "'", str24, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        java.lang.String str22 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean25 = borrowService0.returnBook("", "No due date found");
        java.lang.String str28 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found." + "'", str28, "No due date found.");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "2025-10-31");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2025-10-31" + "'", str3, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.returnBook(0);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(100, (int) (byte) 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getMemberID();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean6 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean9 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean17 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.Class<?> wildcardClass7 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        boolean boolean15 = borrowService0.borrowBook("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.Class<?> wildcardClass24 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        java.lang.String str38 = borrowService0.trackDueDates("2025-10-31", "No due date found");
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str26 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str29 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean32 = borrowService0.returnBook("No due date found", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2025-10-31" + "'", str26, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean27 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        boolean boolean33 = borrowService0.borrowBook("hi!", "No due date found.");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 100, (int) ' ');
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        boolean boolean28 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean31 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("");
        boolean boolean36 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        borrowUI0.borrowBook((int) (byte) 0, (int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean24 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean27 = borrowService0.returnBook("hi!", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "hi!");
        boolean boolean24 = borrowService0.returnBook("", "");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        boolean boolean24 = borrowService0.returnBook("", "hi!");
        boolean boolean27 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str30 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean27 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean30 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean23 = borrowService0.returnBook("", "No due date found");
        boolean boolean26 = borrowService0.returnBook("hi!", "");
        boolean boolean29 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.Class<?> wildcardClass22 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(100);
        borrowUI0.showMenu();
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) -1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        java.lang.String str12 = borrow2.getISBN();
        java.lang.String str13 = borrow2.getISBN();
        java.lang.String str14 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean27 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str19 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 100);
        borrowUI0.returnBook(100);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("hi!", "");
        java.lang.String str28 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2025-10-31" + "'", str25, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found" + "'", str28, "No due date found");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean15 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) 'a', (int) ' ');
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean19 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        boolean boolean21 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str25 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "hi!");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean25 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean28 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str30 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean20 = borrowService0.returnBook("No due date found", "");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '4', (int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        java.lang.String str24 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.Class<?> wildcardClass7 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean9 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.borrowBook(10, 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        boolean boolean9 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean27 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean30 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 100);
        borrowUI0.borrowBook((int) (short) 100, 10);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str30 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "");
        boolean boolean6 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook(100, (int) '#');
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("", "No due date found.");
        boolean boolean19 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        java.lang.String str27 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2025-10-31" + "'", str27, "2025-10-31");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(1, (int) (short) 0);
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 10, 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("", "2025-10-31");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 10);
        borrowUI0.borrowBook((int) (short) 0, 0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.Class<?> wildcardClass9 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean20 = borrowService0.borrowBook("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.showMenu();
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        java.lang.String str20 = borrowService0.trackDueDates("", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2025-10-31" + "'", str20, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 100, (int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        borrowUI0.borrowBook((int) (short) 100, (int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str19 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean22 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean24 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2025-10-31" + "'", str14, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook(0, (int) (byte) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList6 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "");
        java.lang.Class<?> wildcardClass23 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (-1));
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (short) 100);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.lang.String str9 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean9 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean5 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean10 = borrowService0.returnBook("", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        borrowUI0.returnBook((int) (short) 100);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) '#', (int) (short) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.borrowBook(100, (int) (byte) -1);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        boolean boolean15 = borrowService0.borrowBook("", "2025-10-31");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) '#');
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) 'a', (int) (short) 10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.borrowBook(0, (int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) '#');
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str31 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found" + "'", str31, "No due date found");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass6 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean17 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2025-10-31" + "'", str20, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.Class<?> wildcardClass19 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean22 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        boolean boolean12 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean19 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (-1));
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) ' ', (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str13 = borrowService0.trackDueDates("", "");
        boolean boolean16 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean9 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.borrowBook((int) (short) -1, (int) 'a');
        borrowUI0.returnBook(0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.returnBook("", "No due date found.");
        boolean boolean19 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getMemberID();
        java.lang.String str12 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass13 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean26 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str31 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "No due date found");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str30 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.returnBook("", "No due date found");
        boolean boolean25 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean28 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean22 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        java.lang.String str27 = borrowService0.trackDueDates("", "");
        boolean boolean30 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2025-10-31" + "'", str27, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean22 = borrowService0.returnBook("", "No due date found.");
        boolean boolean25 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean28 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((-1));
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean26 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean29 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.borrowBook(1, (int) 'a');
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean29 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) -1);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 0);
        borrowUI0.borrowBook(0, (int) '4');
        borrowUI0.borrowBook(0, (int) '4');
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 100, (int) '#');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.returnBook((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean26 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean29 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass14 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.borrowBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "hi!");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean27 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(100);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean9 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean23 = borrowService0.borrowBook("", "");
        java.lang.Class<?> wildcardClass24 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("");
        boolean boolean32 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean35 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str16 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "2025-10-31");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-10-31" + "'", str6, "2025-10-31");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        java.lang.Class<?> wildcardClass3 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean22 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("", "No due date found");
        java.lang.String str24 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str27 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean30 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        boolean boolean22 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean25 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((-1), (int) (byte) 0);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 100);
        borrowUI0.returnBook((int) 'a');
        borrowUI0.showMenu();
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean19 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((-1), (int) (byte) -1);
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("");
        boolean boolean28 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) '4');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) ' ', (int) (short) -1);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (int) (short) 1);
        borrowUI0.returnBook((-1));
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        java.lang.String str29 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean32 = borrowService0.returnBook("No due date found.", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean25 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean30 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        boolean boolean28 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass31 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass18 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        boolean boolean23 = borrowService0.returnBook("", "No due date found");
        boolean boolean26 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean27 = borrowService0.borrowBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(10);
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 100);
        borrowUI0.borrowBook((int) (byte) 100, (int) '#');
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass6 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "2025-10-31");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        borrowUI0.borrowBook(0, (int) '4');
        borrowUI0.showMenu();
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean25 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.borrowBook((int) (byte) 1, 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass9 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean26 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook(10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean28 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) ' ', (int) (short) -1);
        borrowUI0.borrowBook((int) '4', (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean14 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean26 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(1, 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.borrowBook((int) '#', (-1));
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass18 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass14 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(10);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean22 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str30 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean28 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str31 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found" + "'", str31, "No due date found");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook((int) (byte) 1, (int) 'a');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean26 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str13 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.borrowBook(10, 10);
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean25 = borrowService0.returnBook("", "hi!");
        boolean boolean28 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass6 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) -1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str34 = borrowService0.trackDueDates("hi!", "No due date found.");
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
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No due date found." + "'", str34, "No due date found.");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.returnBook(100);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (short) 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean23 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean26 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean18 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.borrowBook(1, (int) (byte) -1);
        borrowUI0.borrowBook(0, 10);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean30 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean35 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.Class<?> wildcardClass36 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) '4', (int) (byte) -1);
        borrowUI0.borrowBook(100, (int) '4');
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "");
        boolean boolean6 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found");
        java.lang.String str3 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook(100, (int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2025-10-31" + "'", str9, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean17 = borrowService0.borrowBook("", "hi!");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean25 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((-1), (int) (short) 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean28 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean31 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str34 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str37 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2025-10-31" + "'", str34, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "No due date found" + "'", str37, "No due date found");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(100);
        borrowUI0.borrowBook(1, (int) (byte) 100);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("No due date found", "");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean13 = borrowService0.returnBook("No due date found.", "");
        boolean boolean16 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        boolean boolean23 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) ' ');
        borrowUI0.showMenu();
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean14 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean17 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 0);
        borrowUI0.returnBook(1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        boolean boolean28 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        boolean boolean28 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 0);
    }
}

