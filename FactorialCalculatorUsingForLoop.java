// Program to find the factorial of an integer using for loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FactorialCalculatorUsingForLoop
public class FactorialCalculatorUsingForLoop {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

      		// Prompt the user to enter an integer
        	System.out.print("Enter a positive integer: ");

        	// Create a variable number to store the input integer
        	int number = sc.nextInt();

        	// Check if the number is a positive integer
        	if (number < 0) {
            		System.out.println("Factorial is not defined for negative numbers.");
        	}
		else if (number == 0) {
            		System.out.println("The factorial of 0 is 1");
        	}
		else {
            		// Create a variable factorial to store the factorial, initialized to 1
            		long factorial = 1;

            		// Use a for loop to compute the factorial
            		for (int i = 1; i <= number; i++) {
                		factorial *= i;
            		}

            		// Print the factorial
            		System.out.println("The factorial of " + number + " is " + factorial);
        	}
    	}
}
