// Program to find the sum of n natural numbers using while loop and comparing the result with the formula n*(n+1)/2

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named SumOfNaturalNumberUsingWhileLoop
public class SumOfNaturalNumberUsingWhileLoop {
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

			// Create a variable whileLoopSum to compute sum using while loop
			int whileLoopSum = 0;
			int i = 1;
			while (i <= number) {
				whileLoopSum += i;
				i++;
			}

			// Print the sum calculated using the formula
			 System.out.println("The sum using the formula is " + formulaSum);

			// Print the sum calculated using while loop
                         System.out.println("The sum using while loop is " + whileLoopSum);

			// Compare the results
			if (formulaSum == whileLoopSum) {
				System.out.println("Both the results match and are correct.");
			}
			else {
				System.out.println("The results do not match.");
			}
		}
	}
}
