package data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/// Data layer of the Reports use case, responsible for storage and retrieval of data abstractedly.
public class DReports {

    /// A set of book objects as value where ISBN is the key for the value.  {@code (currently dull)}
    private static HashMap<Integer,BookTemp> books = new HashMap<>();
    /// A list of books label as "available"
    private static HashSet<Integer> avList = new HashSet<>();
    /// A list of books labeled as
    private static HashSet<Integer> borrList = new HashSet<>();

    /// constructor generates dull items in the list for testing.
    public DReports(){

        for (int i = 1; i < 9; i++) {
            String t = "";
            for (int j = 0; j < 8; j++) {
                t = t.concat("" + i);
            }
            if (i % 2 == 0)avList.add(Integer.parseInt(t));
            else borrList.add(Integer.parseInt(t));
        }
//
//        avList.add(11111111);
//        avList.add(22222222);
//        avList.add(33333333);
//        avList.add(44444444);
//
//        borrList.add(55555555);
//        borrList.add(66666666);
//        borrList.add(77777777);
//        borrList.add(88888888);
    }

    /// takes book ISBN as parameter to label it as BORROWED.
    public void borrow(int ISPN){


            System.out.println("av removal: " + avList.remove(ISPN));
            System.out.println("borr Addition: " + borrList.add(ISPN));
            System.out.println("\n\n\n\nData: \n\n");
            for (int i : borrList) {
                System.out.println(i);
            }
    }

    /// takes book ISBN as parameter to label it as AVAILABLE.
    public void avail(int ISPN){


        borrList.remove(ISPN);
        avList.add(ISPN);

//        System.out.println("av Addition: " + borrList.add(ISPN));
//        System.out.println("borr removal: " + avList.remove(ISPN));
//        System.out.println("\n\n\n\nData: \n\n");
//        for (int i:borrList){
//            System.out.println(i);
//        }
    }

    /// returns an iteration object of the current Borrowed books list.
    public Iterator<Integer> borrIter(){

        return borrList.iterator();
    }

    /// returns the number of Borrowed books.
    public int getBorrSize(){
        return borrList.size();
    }

    /// returns an Iterator object of the current Available books list.
    public Iterator<Integer> avIter(){

        return avList.iterator();
    }

    /// returns the number of Available books.
    public int getAvSize(){
        return avList.size();
    }


}
