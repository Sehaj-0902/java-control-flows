// Program to check whether a number is positive, negative, or zero

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named CheckNumber to check the number
public class CheckNumber {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");

		// Create a variable number to store the input number
		int number = sc.nextInt();

		// Check if the number is positive
		if (number > 0) {
			System.out.println("Positive");
		}
		// Check if the number is negative
		else if (number < 0) {
			System.out.println("Negative");
                }
		// If the number is neither positive nor negative, it must be zero
		else {
			System.out.println("Zero");
                }
	}
}
