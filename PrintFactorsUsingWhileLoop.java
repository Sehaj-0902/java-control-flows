// Program to find the factors of a number using while loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named PrintFactorsUsingWhileLoop
public class PrintFactorsUsingWhileLoop {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter a positive integer
        	System.out.print("Enter a positive integer: ");

        	// Create a variable number to store the input integer
        	int number = sc.nextInt();

        	// Check if the number is a positive integer
        	if (number <= 0) {
            		System.out.println("Please enter a positive integer.");
        	}
		else {
            		// Create a counter variable
            		int counter = 1;

            		System.out.println("Factors of " + number + " are:");

            		// Use a while loop to iterate from 1 to number
            		while (counter <= number) {
                		// Check if the number is perfectly divisible by the counter
                		if (number % counter == 0) {
                    			// Print the factor
                    			System.out.print(counter + " ");
                		}
                		// Increment the counter
                		counter++;
            		}
            		System.out.println();
        	}
    	}
}
