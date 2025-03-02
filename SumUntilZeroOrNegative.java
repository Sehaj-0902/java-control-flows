// Program to find the sum of numbers until the user enters 0 or a negative number

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named SumUntilZeroOrNegative
public class SumUntilZeroOrNegative {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Create a variable total to store the sum of numbers, initialized to 0.0
        	double total = 0.0;

        	// Create a variable to store the user input
        	double userInput;

        	// Use an infinite while loop
        	while (true) {
            		// Prompt the user to enter a number
            		System.out.print("Enter a number (0 or negative to exit): ");

            		// Take user input
            		userInput = sc.nextDouble();

            		// Check if the user entered 0 or a negative number
            		if (userInput <= 0) {
                		// Break out of the loop if 0 or negative
                		break;
            		}

        	    	// Add the user's input to the total
            		total += userInput;
        	}

	        // Print the total sum of numbers
        	System.out.println("Sum of numbers: " + total);
    	}
}
