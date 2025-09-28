package presentation;

import data.DReports;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PReports {
    Scanner sc = new Scanner(System.in);
    DReports data = new DReports();

    public PReports(){

    }

    public int menuList(){
        int c = 0;
        while (true){
            if (c++ % 3 == 0)System.out.println("""
                :: :: :: :: :: :: :: :: 
                This is the Reports & Notifications menu
                Please insert the number corresponding to the service
                
                1)Generate a list of all borrowed books and by whom.
                
                2)Generate overdue report.
                
                3)Show available books.
                
                0)Back to main menu.
                """);

            int i = sc.nextInt();
            if (i >= 0 && i <= 3)return i;
            else System.out.println(":: Invalid input, please try again");
        }

    }

    public void sleeping(){
        System.out.println("\n\n:: Insert anything to continue...");
        sc.next();
    }

    ///  Prints all borrowed book
    public void AllBorrowed(){
        Iterator<Integer> iter = data.borrIter();
        System.out.println("All Borrowed:\n");
        for (int i = 0; i < data.getBorrSize(); i++) {
            System.out.println(iter.next());
        }
    }

    public void AllAvailable(){
        Iterator<Integer> iter = data.avIter();
        System.out.println("All Available:\n");
        for (int i = 0; i < data.avSize(); i++) {
            System.out.println(iter.next());
        }
    }

    public boolean validateISBN(int isbn){
        if (!String.valueOf(isbn).matches("^\\d{8}$")){
            System.out.println("Error: passed isbn is falsely formatted\nisbn:" + isbn);
            return false;
        }
        return true;
    }
}

