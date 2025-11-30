import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.returnBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        java.lang.String str22 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean25 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean28 = borrowService0.returnBook("No due date found.", "");
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
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "2025-10-31");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2025-10-31" + "'", str3, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        boolean boolean11 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str26 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("No due date found.");
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
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) 10, (-1));
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        data.Borrow borrow2 = new data.Borrow("No due date found", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        boolean boolean18 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        java.lang.String str12 = borrow2.getISBN();
        java.lang.String str13 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("hi!", "");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) '4');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, (int) (byte) 100);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "No due date found");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "");
        boolean boolean27 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean30 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) -1, (int) (byte) 1);
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook(100, 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(10, (int) '#');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass17 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.borrowBook("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean20 = borrowService0.returnBook("hi!", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean21 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "No due date found");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        boolean boolean29 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str32 = borrowService0.trackDueDates("No due date found", "hi!");
        boolean boolean35 = borrowService0.returnBook("No due date found.", "No due date found");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.Class<?> wildcardClass28 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 10);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.borrowBook(100, 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(0, (int) (short) 10);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.borrowBook(0, (int) '4');
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("hi!", "");
        java.lang.String str26 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2025-10-31" + "'", str26, "2025-10-31");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((-1));
        borrowUI0.borrowBook((-1), (int) (byte) -1);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean9 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean15 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean6 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean9 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        borrowUI0.returnBook(100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean26 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean16 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str19 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.borrowBook((-1), (int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.borrowBook(0, (int) '#');
        borrowUI0.borrowBook(1, (int) ' ');
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean16 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean25 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        borrowUI0.borrowBook((int) (byte) -1, 1);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        boolean boolean29 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found." + "'", str26, "No due date found.");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean25 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean18 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean9 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean25 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        java.lang.Class<?> wildcardClass28 = borrowService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getMemberID();
        boolean boolean11 = borrow2.isValid();
        boolean boolean12 = borrow2.isValid();
        java.lang.String str13 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) '4', (int) (short) 1);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 100);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.returnBook("", "No due date found");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) 'a', (int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "");
        boolean boolean6 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean22 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("No due date found");
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
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("hi!", "");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        boolean boolean22 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean22 = borrowService0.borrowBook("No due date found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        java.lang.Class<?> wildcardClass19 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (short) 1);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("2025-10-31");
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
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str27 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2025-10-31" + "'", str27, "2025-10-31");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean25 = borrowService0.returnBook("", "hi!");
        java.lang.Class<?> wildcardClass26 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        boolean boolean30 = borrowService0.borrowBook("No due date found.", "No due date found");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.String str8 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str13 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found" + "'", str8, "No due date found");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) -1, 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.borrowBook(1, (-1));
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        boolean boolean12 = borrow2.isValid();
        java.lang.String str13 = borrow2.getMemberID();
        java.lang.String str14 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        borrowUI0.returnBook(10);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.borrowBook((int) (byte) -1, (int) '#');
        borrowUI0.borrowBook((int) 'a', (int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook(10);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean26 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean29 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.borrowBook((int) ' ', (int) (byte) 0);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.returnBook(1);
        borrowUI0.showMenu();
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "2025-10-31");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean16 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        boolean boolean22 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean25 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str28 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2025-10-31" + "'", str28, "2025-10-31");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        boolean boolean26 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean29 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean32 = borrowService0.borrowBook("hi!", "No due date found.");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        boolean boolean32 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean35 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str38 = borrowService0.trackDueDates("", "No due date found");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "No due date found." + "'", str38, "No due date found.");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        boolean boolean21 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        borrowUI0.borrowBook(100, 0);
        borrowUI0.returnBook((-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("hi!", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "");
        boolean boolean8 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean14 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.lang.String str12 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("");
        boolean boolean30 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 100, (int) ' ');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("hi!", "");
        boolean boolean17 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found");
        boolean boolean21 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("");
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
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean11 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "");
        boolean boolean21 = borrowService0.borrowBook("", "hi!");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean30 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("", "No due date found.");
        boolean boolean19 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean22 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean25 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean28 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str26 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str12 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean15 = borrowService0.returnBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) 'a', 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        java.lang.Class<?> wildcardClass27 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
        borrowUI0.returnBook(10);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.borrowBook("", "hi!");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook(10, (int) (byte) -1);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        boolean boolean18 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("hi!", "2025-10-31");
        java.lang.String str24 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "");
        boolean boolean30 = borrowService0.returnBook("", "");
        java.lang.String str33 = borrowService0.trackDueDates("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "No due date found" + "'", str33, "No due date found");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        boolean boolean26 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((-1), (int) (byte) 0);
        borrowUI0.borrowBook((int) (byte) 10, (int) (short) 1);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        borrowUI0.borrowBook((int) (byte) -1, (int) ' ');
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) ' ', (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(1, (int) 'a');
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str13 = borrowService0.trackDueDates("", "2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.returnBook(1);
        borrowUI0.borrowBook((int) '#', (int) '4');
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean26 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean29 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        boolean boolean19 = borrowService0.returnBook("hi!", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("hi!", "");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2025-10-31" + "'", str23, "2025-10-31");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        data.Borrow borrow2 = new data.Borrow("", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        java.lang.String str33 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str36 = borrowService0.trackDueDates("", "No due date found.");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2025-10-31" + "'", str33, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "No due date found." + "'", str36, "No due date found.");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass21 = strList20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        borrowUI0.borrowBook(100, (int) ' ');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("No due date found", "");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        borrowUI0.returnBook((-1));
        borrowUI0.borrowBook((int) (byte) 0, (int) '4');
        borrowUI0.showMenu();
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 0);
        borrowUI0.returnBook(1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((-1), (int) (short) 100);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        borrowUI0.borrowBook((int) '#', (int) (short) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean29 = borrowService0.borrowBook("hi!", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("hi!", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str24 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean27 = borrowService0.returnBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean13 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) '#');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 0, (int) ' ');
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 100);
        borrowUI0.returnBook((int) (short) 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '4', (int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        java.lang.String str23 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str21 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean20 = borrowService0.returnBook("No due date found", "");
        boolean boolean23 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean26 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 10);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 100, 10);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        java.lang.String str24 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str27 = borrowService0.trackDueDates("hi!", "hi!");
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
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        boolean boolean32 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean35 = borrowService0.returnBook("No due date found", "2025-10-31");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("", "No due date found.");
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
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.returnBook("", "");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        boolean boolean22 = borrowService0.returnBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass19 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        boolean boolean32 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean35 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str38 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2025-10-31" + "'", str38, "2025-10-31");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 100, (int) '#');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found.");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2025-10-31" + "'", str23, "2025-10-31");
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        data.Borrow borrow2 = new data.Borrow("", "");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        java.lang.String str35 = borrowService0.trackDueDates("2025-10-31", "No due date found");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2025-10-31" + "'", str35, "2025-10-31");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean29 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) '4', (int) ' ');
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean17 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        boolean boolean23 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "");
        boolean boolean26 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean29 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean32 = borrowService0.returnBook("No due date found.", "No due date found");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 100, 0);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        boolean boolean19 = borrowService0.returnBook("", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean19 = borrowService0.returnBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        java.lang.String str13 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        borrowUI0.borrowBook((-1), (-1));
        borrowUI0.returnBook(1);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        boolean boolean31 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str34 = borrowService0.trackDueDates("No due date found.", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No due date found." + "'", str34, "No due date found.");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean26 = borrowService0.returnBook("hi!", "");
        java.lang.String str29 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean20 = borrowService0.returnBook("hi!", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 10);
        borrowUI0.borrowBook((int) (byte) 10, 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean21 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str24 = borrowService0.trackDueDates("", "No due date found.");
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
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass5 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("hi!", "");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        borrowUI0.returnBook(1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) -1, (int) ' ');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        java.util.List<java.lang.String> strList37 = borrowService0.viewBorrowedBooks("");
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
        org.junit.Assert.assertNotNull(strList37);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.borrowBook((int) '4', 1);
        borrowUI0.borrowBook(1, (int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 100, (int) '#');
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (byte) 100);
        borrowUI0.returnBook((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.showMenu();
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "hi!");
        boolean boolean22 = borrowService0.returnBook("", "No due date found");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList27 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean30 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook(0);
        java.lang.Class<?> wildcardClass17 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 0);
        borrowUI0.returnBook(1);
        borrowUI0.borrowBook((int) (byte) 0, (int) (byte) 1);
        borrowUI0.borrowBook((int) (byte) 10, (int) ' ');
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "hi!");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        boolean boolean20 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}

