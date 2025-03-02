// Program to find the sum of numbers until the user enters 0

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named SumUntilZero
public class SumUntilZero {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Create a variable total to store the sum of numbers, initialized to 0.0
        	double total = 0.0;

        	// Create a variable to store the user input
        	double userInput;

        	// Prompt the user to enter the first number
        	System.out.print("Enter a number (0 to exit): ");

		// Take user input
        	userInput = sc.nextDouble();

        	// Use a while loop to continue until the user enters 0
        	while (userInput != 0) {
            		// Add the user's input to the total
            		total += userInput;

            		// Prompt the user to enter the next number
            		System.out.print("Enter a number (0 to exit): ");

			// Again take user input
            		userInput = sc.nextDouble();
        	}
		// Print the total sum of numbers
        	System.out.println("Sum of numbers: " + total);
    	}
}
