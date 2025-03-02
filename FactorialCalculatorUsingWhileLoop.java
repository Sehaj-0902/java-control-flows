// Program to find the factorial of an integer using while loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FactorialCalculatorUsingWhileLoop
public class FactorialCalculatorUsingWhileLoop {
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

            		// Create a variable i for the while loop, initialized to 1
            		int i = 1;

            		// Use a while loop to compute the factorial
            		while (i <= number) {
                		factorial *= i;
                		i++;
            		}

            		// Print the factorial
            		System.out.println("The factorial of " + number + " is " + factorial);
        	}
    	}
}
