import java.util.Arrays;
import java.util.ArrayList;

public class LibMember {

    private String firstName;
    private String lastName;
    private char gender;
    private long cprNum;
    private String teleNum;
    private ArrayList<Book> booksIssued;
    private int numBooksIssued;

    //Default Constructor

    public LibMember(){
        firstName = "";
        lastName = "";
        gender = ' ';
        cprNum = 0;
        teleNum = "";
        booksIssued = new ArrayList<Book>(10);
        numBooksIssued = 0;


    }

    //Constructor with 5 parameters

    public LibMember(String fName, String lName, char G, long cpr, String tel){


        firstName = fName;
        lastName = lName;
        gender = G;
        cprNum = cpr;
        teleNum = tel;
        booksIssued = new ArrayList<Book>(10);
        numBooksIssued = 0;

    }

    //Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCprNum(long cprNum) {
        this.cprNum = cprNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public void setBooksIssued(Book bookIssued) {
        booksIssued.add(bookIssued);
    }

    public void setNumBooksIssued(int numBooksIssued) {
        this.numBooksIssued = numBooksIssued;
    }


    //Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public long getCprNum() {
        return cprNum;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public ArrayList<Book> getBooksIssued(){
        return booksIssued;
    }

    public int getNumBooksIssued() {
        return numBooksIssued;
    }


    //equals

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        return false;
    }

    //toString


    @Override
    public String toString() {
        return "firstName= " + firstName + "\n" +
                "lastName= " + lastName + "\n" +
                "gender= " + gender + "\n" +
                "cprNum= " + cprNum + "\n" +
                "teleNum= " + teleNum + "\n" +
                "numBooksIssued= " + numBooksIssued;
    }

    public boolean removeBook(Book book){
        //Find the book index in the issuedBooks array
        if (booksIssued.contains(book)) {
            booksIssued.remove(book);
            return true;
        }
        return false;
        }

    }


