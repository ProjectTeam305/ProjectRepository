import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) -1);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 0);
        borrowUI0.borrowBook(0, (int) '4');
        borrowUI0.borrowBook((int) 'a', (-1));
        borrowUI0.borrowBook((int) '#', 100);
        java.lang.Class<?> wildcardClass19 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook((int) ' ', (int) '#');
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        boolean boolean16 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        java.lang.String str26 = borrowService0.trackDueDates("hi!", "");
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "No due date found.");
        java.lang.String str13 = borrowService0.trackDueDates("", "");
        java.lang.Class<?> wildcardClass14 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.String str30 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean26 = borrowService0.borrowBook("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean18 = borrowService0.returnBook("", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str16 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found" + "'", str16, "No due date found");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        boolean boolean28 = borrowService0.borrowBook("", "No due date found.");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean25 = borrowService0.returnBook("2025-10-31", "hi!");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 10, 100);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, (int) '4');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(10);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        boolean boolean29 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean34 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean13 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        data.Borrow borrow2 = new data.Borrow("No due date found", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.Class<?> wildcardClass5 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found" + "'", str4, "No due date found");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
        borrowUI0.returnBook(100);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.String str29 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2025-10-31" + "'", str26, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2025-10-31" + "'", str29, "2025-10-31");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook(0, (int) (byte) 100);
        borrowUI0.returnBook(100);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str24 = borrowService0.trackDueDates("", "hi!");
        java.lang.Class<?> wildcardClass25 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found." + "'", str24, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean34 = borrowService0.returnBook("No due date found", "");
        java.lang.String str37 = borrowService0.trackDueDates("No due date found", "2025-10-31");
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
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "No due date found." + "'", str37, "No due date found.");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        java.lang.Class<?> wildcardClass8 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 100, (int) (byte) 10);
        borrowUI0.borrowBook((-1), 0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("No due date found", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.lang.String str31 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean34 = borrowService0.borrowBook("2025-10-31", "No due date found");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("hi!");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) '4');
        borrowUI0.returnBook((int) '#');
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.borrowBook(0, (int) ' ');
        borrowUI0.returnBook((int) '4');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.borrowBook((int) (byte) -1, (int) '#');
        borrowUI0.borrowBook((int) 'a', (int) (short) -1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean9 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean19 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean22 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean18 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        java.lang.String str28 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean31 = borrowService0.returnBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found" + "'", str28, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        boolean boolean31 = borrowService0.returnBook("No due date found", "No due date found");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((-1));
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, 10);
        borrowUI0.returnBook((int) 'a');
        borrowUI0.borrowBook((int) (byte) -1, 0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean13 = borrowService0.borrowBook("", "");
        java.lang.String str16 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (byte) 100);
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(10);
        borrowUI0.borrowBook((-1), 10);
        borrowUI0.returnBook((int) '4');
        borrowUI0.borrowBook(0, (int) (short) 100);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str24 = borrowService0.trackDueDates("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found." + "'", str24, "No due date found.");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.lang.Class<?> wildcardClass6 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean30 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean33 = borrowService0.borrowBook("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean21 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.borrowBook((int) (short) 1, (int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook(10, (int) '4');
        borrowUI0.borrowBook((int) (byte) 10, (int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) -1, 100);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) 'a', (int) ' ');
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) -1, 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        boolean boolean16 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found." + "'", str19, "No due date found.");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean11 = borrowService0.returnBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str16 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean22 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        borrowUI0.borrowBook((-1), (int) (byte) 10);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        boolean boolean9 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass5 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass34 = borrowService0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.borrowBook((int) (byte) 100, (int) (byte) 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        boolean boolean29 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str32 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found" + "'", str32, "No due date found");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.lang.String str31 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean34 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean37 = borrowService0.borrowBook("", "");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        java.lang.Class<?> wildcardClass12 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found." + "'", str7, "No due date found.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        borrowUI0.borrowBook((-1), (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.showMenu();
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 10, (int) (short) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("");
        boolean boolean11 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("hi!");
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
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        boolean boolean29 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean32 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean35 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str38 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "No due date found" + "'", str38, "No due date found");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) 10);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "No due date found");
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.Class<?> wildcardClass7 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        boolean boolean31 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean34 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean37 = borrowService0.borrowBook("No due date found", "No due date found.");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2025-10-31" + "'", str20, "2025-10-31");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean13 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.Class<?> wildcardClass14 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found.");
        boolean boolean24 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.lang.String str28 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found." + "'", str28, "No due date found.");
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass12 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        boolean boolean32 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean35 = borrowService0.returnBook("No due date found.", "No due date found");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean26 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean29 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '4');
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found" + "'", str13, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean29 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.Class<?> wildcardClass31 = borrowService0.getClass();
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
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        boolean boolean18 = borrowService0.borrowBook("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '4');
        borrowUI0.borrowBook((-1), (int) '4');
        borrowUI0.showMenu();
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.borrowBook((int) (byte) 100, 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found.");
        boolean boolean26 = borrowService0.borrowBook("hi!", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(10, 10);
        borrowUI0.returnBook(0);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        boolean boolean32 = borrowService0.borrowBook("", "");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("2025-10-31");
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
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.borrowBook((int) (short) 100, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, 10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (byte) 100);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook(0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, 0);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.returnBook("", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.Class<?> wildcardClass9 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean7 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "");
        boolean boolean15 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook(1);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '4', (int) (short) -1);
        borrowUI0.returnBook(10);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean21 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (int) (short) 1);
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "2025-10-31");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2025-10-31" + "'", str3, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean16 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean22 = borrowService0.returnBook("", "No due date found");
        boolean boolean25 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean20 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        boolean boolean25 = borrowService0.borrowBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook(100);
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((-1), (int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean17 = borrowService0.returnBook("No due date found", "hi!");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean13 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook(100);
        java.lang.Class<?> wildcardClass8 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.returnBook((-1));
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean14 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str25 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean6 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean9 = borrowService0.returnBook("No due date found.", "No due date found.");
        boolean boolean12 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str15 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.returnBook((-1));
        borrowUI0.borrowBook((int) (short) -1, (int) (byte) 10);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean12 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean22 = borrowService0.borrowBook("hi!", "No due date found");
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
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) ' ');
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean15 = borrowService0.returnBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean6 = borrowService0.returnBook("No due date found", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found.", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean10 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        java.lang.Class<?> wildcardClass7 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(10, (int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        java.lang.String str12 = borrow2.getISBN();
        java.lang.String str13 = borrow2.getMemberID();
        java.lang.String str14 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        boolean boolean29 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean32 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean35 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        borrowUI0.borrowBook((-1), (int) (byte) 10);
        borrowUI0.showMenu();
        borrowUI0.returnBook((-1));
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean17 = borrowService0.returnBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) 'a');
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.borrowBook((int) (byte) 100, 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (byte) 100, 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "No due date found");
        java.lang.String str27 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean32 = borrowService0.borrowBook("No due date found", "");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.returnBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        java.lang.String str28 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found" + "'", str28, "No due date found");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("");
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
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        java.lang.String str21 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean24 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) '4', (int) (short) 100);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found");
        java.lang.String str19 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str25 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList4 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean7 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        java.lang.Class<?> wildcardClass16 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2025-10-31" + "'", str15, "2025-10-31");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "");
        java.lang.String str22 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2025-10-31" + "'", str22, "2025-10-31");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList21 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        boolean boolean9 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("No due date found", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean26 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        java.lang.String str12 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '#');
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook(0);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 100, (int) (byte) 10);
        borrowUI0.borrowBook((-1), 0);
        borrowUI0.returnBook((int) '#');
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        borrowUI0.showMenu();
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (byte) 0, 1);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.borrowBook("", "hi!");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        boolean boolean11 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "hi!");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str21 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean17 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) ' ');
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(10);
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.borrowBook((int) (short) 10, (int) 'a');
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.Class<?> wildcardClass10 = borrow2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((-1), (int) (short) 1);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.borrowBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean29 = borrowService0.borrowBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((-1), (int) (byte) 10);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.returnBook(100);
        borrowUI0.borrowBook((int) (byte) 10, 100);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.showMenu();
        borrowUI0.returnBook(0);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("", "");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        boolean boolean31 = borrowService0.borrowBook("2025-10-31", "No due date found.");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str20 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        boolean boolean25 = borrowService0.returnBook("hi!", "hi!");
        java.lang.String str28 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found" + "'", str28, "No due date found");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2025-10-31" + "'", str5, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2025-10-31" + "'", str7, "2025-10-31");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        borrowUI0.borrowBook(0, 100);
        borrowUI0.borrowBook((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("", "No due date found");
        boolean boolean24 = borrowService0.returnBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("No due date found", "No due date found");
        boolean boolean18 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        boolean boolean13 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.borrowBook("No due date found", "");
        boolean boolean21 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        boolean boolean18 = borrowService0.borrowBook("2025-10-31", "No due date found");
        boolean boolean21 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean8 = borrowService0.borrowBook("No due date found", "");
        boolean boolean11 = borrowService0.borrowBook("", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList9 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        data.Borrow borrow2 = new data.Borrow("", "2025-10-31");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2025-10-31" + "'", str3, "2025-10-31");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2025-10-31" + "'", str4, "2025-10-31");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("", "No due date found");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("No due date found.", "");
        boolean boolean6 = borrowService0.returnBook("hi!", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        java.lang.String str13 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        boolean boolean18 = borrowService0.returnBook("", "");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) -1);
        borrowUI0.borrowBook((int) (short) 100, 10);
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("hi!", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass18 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "2025-10-31");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2025-10-31" + "'", str3, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found" + "'", str7, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean22 = borrowService0.borrowBook("No due date found", "hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        boolean boolean18 = borrowService0.returnBook("", "hi!");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean24 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.lang.String str6 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "");
        java.lang.String str12 = borrowService0.trackDueDates("hi!", "");
        boolean boolean15 = borrowService0.returnBook("", "2025-10-31");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.lang.String str14 = borrowService0.trackDueDates("", "");
        java.lang.String str17 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean23 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean17 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean20 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, 10);
        borrowUI0.showMenu();
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        borrowUI0.returnBook((-1));
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.returnBook("2025-10-31", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean5 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean10 = borrowService0.returnBook("", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.Class<?> wildcardClass14 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "No due date found." + "'", str13, "No due date found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("", "2025-10-31");
        java.lang.String str20 = borrowService0.trackDueDates("", "2025-10-31");
        java.lang.Class<?> wildcardClass21 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2025-10-31" + "'", str20, "2025-10-31");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.borrowBook((int) ' ', (int) '#');
        borrowUI0.returnBook((int) 'a');
        borrowUI0.borrowBook((int) (short) 10, (int) (byte) 10);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        boolean boolean25 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean28 = borrowService0.borrowBook("", "");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found.", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass20 = strList19.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean17 = borrowService0.returnBook("", "No due date found.");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str26 = borrowService0.trackDueDates("", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        boolean boolean29 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList31 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean34 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean37 = borrowService0.returnBook("No due date found", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getISBN();
        boolean boolean10 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("hi!", "No due date found");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "");
        boolean boolean17 = borrowService0.borrowBook("", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.Class<?> wildcardClass20 = borrowService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        java.lang.String str15 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) '4');
        borrowUI0.borrowBook((int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found." + "'", str5, "No due date found.");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        java.lang.String str13 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(1);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.returnBook("", "No due date found");
        boolean boolean19 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
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
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.showMenu();
        borrowUI0.returnBook(10);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) '4', 10);
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        java.lang.Class<?> wildcardClass13 = borrowService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 100);
        borrowUI0.showMenu();
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) '4');
        borrowUI0.showMenu();
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean24 = borrowService0.borrowBook("2025-10-31", "No due date found");
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        java.lang.String str11 = borrowService0.trackDueDates("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str19 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "No due date found" + "'", str19, "No due date found");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("No due date found");
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
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "No due date found.");
        boolean boolean13 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 0, 0);
        borrowUI0.borrowBook((int) '4', (int) (short) 1);
        borrowUI0.returnBook(1);
        borrowUI0.returnBook((int) '#');
        borrowUI0.showMenu();
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "hi!");
        boolean boolean25 = borrowService0.borrowBook("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean19 = borrowService0.returnBook("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getISBN();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) ' ', (int) (byte) 10);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(1, (int) (short) 10);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str15 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.borrowBook(1, (int) '4');
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        data.Borrow borrow2 = new data.Borrow("2025-10-31", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        java.lang.String str7 = borrow2.getISBN();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found" + "'", str7, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        java.lang.String str29 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        java.lang.String str32 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "No due date found" + "'", str32, "No due date found");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        java.lang.String str15 = borrowService0.trackDueDates("hi!", "No due date found.");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean21 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.lang.String str24 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        boolean boolean29 = borrowService0.returnBook("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "No due date found" + "'", str24, "No due date found");
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        borrowUI0.borrowBook(0, 100);
        borrowUI0.returnBook((int) (byte) 100);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) (byte) -1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean13 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean16 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.returnBook("No due date found", "No due date found.");
        java.lang.String str25 = borrowService0.trackDueDates("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found." + "'", str25, "No due date found.");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (int) (short) 1);
        borrowUI0.borrowBook((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass12 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("No due date found", "No due date found.");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean33 = borrowService0.returnBook("2025-10-31", "No due date found.");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean19 = borrowService0.borrowBook("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        java.lang.String str20 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str6 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean9 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found" + "'", str12, "No due date found");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean13 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.lang.String str16 = borrowService0.trackDueDates("No due date found.", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "No due date found." + "'", str16, "No due date found.");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.Class<?> wildcardClass14 = borrowService0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) 'a', (int) (short) -1);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.lang.String str31 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.util.List<java.lang.String> strList33 = borrowService0.viewBorrowedBooks("No due date found");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "No due date found." + "'", str31, "No due date found.");
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.returnBook(0);
        borrowUI0.borrowBook(0, (int) (byte) 0);
        borrowUI0.borrowBook((int) (byte) -1, (-1));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        boolean boolean32 = borrowService0.returnBook("", "");
        boolean boolean35 = borrowService0.returnBook("hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("2025-10-31", "hi!");
        java.lang.String str25 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found" + "'", str22, "No due date found");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "No due date found" + "'", str25, "No due date found");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) 10, (int) ' ');
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) '#', (int) (byte) -1);
        borrowUI0.borrowBook((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        boolean boolean31 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        java.lang.String str34 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean37 = borrowService0.borrowBook("No due date found.", "");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "No due date found." + "'", str34, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("", "hi!");
        boolean boolean15 = borrowService0.returnBook("", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        boolean boolean21 = borrowService0.returnBook("No due date found.", "No due date found");
        boolean boolean24 = borrowService0.borrowBook("No due date found", "");
        boolean boolean27 = borrowService0.borrowBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        borrowUI0.returnBook((int) (byte) 1);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        boolean boolean3 = borrow2.isValid();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("");
        boolean boolean18 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        java.lang.String str12 = borrow2.getISBN();
        boolean boolean13 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean16 = borrowService0.borrowBook("hi!", "No due date found");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str21 = borrowService0.trackDueDates("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2025-10-31" + "'", str21, "2025-10-31");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) 'a');
        borrowUI0.borrowBook((int) (byte) 1, (int) '4');
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (byte) 100, (-1));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("No due date found", "");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "No due date found.");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found." + "'", str21, "No due date found.");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str16 = borrowService0.trackDueDates("", "hi!");
        boolean boolean19 = borrowService0.borrowBook("No due date found", "hi!");
        boolean boolean22 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.util.List<java.lang.String> strList24 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean27 = borrowService0.returnBook("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2025-10-31" + "'", str16, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.returnBook("No due date found", "");
        boolean boolean15 = borrowService0.returnBook("", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("2025-10-31", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getISBN();
        java.lang.String str8 = borrow2.getMemberID();
        boolean boolean9 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        java.lang.String str32 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean35 = borrowService0.returnBook("No due date found", "");
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (byte) 1, (int) ' ');
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList25 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str28 = borrowService0.trackDueDates("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "No due date found." + "'", str28, "No due date found.");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getMemberID();
        boolean boolean6 = borrow2.isValid();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getISBN();
        java.lang.String str10 = borrow2.getISBN();
        java.lang.String str11 = borrow2.getISBN();
        boolean boolean12 = borrow2.isValid();
        java.lang.String str13 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean12 = borrowService0.returnBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "");
        java.lang.String str18 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList29 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        boolean boolean19 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean22 = borrowService0.returnBook("No due date found", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        borrowUI0.borrowBook((int) 'a', (int) (byte) 1);
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 100);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        boolean boolean6 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "");
        java.lang.String str20 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("");
        boolean boolean25 = borrowService0.returnBook("hi!", "hi!");
        boolean boolean28 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList30 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str13 = borrowService0.trackDueDates("hi!", "hi!");
        boolean boolean16 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean19 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str22 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        boolean boolean25 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2025-10-31" + "'", str13, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found.", "No due date found");
        boolean boolean17 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 1, (int) '#');
        borrowUI0.borrowBook((int) (byte) -1, 10);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) (byte) 10);
        borrowUI0.returnBook((int) '#');
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean8 = borrowService0.returnBook("No due date found.", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean14 = borrowService0.returnBook("hi!", "No due date found.");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean23 = borrowService0.borrowBook("", "No due date found.");
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
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "No due date found");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found" + "'", str3, "No due date found");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("");
        boolean boolean26 = borrowService0.borrowBook("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean18 = borrowService0.returnBook("No due date found.", "No due date found");
        java.lang.String str21 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList23 = borrowService0.viewBorrowedBooks("2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "No due date found" + "'", str21, "No due date found");
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
        borrowUI0.borrowBook((int) (short) 100, (int) (short) 100);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        java.lang.String str5 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) '#', (int) (short) 100);
        borrowUI0.returnBook((int) (short) 0);
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("", "No due date found.");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        boolean boolean14 = borrowService0.returnBook("hi!", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList15 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str18 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
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
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found", "No due date found.");
        boolean boolean12 = borrowService0.borrowBook("No due date found", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2025-10-31" + "'", str17, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        boolean boolean12 = borrowService0.borrowBook("2025-10-31", "No due date found.");
        java.lang.String str15 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean18 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean21 = borrowService0.returnBook("2025-10-31", "No due date found");
        boolean boolean24 = borrowService0.returnBook("", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found." + "'", str15, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        boolean boolean11 = borrowService0.returnBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "hi!");
        java.lang.String str20 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("hi!", "No due date found.");
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        java.lang.String str29 = borrowService0.trackDueDates("2025-10-31", "No due date found");
        boolean boolean32 = borrowService0.returnBook("hi!", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2025-10-31" + "'", str18, "2025-10-31");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "No due date found" + "'", str29, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str8 = borrowService0.trackDueDates("hi!", "");
        boolean boolean11 = borrowService0.borrowBook("", "No due date found.");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        boolean boolean17 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList19 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean17 = borrowService0.returnBook("", "No due date found.");
        java.lang.String str20 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean23 = borrowService0.returnBook("No due date found.", "hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2025-10-31" + "'", str20, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("No due date found.", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("hi!");
        java.lang.String str14 = borrowService0.trackDueDates("No due date found", "hi!");
        java.lang.String str17 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found." + "'", str17, "No due date found.");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        boolean boolean9 = borrowService0.borrowBook("2025-10-31", "");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        boolean boolean15 = borrowService0.borrowBook("2025-10-31", "");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean20 = borrowService0.returnBook("", "2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook(100, (int) (short) -1);
        borrowUI0.borrowBook((int) (short) 1, (int) (short) 0);
        borrowUI0.borrowBook(0, (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        java.lang.String str30 = borrowService0.trackDueDates("No due date found", "hi!");
        java.util.List<java.lang.String> strList32 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList34 = borrowService0.viewBorrowedBooks("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found" + "'", str18, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean8 = borrowService0.returnBook("2025-10-31", "No due date found.");
        java.util.List<java.lang.String> strList10 = borrowService0.viewBorrowedBooks("hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean15 = borrowService0.returnBook("2025-10-31", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("2025-10-31", "");
        boolean boolean9 = borrowService0.borrowBook("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "No due date found.");
        boolean boolean15 = borrowService0.borrowBook("", "No due date found");
        boolean boolean18 = borrowService0.returnBook("2025-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
        borrowUI0.returnBook((int) (byte) 100);
        borrowUI0.borrowBook(1, (-1));
        borrowUI0.returnBook(10);
        borrowUI0.borrowBook((int) (byte) 0, 1);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("");
        boolean boolean10 = borrowService0.borrowBook("No due date found.", "hi!");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "No due date found");
        boolean boolean6 = borrowService0.returnBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("", "2025-10-31");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("No due date found.");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.lang.String str14 = borrowService0.trackDueDates("", "hi!");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean19 = borrowService0.borrowBook("2025-10-31", "hi!");
        java.lang.String str22 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "No due date found." + "'", str22, "No due date found.");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getMemberID();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.borrowBook((int) (short) -1, 10);
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        data.Borrow borrow2 = new data.Borrow("No due date found.", "");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getISBN();
        boolean boolean7 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        boolean boolean9 = borrowService0.returnBook("hi!", "hi!");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        boolean boolean17 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean20 = borrowService0.borrowBook("hi!", "");
        java.lang.String str23 = borrowService0.trackDueDates("hi!", "No due date found.");
        java.lang.String str26 = borrowService0.trackDueDates("No due date found", "");
        java.util.List<java.lang.String> strList28 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found" + "'", str14, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "No due date found" + "'", str26, "No due date found");
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.util.List<java.lang.String> strList17 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.borrowBook((-1), 10);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.borrowBook("No due date found", "2025-10-31");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((-1));
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
        borrowUI0.returnBook(0);
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("No due date found.", "No due date found");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.borrowBook("No due date found", "No due date found");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "hi!");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("hi!", "");
        boolean boolean14 = borrowService0.returnBook("No due date found", "");
        java.lang.String str17 = borrowService0.trackDueDates("No due date found.", "2025-10-31");
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        borrowUI0.borrowBook((int) '4', (int) (byte) 0);
        borrowUI0.showMenu();
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        boolean boolean8 = borrowService0.borrowBook("hi!", "hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found.");
        boolean boolean14 = borrowService0.returnBook("", "No due date found.");
        java.util.List<java.lang.String> strList16 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.lang.String str19 = borrowService0.trackDueDates("", "");
        boolean boolean22 = borrowService0.returnBook("No due date found", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2025-10-31" + "'", str19, "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        boolean boolean10 = borrow2.isValid();
        java.lang.String str11 = borrow2.getISBN();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        data.Borrow borrow2 = new data.Borrow("hi!", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        boolean boolean5 = borrow2.isValid();
        java.lang.String str6 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.borrowBook("", "");
        java.lang.String str9 = borrowService0.trackDueDates("", "No due date found");
        java.util.List<java.lang.String> strList11 = borrowService0.viewBorrowedBooks("No due date found");
        boolean boolean14 = borrowService0.returnBook("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("No due date found", "2025-10-31");
        boolean boolean20 = borrowService0.returnBook("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.borrowBook("", "2025-10-31");
        boolean boolean11 = borrowService0.borrowBook("2025-10-31", "No due date found");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.viewBorrowedBooks();
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        data.Borrow borrow2 = new data.Borrow("", "No due date found.");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        java.lang.String str30 = borrowService0.trackDueDates("No due date found.", "No due date found.");
        boolean boolean33 = borrowService0.returnBook("", "No due date found");
        boolean boolean36 = borrowService0.returnBook("No due date found.", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "No due date found" + "'", str15, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found" + "'", str27, "No due date found");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found" + "'", str30, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        data.Borrow borrow2 = new data.Borrow("", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getMemberID();
        boolean boolean7 = borrow2.isValid();
        java.lang.String str8 = borrow2.getMemberID();
        java.lang.String str9 = borrow2.getMemberID();
        java.lang.String str10 = borrow2.getISBN();
        boolean boolean11 = borrow2.isValid();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 10);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) -1);
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        data.Borrow borrow2 = new data.Borrow("hi!", "");
        java.lang.String str3 = borrow2.getMemberID();
        boolean boolean4 = borrow2.isValid();
        java.lang.String str5 = borrow2.getISBN();
        java.lang.String str6 = borrow2.getISBN();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.returnBook((int) (byte) 0);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("");
        java.lang.String str8 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean11 = borrowService0.returnBook("2025-10-31", "hi!");
        boolean boolean14 = borrowService0.borrowBook("", "No due date found");
        boolean boolean17 = borrowService0.borrowBook("hi!", "");
        boolean boolean20 = borrowService0.returnBook("2025-10-31", "");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        boolean boolean26 = borrowService0.returnBook("2025-10-31", "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 0, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook((int) (short) 100, (int) (byte) 1);
        borrowUI0.showMenu();
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.borrowBook("", "");
        java.lang.String str6 = borrowService0.trackDueDates("hi!", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        boolean boolean12 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean15 = borrowService0.borrowBook("hi!", "hi!");
        java.lang.String str18 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean21 = borrowService0.returnBook("", "No due date found");
        java.lang.String str24 = borrowService0.trackDueDates("No due date found.", "hi!");
        java.util.List<java.lang.String> strList26 = borrowService0.viewBorrowedBooks("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "No due date found." + "'", str18, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2025-10-31" + "'", str24, "2025-10-31");
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 100, (int) (short) 10);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        boolean boolean6 = borrowService0.returnBook("hi!", "");
        java.util.List<java.lang.String> strList8 = borrowService0.viewBorrowedBooks("hi!");
        boolean boolean11 = borrowService0.borrowBook("No due date found", "No due date found");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("", "");
        boolean boolean17 = borrowService0.returnBook("", "");
        boolean boolean20 = borrowService0.returnBook("No due date found.", "2025-10-31");
        java.lang.String str23 = borrowService0.trackDueDates("", "No due date found");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found" + "'", str23, "No due date found");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (byte) 10, 10);
        borrowUI0.returnBook(100);
        borrowUI0.returnBook((int) '4');
        java.lang.Class<?> wildcardClass10 = borrowUI0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        java.util.List<java.lang.String> strList7 = borrowService0.viewBorrowedBooks("No due date found");
        java.lang.String str10 = borrowService0.trackDueDates("No due date found.", "");
        java.util.List<java.lang.String> strList12 = borrowService0.viewBorrowedBooks("");
        boolean boolean15 = borrowService0.returnBook("hi!", "No due date found");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "No due date found." + "'", str10, "No due date found.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.returnBook((int) (short) 100);
        borrowUI0.returnBook(100);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.trackDueDates();
        borrowUI0.borrowBook(0, (-1));
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 10);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        borrowUI0.returnBook(0);
        borrowUI0.returnBook((int) (byte) 0);
        borrowUI0.trackDueDates();
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        data.Borrow borrow2 = new data.Borrow("hi!", "No due date found.");
        java.lang.String str3 = borrow2.getMemberID();
        java.lang.String str4 = borrow2.getISBN();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "No due date found." + "'", str4, "No due date found.");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList5 = borrowService0.viewBorrowedBooks("2025-10-31");
        boolean boolean8 = borrowService0.returnBook("", "No due date found");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found", "No due date found");
        java.lang.String str14 = borrowService0.trackDueDates("2025-10-31", "2025-10-31");
        boolean boolean17 = borrowService0.returnBook("2025-10-31", "No due date found.");
        boolean boolean20 = borrowService0.borrowBook("No due date found", "");
        boolean boolean23 = borrowService0.borrowBook("No due date found.", "2025-10-31");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found." + "'", str11, "No due date found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "No due date found." + "'", str14, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        borrowUI0.trackDueDates();
        borrowUI0.returnBook((int) '#');
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        business.BorrowService borrowService0 = new business.BorrowService();
        boolean boolean3 = borrowService0.returnBook("", "hi!");
        java.lang.String str6 = borrowService0.trackDueDates("No due date found", "");
        boolean boolean9 = borrowService0.borrowBook("", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found." + "'", str6, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook(0);
        borrowUI0.showMenu();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.showMenu();
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("", "hi!");
        java.lang.String str11 = borrowService0.trackDueDates("No due date found.", "hi!");
        boolean boolean14 = borrowService0.returnBook("No due date found", "2025-10-31");
        java.lang.String str17 = borrowService0.trackDueDates("", "No due date found");
        java.lang.String str20 = borrowService0.trackDueDates("", "2025-10-31");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "No due date found" + "'", str11, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "No due date found" + "'", str17, "No due date found");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found" + "'", str20, "No due date found");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        java.lang.String str13 = borrow2.getMemberID();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        business.BorrowUI.BorrowService borrowService0 = new business.BorrowUI.BorrowService();
        java.util.List<java.lang.String> strList2 = borrowService0.viewBorrowedBooks("");
        boolean boolean5 = borrowService0.returnBook("", "hi!");
        boolean boolean8 = borrowService0.borrowBook("No due date found.", "");
        boolean boolean11 = borrowService0.returnBook("", "hi!");
        java.util.List<java.lang.String> strList13 = borrowService0.viewBorrowedBooks("No due date found.");
        boolean boolean16 = borrowService0.borrowBook("", "");
        java.util.List<java.lang.String> strList18 = borrowService0.viewBorrowedBooks("");
        java.util.List<java.lang.String> strList20 = borrowService0.viewBorrowedBooks("No due date found.");
        java.util.List<java.lang.String> strList22 = borrowService0.viewBorrowedBooks("No due date found.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        java.lang.String str27 = borrowService0.trackDueDates("2025-10-31", "No due date found.");
        java.lang.String str30 = borrowService0.trackDueDates("No due date found", "2025-10-31");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "No due date found." + "'", str8, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "No due date found." + "'", str27, "No due date found.");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "No due date found." + "'", str30, "No due date found.");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        business.BorrowService borrowService0 = new business.BorrowService();
        java.lang.String str3 = borrowService0.trackDueDates("", "");
        boolean boolean6 = borrowService0.borrowBook("No due date found.", "hi!");
        java.lang.String str9 = borrowService0.trackDueDates("hi!", "2025-10-31");
        java.lang.String str12 = borrowService0.trackDueDates("", "");
        java.util.List<java.lang.String> strList14 = borrowService0.viewBorrowedBooks("");
        boolean boolean17 = borrowService0.returnBook("No due date found", "");
        java.lang.String str20 = borrowService0.trackDueDates("hi!", "No due date found");
        java.lang.String str23 = borrowService0.trackDueDates("No due date found", "hi!");
        boolean boolean26 = borrowService0.returnBook("hi!", "No due date found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "No due date found." + "'", str3, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found." + "'", str9, "No due date found.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "No due date found." + "'", str12, "No due date found.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "No due date found." + "'", str20, "No due date found.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "No due date found." + "'", str23, "No due date found.");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) 1);
        borrowUI0.returnBook((int) (short) 1);
        borrowUI0.borrowBook((int) (byte) -1, (int) (short) 0);
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) -1, (int) (short) 1);
        borrowUI0.trackDueDates();
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (short) 10);
        borrowUI0.borrowBook((int) (byte) 100, 0);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        business.BorrowUI borrowUI0 = new business.BorrowUI();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) 'a');
        borrowUI0.trackDueDates();
        borrowUI0.trackDueDates();
        borrowUI0.showMenu();
        borrowUI0.borrowBook((int) (short) 1, (int) ' ');
        borrowUI0.viewBorrowedBooks();
        borrowUI0.returnBook((int) (byte) -1);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        data.Borrow borrow2 = new data.Borrow("No due date found", "hi!");
        java.lang.String str3 = borrow2.getISBN();
        java.lang.String str4 = borrow2.getISBN();
        java.lang.String str5 = borrow2.getMemberID();
        java.lang.String str6 = borrow2.getMemberID();
        java.lang.String str7 = borrow2.getMemberID();
        boolean boolean8 = borrow2.isValid();
        java.lang.String str9 = borrow2.getMemberID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "No due date found" + "'", str5, "No due date found");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "No due date found" + "'", str6, "No due date found");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "No due date found" + "'", str7, "No due date found");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "No due date found" + "'", str9, "No due date found");
    }
}

