package data;

/**
 * Borrow class represents a borrowing transaction in the library.
 * It stores which member borrowed which book and the related dates.
 */
public class Borrow {
    public String borrowID;    // Unique transaction ID
    public String memberID;    // Member who borrowed the book
    public String ISBN;        // Book ISBN
    public String borrowDate;  // Borrow date
    public String dueDate;     // Due date
    public String returnDate;  // Return date
}
