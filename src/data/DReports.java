package data;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DReports {

    /// Temporary
    private static ArrayList<Book> books = new ArrayList<>(20);

    private static HashSet<Integer> avList = new HashSet<>();
    private static HashSet<Integer> borrList = new HashSet<>();

    public DReports(){

        for (int i = 0; i < 10; i++) {
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

    public void borrow(int ISPN){


            System.out.println("av removal: " + avList.remove(ISPN));
            System.out.println("borr Addition: " + borrList.add(ISPN));
            System.out.println("\n\n\n\nData: \n\n");
            for (int i : borrList) {
                System.out.println(i);
            }
    }

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

    public Iterator<Integer> borrIter(){

        return borrList.iterator();
    }

    public int getBorrSize(){
        return borrList.size();
    }

    public Iterator<Integer> avIter(){

        return avList.iterator();
    }

    public int avSize(){
        return avList.size();
    }

    /// not built yet

}
