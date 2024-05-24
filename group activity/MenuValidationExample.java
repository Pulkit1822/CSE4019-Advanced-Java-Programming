import java.util.Scanner;

public class MenuValidationExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Display menu options
        System.out.println("Menu:");
        System.out.println("1. Perform Action 1");
        System.out.println("2. Perform Action 2");
        System.out.println("3. Exit");

        // Loop until a valid choice is made
        while (choice != 3) {
            System.out.print("Enter your choice: ");
            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                // Validate the choice
                if (choice >= 1 && choice <= 3) {
                    // Process the valid choice
                    switch (choice) {
                        case 1:
                            System.out.println("Performing Action 1...");
                            break;
                        case 2:
                            System.out.println("Performing Action 2...");
                            break;
                        case 3:
                            System.out.println("Exiting...");
                            break;
                    }
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            } else {
                // If the input is not an integer, clear the input buffer
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        // Close the scanner
        scanner.close();
    }
}
