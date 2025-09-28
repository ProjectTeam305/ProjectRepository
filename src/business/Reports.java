package business;

import data.DReports;
import presentation.PReports;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Reports {
    static PReports print = new PReports();
    static DReports data = new DReports();

    public Reports(){

    }

    public static void main(String[] args) {


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

/// Passes print request to presentation class
    public static void showBorr(){

        print.AllBorrowed();
    }

    public static void showAv(){
        print.AllAvailable();
    }


    public static void overdueReport(){

    }


}
