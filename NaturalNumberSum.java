// Program to check for the natural number and print the sum of n natural numbers

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named NaturalNumberSum to check
public class NaturalNumberSum {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a number
        	System.out.println("Enter a number: ");

		// Create a variable number to store input number
		int number = sc.nextInt();

		// Check if the number is a natural number
		if (number>=0) {
			// Create a variable sum to calculate the sum of n natural numbers using the formula n * (n + 1) / 2
			int sum = number * (number + 1) / 2;
			// Print the sum of n natural numbers
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else {
			// Print that the number is not a natural number
			System.out.println("The number " + number + " is not a natural number");
		}
	}
}

