package presentation;

import data.DReports;
import java.util.Iterator;
import java.util.Scanner;

/// Presentation layer of the Reports use case, responsible for input/output, validation of user inputs, and displaying processed data in a usable form.
public class PReports {
    Scanner sc = new Scanner(System.in);
    DReports data = new DReports();

    /// empty constructor
    public PReports(){

    }

    ///  Prints the Services menu and validates input.
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
               
                Your Choice:\s""");

            int i = sc.nextInt();
            if (i >= 0 && i <= 3)return i;
            else System.out.println(":: Invalid input, please try again");
        }

    }

    /// Pauses the flow until the user inserts the signal to continue
    public void sleeping(){
        System.out.println("\n\n:: Insert anything to continue...");
        sc.next();
    }

    ///  Prints all borrowed books.
    public void AllBorrowed(){
        Iterator<Integer> iter = data.borrIter();
        System.out.println("All Borrowed:\n");
        for (int i = 0; i < data.getBorrSize(); i++) {
            System.out.println((i+1) + ".\nISBN: " + iter.next() + "\nBorrowed by: " + null + "\n" );

        }
    }

    ///  Prints all available books.
    public void AllAvailable(){
        Iterator<Integer> iter = data.avIter();
        System.out.println("All Available:\n");
        for (int i = 0; i < data.avSize(); i++) {
            System.out.println(iter.next());
        }
    }

    /// Takes books ISBN as input to validate its form using regular expression.
    public boolean validateISBN(int isbn){
        if (!String.valueOf(isbn).matches("^\\d{8}$")){
            System.out.println("Error: passed isbn is falsely formatted\nisbn:" + isbn);
            return false;
        }
        return true;
    }
}

