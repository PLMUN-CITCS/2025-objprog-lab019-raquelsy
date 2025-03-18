import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);
        
        // Display the result to the user
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read user input
        int number = -1; // Initialize the number with an invalid value

        // Continue prompting the user until a valid non-negative integer is entered
        while (true) {
            System.out.print("Please enter a non-negative integer: ");
            
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt(); // Read the input as an integer
                if (number >= 0) {
                    break; // Exit the loop if the input is a valid non-negative integer
                } else {
                    // If the number is negative, prompt the user again
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                // If the input is not an integer, display an error message and prompt again
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input to prevent an infinite loop
            }
        }

        return number; // Return the valid non-negative integer
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        // Handle the base case where factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        long factorial = 1; // Initialize the factorial variable

        // Use a loop to calculate the factorial for numbers greater than 0
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply the factorial by the current number
        }

        return factorial; // Return the calculated factorial
    }
}
