package data;

/**
 * Borrow class represents a borrowing transaction in the library.
 * It stores which member borrowed which book and the related dates.
 */
public class Borrow {
    public int borrowID;    // Unique transaction ID
    public int memberID;    // Member who borrowed the book
    public int ISBN;        // Book ISBN
    public String borrowDate;  // Borrow date
    public String dueDate;     // Due date
    public String returnDate;  // Return date
}
