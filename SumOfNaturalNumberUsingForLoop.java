// Program to find the sum of n natural numbers using for loop and comparing the result with the formula n*(n+1)/2

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named SumOfNaturalNumberUsingForLoop
public class SumOfNaturalNumberUsingForLoop {
	public static void main(String[] args) {
		// Create a Scanner object
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter a number
        	System.out.print("Enter a number: ");

        	// Create a variable number to store input number
        	int number = sc.nextInt();

        	// Check if the number is a natural number
        	if (number > 0) {
            		// Create a variable formulaSum to compute sum using the formula n*(n+1)/2
            		int formulaSum = number * (number + 1) / 2;

            		// Create a variable forLoopSum to compute sum using for loop
            		int forLoopSum = 0;
            		for (int i = 1; i <= number; i++) {
                		forLoopSum += i;
            		}

            		// Print the sum calculated using the formula
            		System.out.println("The sum using the formula is " + formulaSum);

            		// Print the sum calculated using for loop
            		System.out.println("The sum using for loop is " + forLoopSum);

            		// Compare the results
            		if (formulaSum == forLoopSum) {
                		System.out.println("Both the results match and are correct.");
            		}
			else {
                		System.out.println("The results do not match.");
            		}
        	}
    	}
}
