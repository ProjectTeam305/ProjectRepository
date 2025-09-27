import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            
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
                    System.out.println("Borrow & Return System Menu");
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
        }
    }
}
