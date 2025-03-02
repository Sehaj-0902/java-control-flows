// Program to implement FizzBuzz using for loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FizzBuzzUsingForLoop
public class FizzBuzzUsingForLoop {
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
            		// Use a for loop to iterate from 1 to the number
            		for (int i = 1; i <= number; i++) {
                		// Check if the number is a multiple of 3 and 5
                		if (i % 3 == 0 && i % 5 == 0) {
                    			System.out.println("FizzBuzz");
                		}
                		// Check if the number is a multiple of 3
                		else if (i % 3 == 0) {
                    			System.out.println("Fizz");
                		}
                		// Check if the number is a multiple of 5
                		else if (i % 5 == 0) {
                   			System.out.println("Buzz");
                		}
                		// If not a multiple of 3 or 5, print the number
                		else {
                    			System.out.println(i);
                		}
            		}
        	}
	}
}
