// Program to find the factors of a number

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named PrintFactorsUsingForLoop
public class PrintFactorsUsingForLoop {
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
            		// Use a for loop to iterate from 1 to number
            		System.out.println("Factors of " + number + " are:");
            		for (int i = 1; i <= number; i++) {
                		// Check if the number is perfectly divisible by i
                		if (number % i == 0) {
                    			// Print the factor
                    			System.out.print(i + " ");
                		}
            		}
            		System.out.println();
        	}
    	}
}
