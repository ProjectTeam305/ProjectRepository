package main;

import business.BorrowUI; // or presentation.BorrowUI if you move the class
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Main class for the Library Management System.
 * Acts as the starting point for the application.
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        BorrowUI borrowUI = new BorrowUI();

        System.out.println("===== Library Management System =====");
        System.out.println("1. Book Management");
        System.out.println("2. Member Management");
        System.out.println("3. Borrow & Return System");
        System.out.println("4. Reports & Notifications");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Book Management Menu");
                break;

            case 2:
                System.out.println("Member Management Menu");
                break;

            case 3:
                borrowUI.showMenu();  // ✅ Connected to your Borrow & Return
                break;

            case 4:
                System.out.println("Reports & Notifications Menu");
                break;

            case 5:
                System.out.println("Exiting... Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }

        sc.close();
    }

    @Test
    void name() {
    }

    @Nested
    class MainTest {

        @Test
        void testmain() {
            // Simulate user input: choosing option 5 (Exit)
            String simulatedInput = "5\n";
            ByteArrayInputStream inputStream = new ByeArrayInputStream(simulatedInput.getBytes());
            System.setIn(inputStream);

            // Capture system output
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outputStream));

            // Run the main method
            main.main(new String[]{});

            // Restore original output stream
            System.setOut(originalOut);

            // Convert output to string and check expected output
            String output = outputStream.toString();

            assertTrue(output.contains("===== Library Management System ====="));
            assertTrue(output.contains("Exiting... Goodbye!"));
        }
    }
}