import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean26 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str26 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean7 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean27 = borrowService0.returnBook("2025-10-31", "");
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.returnBook("", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        java.lang.Class<?> wildcardClass4 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass20 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, 10);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.returnBook("", "No due date found");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("", "");
        java.lang.String str26 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str24 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "");
        java.lang.Class<?> wildcardClass4 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.borrowBook(10, 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        borrowUI0.borrowBook((int) (short) 0, (int) (byte) 0);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean21 = borrowService0.borrowBook("hi!", "");
        java.lang.String str24 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found." + "'", str24, "No due date found.");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass10 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass6 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) '4', (int) (short) 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        boolean boolean26 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass5 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) -1, (int) (byte) -1);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass9 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) 'a', (int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, 100);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.borrowBook((int) (short) 10, 0);
        borrowUI0.borrowBook((int) (byte) 100, (-1));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (short) -1, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        boolean boolean30 = borrowService0.borrowBook("2025-10-31", "");
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str29 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found." + "'", str29, "No due date found.");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found" + "'", str7, "No due date found");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found" + "'", str10, "No due date found");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook((int) (byte) 1, (int) 'a');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass6 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.String str38 = borrowService0.trackDueDates("", "2025-10-31");
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        borrowUI0.showMenu();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        boolean boolean28 = borrowService0.borrowBook("No due date found", "");
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str14 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.Class<?> wildcardClass6 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean13 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean17 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.returnBook("", "No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str29 = borrowService0.trackDueDates("2025-10-31", "");
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        boolean boolean11 = borrow2.isValid();
        java.lang.Class<?> wildcardClass12 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass7 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.borrowBook(1, (int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) -1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean5 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean10 = borrowService0.returnBook("", "hi!");
        boolean boolean13 = borrowService0.borrowBook("hi!", "");
        boolean boolean16 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str13 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean27 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("");
        boolean boolean32 = borrowService0.borrowBook("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass7 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) '4');
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        boolean boolean29 = borrowService0.returnBook("hi!", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        boolean boolean28 = borrowService0.borrowBook("2025-10-31", "No due date found");
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2025-10-31" + "'", str25, "2025-10-31");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "");
        boolean boolean26 = borrowService0.returnBook("", "hi!");
        java.lang.String str29 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.Class<?> wildcardClass30 = borrowService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        data.Borrow borrow2 = new data.Borrow("", "No due date found");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean18 = borrowService0.returnBook("", "No due date found.");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("hi!", "");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.borrowBook((int) ' ', (int) 'a');
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) -1, (int) 'a');
        borrowUI0.borrowBook((int) (short) 1, 100);
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (byte) 10);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.returnBook("No due date found", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "");
        boolean boolean27 = borrowService0.returnBook("", "");
        boolean boolean30 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (short) -1, (-1));
        borrowUI0.borrowBook(0, (int) (byte) 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass17 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean12 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((-1), (-1));
        borrowUI0.showMenu();
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) 'a', (int) (byte) 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (-1));
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean5 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.Class<?> wildcardClass19 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found", "hi!");
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean26 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str31 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        boolean boolean22 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.Class<?> wildcardClass26 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean21 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (int) (short) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (short) 100, (int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str22 = borrowService0.trackDueDates("", "hi!");
        boolean boolean25 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2025-10-31" + "'", str22, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str9 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass23 = strList22.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean15 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean22 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        data.Borrow borrow2 = new data.Borrow("", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (int) (short) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean15 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.Class<?> wildcardClass15 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) '4', (int) '#');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) '4', (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found", "hi!");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) -1, (-1));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) '4');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((-1), (int) (byte) -1);
        borrowUI0.borrowBook((-1), 1);
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("", "");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean29 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str32 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList34 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2025-10-31" + "'", str23, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found" + "'", str32, "No due date found");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean9 = borrowService0.returnBook("No due date found", "");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.lang.String str34 = borrowService0.trackDueDates("No due date found", "2025-10-31");
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found");
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
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.String str32 = borrowService0.trackDueDates("No due date found", "hi!");
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        boolean boolean31 = borrowService0.borrowBook("No due date found", "2025-10-31");
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
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass9 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.returnBook("", "No due date found");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean26 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        boolean boolean26 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean29 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean26 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str16 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean6 = borrowService0.borrowBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 10);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) '4');
        borrowUI0.showMenu();
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) ' ');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        boolean boolean16 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("", "No due date found");
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass7 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-10-31" + "'", str6, "2025-10-31");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean19 = borrowService0.returnBook("hi!", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str24 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean27 = borrowService0.returnBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        boolean boolean28 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean5 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean10 = borrowService0.returnBook("", "hi!");
        boolean boolean13 = borrowService0.borrowBook("hi!", "");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean9 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.String str31 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.Class<?> wildcardClass32 = borrowService0.getClass();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.String str12 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass13 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean15 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        java.lang.String str22 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(100, 0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "");
        boolean boolean6 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.Class<?> wildcardClass17 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        boolean boolean29 = borrowService0.returnBook("", "2025-10-31");
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
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) '4', (int) (short) 1);
        borrowUI0.returnBook(1);
        borrowUI0.showMenu();
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) -1);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 0);
        borrowUI0.borrowBook(0, (int) '4');
        borrowUI0.borrowBook((int) (byte) 100, (-1));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 0, (int) ' ');
        borrowUI0.showMenu();
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        borrowUI0.borrowBook((int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean28 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.borrowBook(100, (int) (short) 0);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass14 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) ' ');
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook((int) (byte) 100, (int) (byte) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 10, (int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        boolean boolean9 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("", "hi!");
        boolean boolean21 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-10-31" + "'", str6, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-10-31" + "'", str7, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 0, 1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        boolean boolean26 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        boolean boolean17 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        data.Borrow borrow2 = new data.Borrow("No due date found", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, 10);
        borrowUI0.borrowBook((int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean25 = borrowService0.returnBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.borrowBook(0, 100);
        borrowUI0.borrowBook((int) '#', (int) 'a');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        boolean boolean22 = borrowService0.returnBook("", "No due date found.");
        java.lang.Class<?> wildcardClass23 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str24 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean27 = borrowService0.returnBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str32 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList34 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found" + "'", str32, "No due date found");
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass2 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean24 = borrowService0.returnBook("hi!", "");
        java.lang.String str27 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str24 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean27 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        java.lang.String str29 = borrowService0.trackDueDates("", "");
        boolean boolean32 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        borrowUI0.returnBook(0);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 10);
        borrowUI0.borrowBook((int) (byte) 10, 1);
        borrowUI0.borrowBook((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean28 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(100);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str20 = borrowService0.trackDueDates("", "hi!");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean26 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str23 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2025-10-31" + "'", str6, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-10-31" + "'", str7, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2025-10-31" + "'", str14, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        borrowUI0.borrowBook((int) (short) 100, (int) ' ');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.lang.String str12 = borrow2.getMemberID();
        java.lang.String str13 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getISBN();
        boolean boolean13 = borrow2.isValid();
        boolean boolean14 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 10);
        borrowUI0.borrowBook((int) (byte) 10, 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean27 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean30 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2025-10-31" + "'", str20, "2025-10-31");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(100, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getMemberID();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean26 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean31 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass8 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.lang.String str30 = borrowService0.trackDueDates("No due date found.", "No due date found");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) ' ', (int) '#');
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean27 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.String str30 = borrowService0.trackDueDates("hi!", "");
        boolean boolean33 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "hi!");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2025-10-31" + "'", str11, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.borrowBook(10, 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        boolean boolean22 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, 100);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        boolean boolean22 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str25 = borrowService0.trackDueDates("hi!", "");
        boolean boolean28 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean31 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean33 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        boolean boolean29 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.borrowBook((int) (byte) 100, (int) (byte) 1);
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) '#', (int) (short) 100);
        borrowUI0.borrowBook((int) (short) 10, (int) 'a');
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2025-10-31" + "'", str22, "2025-10-31");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        boolean boolean26 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean25 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str28 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found" + "'", str28, "No due date found");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        boolean boolean21 = borrowService0.borrowBook("", "hi!");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found" + "'", str7, "No due date found");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook(100);
        borrowUI0.borrowBook((int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "hi!");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (short) -1, (int) 'a');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        java.lang.String str31 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str36 = borrowService0.trackDueDates("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "No due date found." + "'", str36, "No due date found.");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("2025-10-31");
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
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("hi!", "");
        java.lang.String str26 = borrowService0.trackDueDates("hi!", "No due date found");
        java.lang.String str29 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) '4');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        boolean boolean28 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((-1), 0);
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass11 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        boolean boolean11 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        borrowUI0.borrowBook((int) (short) 100, (int) ' ');
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass22 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.returnBook(1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(100);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("hi!", "");
        java.lang.String str26 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean22 = borrowService0.returnBook("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        java.lang.String str12 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "hi!");
        boolean boolean24 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((-1), (int) (short) -1);
        borrowUI0.borrowBook((int) (byte) 10, 100);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getMemberID();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
    }
}

