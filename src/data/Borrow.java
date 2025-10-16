
/**
 * Borrow class represents a borrowing transaction in the library.
 * It stores which member borrowed which book and the related dates.
 */

package data;

public class Borrow {
    private String memberID;
    private String ISBN;

    public Borrow(String memberID, String ISBN) {
        this.memberID = memberID;
        this.ISBN = ISBN;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isValid() {
        return memberID != null && !memberID.isEmpty() && ISBN != null && !ISBN.isEmpty();
    }
}
