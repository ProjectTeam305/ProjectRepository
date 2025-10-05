package business;

import data.DReports;
import presentation.PReports;



/// Business Layer of the reports use case, controls 3 services
///
/// 1)Generate a list of all borrowed books and by whom.
///
/// 2)Generate overdue report.
///
/// 3)Show available books.
public class Reports {
    static PReports print = new PReports();
    static DReports data = new DReports();

    public static void run() {

        int s = -1;
        while  (true) {
            s = print.menuList();
            switch (s){
                case 1: showBorr();break;
                case 2: overdueReport();break;
                case 3: showAv(); break;
                case 0: return;
            }

            print.sleeping();


        }
    }

/// Passes print request to presentation class to show all {@code Borrowed} books
    public static void showBorr(){

        print.AllBorrowed();
    }

/** Passes print request to presentation class to show all {@code Available} books */
    public static void showAv(){
        print.AllAvailable();
    }


    /// Requests Borrow objects from data layer, creating a new list of past due ones then pass them to Presentation
    public static void overdueReport(){

    }


}
