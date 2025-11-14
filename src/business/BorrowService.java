package business;

import java.util.*;

public class BorrowService {

    private final Map<String, List<String>> borrowedBooks = new HashMap<>();
    private final Map<String, String> dueDates = new HashMap<>();

    /**
     * Borrow a book for a member.
     */
    public boolean borrowBook(String memberID, String ISBN) {
        borrowedBooks.computeIfAbsent(memberID, k -> new ArrayList<>()).add(ISBN);
        dueDates.put(memberID + "_" + ISBN, "2025-10-31"); // Example due date
        System.out.println("Book with ISBN " + ISBN + " borrowed by member " + memberID);
        return true;
    }

    /**
     * Return a book for a member.
     */
    public boolean returnBook(String memberID, String ISBN) {
        List<String> books = borrowedBooks.get(memberID);
        if (books != null && books.remove(ISBN)) {
            dueDates.remove(memberID + "_" + ISBN);
            System.out.println("Book with ISBN " + ISBN + " returned by member " + memberID);
            return true;
        }
        return false;
    }

    /**
     * Track due date for a borrowed book.
     */
    public String trackDueDates(String memberID, String ISBN) {
        return dueDates.getOrDefault(memberID + "_" + ISBN, "No due date found.");
    }

    /**
     * View all borrowed books for a member.
     */
    public List<String> viewBorrowedBooks(String memberID) {
        return borrowedBooks.getOrDefault(memberID, Collections.emptyList());
    }
}