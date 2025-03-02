// Program to find the greatest factor of a number besides itself using for loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FindGreatestFactorUsingForLoop
public class FindGreatestFactorUsingForLoop {
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

            		// Use a for loop to iterate from number - 1 to 1
            		for (int i = number - 1; i >= 1; i--) {
                		// Check if the number is perfectly divisible by i
                		if (number % i == 0) {
                    			// Assign i to greatestFactor
                    			greatestFactor = i;
                    			// Break out of the loop
                    			break;
                		}
            		}

            		// Print the greatest factor
            		System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        	}
    	}
}
