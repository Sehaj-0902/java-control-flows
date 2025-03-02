// Program to find the greatest factor of a number besides itself using while loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FindGreatestFactorUsingWhileLoop
public class FindGreatestFactorUsingWhileLoop {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter an integer
        	System.out.print("Enter an integer: ");

        	// Create a variable number to store the input integer
        	int number = sc.nextInt();

        	// Check if the number is a positive integer greater than 1
        	if (number <= 1) {
            		System.out.println("Please enter an integer greater than 1.");
        	}
		else {
            		// Create a variable greatestFactor to store the greatest factor, initialized to 1
            		int greatestFactor = 1;

            		// Create a variable counter and assign counter = number - 1
            		int counter = number - 1;

            		// Use a while loop till the counter is equal to 1
            		while (counter >= 1) {
        	        	// Check if the number is perfectly divisible by the counter
	                	if (number % counter == 0) {
                    			// Assign the counter to greatestFactor
                    			greatestFactor = counter;

                    			// Break out of the loop
                    			break;
                		}
                		// Decrement the counter
                		counter--;
            		}

            		// Print the greatest factor
            		System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        	}
    	}
}
