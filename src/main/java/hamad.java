

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/* ===========================
   MODELS
   =========================== */

/**
 * Represents a Book entity with basic attributes:
 * ISBN (unique), title, author, and category.
 */
class Book {
    private String isbn;
    private String title;
    private String author;
    private String category;

    public Book(String isbn, String title, String author, String category) {
        this.isbn = isbn == null ? "" : isbn.trim();
        this.title = title == null ? "" : title.trim();
        this.author = author == null ? "" : author.trim();
        this.category = category == null ? "" : category.trim();
    }

    public Book() {}

    // Standard getters & setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    /**
     * Override toString to return a human-readable book description.
     */
    @Override
    public String toString() {
        return String.format("Book{isbn='%s', title='%s', author='%s', category='%s'}",
                isbn, title, author, category);
    }
}

/**  b
 * Represents a Loan record when a book is borrowed.
 * Includes ISBN, borrower, borrow date, due date, and status.
 */
class Loan {
    private final String isbn;
    private final String borrowerName;
    private final LocalDate borrowedOn;
    private final LocalDate dueOn;
    private boolean returned;

    public Loan(String isbn, String borrowerName, LocalDate borrowedOn, LocalDate dueOn) {
        this.isbn = isbn;
        this.borrowerName = borrowerName;
        this.borrowedOn = borrowedOn;
        this.dueOn = dueOn;
        this.returned = false; // initially false
    }

    // Standard getters
    public String getIsbn() { return isbn; }
    public String getBorrowerName() { return borrowerName; }
    public LocalDate getBorrowedOn() { return borrowedOn; }
    public LocalDate getDueOn() { return dueOn; }
    public boolean isReturned() { return returned; }

    /**
     * Mark a loan as returned (set status to true).
     */
    public void markReturned() { this.returned = true; }

    @Override
    public String toString() {
        return String.format("Loan{isbn='%s', borrower='%s', borrowedOn=%s, dueOn=%s, returned=%s}",
                isbn, borrowerName, borrowedOn, dueOn, returned);
    }
}

/* ===========================
   DATA (IN-MEMORY STORAGE)
   =========================== */

/**
 * Repository for storing and retrieving books (in-memory).
 * Acts like a database but stored in a HashMap.
 */
class BookRepository {
    private final Map<String, Book> byIsbn = new HashMap<>();

    /** Add or update a book record. */
    public void upsert(Book book) { byIsbn.put(book.getIsbn(), book); }

    /** Find a book by ISBN. */
    public Optional<Book> findByIsbn(String isbn) { return Optional.ofNullable(byIsbn.get(isbn)); }

    /** Delete a book by ISBN. Returns true if deleted. */
    public boolean deleteByIsbn(String isbn) { return byIsbn.remove(isbn) != null; }

    /** Return all books stored. */
    public List<Book> findAll() { return new ArrayList<>(byIsbn.values()); }

    /**
     * Search for books using a query string.
     * Matches against title, author, or ISBN (case-insensitive).
     */
    public List<Book> search(String query) {
        String q = (query == null ? "" : query.toLowerCase());
        return byIsbn.values().stream()
                .filter(b -> b.getTitle().toLowerCase().contains(q)
                        || b.getAuthor().toLowerCase().contains(q)
                        || b.getIsbn().toLowerCase().contains(q))
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }
}

/**
 * Repository for storing loan records (in-memory).
 */
class LoanRepository {
    private final List<Loan> loans = new ArrayList<>();

    /** Add a new loan record. */
    public void add(Loan loan) { loans.add(loan); }

    /** Return all loans, including returned and active ones. */
    public List<Loan> findAll() { return new ArrayList<>(loans); }

    /**
     * Return all active (not returned) loans for a specific ISBN.
     */
    public List<Loan> findActiveByIsbn(String isbn) {
        return loans.stream()
                .filter(l -> l.getIsbn().equals(isbn) && !l.isReturned())
                .collect(Collectors.toList());
    }
}

/* ===========================
   BUSINESS (LOGIC)
   =========================== */

/**
 * Business logic for books (validation + repository operations).
 */
class BookService {
    private final BookRepository repo;
    public BookService(BookRepository repo) { this.repo = repo; }

    /**
     * Add a new book. Validates that all required fields are present
     * and ISBN is unique.
     */
    public void addBook(String isbn, String title, String author, String category) {
        require(isbn, "ISBN");
        require(title, "Title");
        require(author, "Author");
        require(category, "Category");
        if (repo.findByIsbn(isbn).isPresent())
            throw new IllegalArgumentException("A book with this ISBN already exists.");
        repo.upsert(new Book(isbn, title, author, category));
    }

    /**
     * Edit an existing book. Only non-blank values will be updated.
     */
    public void editBook(String isbn, String newTitle, String newAuthor, String newCategory) {
        Book b = repo.findByIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("Book not found."));
        if (notBlank(newTitle)) b.setTitle(newTitle);
        if (notBlank(newAuthor)) b.setAuthor(newAuthor);
        if (notBlank(newCategory)) b.setCategory(newCategory);
        repo.upsert(b);
    }

    /** Delete a book by ISBN. */
    public boolean deleteBook(String isbn) { return repo.deleteByIsbn(isbn); }

    /** Search books by title/author/ISBN. */
    public List<Book> search(String query) { return repo.search(query); }

    /** Return all stored books. */
    public List<Book> listAll() { return repo.findAll(); }

    private void require(String v, String field) {
        if (v == null || v.isBlank()) throw new IllegalArgumentException(field + " is required.");
    }
    private boolean notBlank(String s) { return s != null && !s.isBlank(); }
}

/**
 * Business logic for loans (borrowing and returning).
 */
class LoanService {
    private final BookRepository bookRepo;
    private final LoanRepository loanRepo;

    public LoanService(BookRepository bookRepo, LoanRepository loanRepo) {
        this.bookRepo = bookRepo; this.loanRepo = loanRepo;
    }

    /**
     * Borrow a book. Requires:
     * - Book must exist
     * - Borrower name not blank
     * - Due date not before today
     */
    public void borrow(String isbn, String borrowerName, LocalDate dueOn) {
        bookRepo.findByIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("Book not found."));
        if (borrowerName == null || borrowerName.isBlank())
            throw new IllegalArgumentException("Borrower name is required.");
        if (dueOn == null || dueOn.isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Due date must be today or future.");
        loanRepo.add(new Loan(isbn, borrowerName, LocalDate.now(), dueOn));
    }

    /**
     * Mark the first active loan of this ISBN as returned.
     */
    public boolean returnOne(String isbn) {
        var active = loanRepo.findActiveByIsbn(isbn);
        if (active.isEmpty()) return false;
        active.get(0).markReturned();
        return true;
    }

    /** Return all loans (active + returned). */
    public List<Loan> allLoans() { return loanRepo.findAll(); }
}

/**
 * Service for generating overdue notifications.
 */
class NotificationService {
    /**
     * Create a list of messages for loans that are overdue.
     */
    public List<String> overdueMessages(List<Loan> loans) {
        LocalDate today = LocalDate.now();
        List<String> msgs = new ArrayList<>();
        for (Loan l : loans) {
            if (!l.isReturned() && l.getDueOn().isBefore(today)) {
                msgs.add(String.format("OVERDUE: ISBN %s (borrower: %s) was due on %s",
                        l.getIsbn(), l.getBorrowerName(), l.getDueOn()));
            }
        }
        return msgs;
    }
}

/* ===========================
   PRESENTATION (MAIN APP)
   =========================== */

/**
 * Console-based UI to interact with the library system.
 * Supports all operations via text menu.
 */

public class hamad {
    private final BookService bookService;
    private final LoanService loanService;
    private final NotificationService notificationService;
    private final Scanner in = new Scanner(System.in);

    public hamad() {
        var bookRepo = new BookRepository();
        var loanRepo = new LoanRepository();
        this.bookService = new BookService(bookRepo);
        this.loanService = new LoanService(bookRepo, loanRepo);
        this.notificationService = new NotificationService();
    }

    public static void main(String[] args) { new hamad().run(); }

    public static void showMenu() {
        new hamad().run();
    }

    /**
     * Main program loop: show menu, read user input,
     * and call the right method.
     */
    private void run() {
        while (true) {
            menu();
            String c = in.nextLine().trim();
            try {
                switch (c) {
                    case "1": addBook(); break;
                    case "2": editBook(); break;
                    case "3": deleteBook(); break;
                    case "4": searchBooks(); break;
                    case "5": listAll(); break;
                    case "6": borrowBook(); break;
                    case "7": returnBook(); break;
                    case "8": showOverdues(); break;
                    case "0":
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        }
    }

    /** Print menu options for the user. */
    private void menu() {
        System.out.println("==== Library Management ====");
        System.out.println("1) Add Book");
        System.out.println("2) Edit Book");
        System.out.println("3) Delete Book");
        System.out.println("4) Search Books");
        System.out.println("5) List All Books");
        System.out.println("6) Borrow Book");
        System.out.println("7) Return Book");
        System.out.println("8) Overdue Notifications");
        System.out.println("0) Exit");
        System.out.print("Choose: ");
    }

    /** Add a new book by reading details from user input. */
    private void addBook() {
        System.out.print("ISBN: "); String isbn = in.nextLine();
        System.out.print("Title: "); String title = in.nextLine();
        System.out.print("Author: "); String author = in.nextLine();
        System.out.print("Category: "); String category = in.nextLine();
        bookService.addBook(isbn, title, author, category);
        System.out.println("Book added.");
    }

    /** Edit an existing book (only non-blank inputs are applied). */
    private void editBook() {
        System.out.print("ISBN to edit: "); String isbn = in.nextLine();
        System.out.print("New title (blank=skip): "); String t = in.nextLine();
        System.out.print("New author (blank=skip): "); String a = in.nextLine();
        System.out.print("New category (blank=skip): "); String c = in.nextLine();
        bookService.editBook(isbn, b2n(t), b2n(a), b2n(c));
        System.out.println("Book updated.");
    }

    /** Delete a book by ISBN. */
    private void deleteBook() {
        System.out.print("ISBN to delete: "); String isbn = in.nextLine();
        boolean ok = bookService.deleteBook(isbn);
        System.out.println(ok ? "Deleted." : "Not found.");
    }

    /** Search for books by title/author/ISBN. */
    private void searchBooks() {
        System.out.print("Query: "); String q = in.nextLine();
        var results = bookService.search(q);
        if (results.isEmpty()) System.out.println("No results.");
        else results.forEach(System.out::println);
    }

    /** List all books stored in the system. */
    private void listAll() {
        var all = bookService.listAll();
        if (all.isEmpty()) System.out.println("No books.");
        else all.forEach(System.out::println);
    }

    /** Borrow a book (creates a new loan record). */
    private void borrowBook() {
        System.out.print("ISBN: "); String isbn = in.nextLine();
        System.out.print("Borrower name: "); String name = in.nextLine();
        System.out.print("Due in days: "); int days = Integer.parseInt(in.nextLine());
        loanService.borrow(isbn, name, LocalDate.now().plusDays(days));
        System.out.println("Loan created.");
    }

    /** Return a borrowed book (by ISBN). */
    private void returnBook() {
        System.out.print("ISBN to return: "); String isbn = in.nextLine();
        boolean ok = loanService.returnOne(isbn);
        System.out.println(ok ? "Marked returned." : "No active loan.");
    }

    /** Show overdue loans as notifications. */
    private void showOverdues() {
        var msgs = notificationService.overdueMessages(loanService.allLoans());
        if (msgs.isEmpty()) System.out.println("No overdue items.");
        else msgs.forEach(System.out::println);
    }

    /** Convert blank input to null (helper for skipping fields in edit). */
    private String b2n(String s) { return (s == null || s.isBlank()) ? null : s; }
}