// Program to check if a number is a Harshad Number

// Import Scanner class from java.util package
import java.util.Scanner;

// Create a class named CheckHarshadNumber
public class CheckHarshadNumber {
	public static void main(String[] args) {
		// Create a scanner object
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Create a variable sum, initialized to 0
		int sum = 0;

		// Create a variable tempNumber to store value of number
		int tempNumber = number;

		// To handle negative numbers
		if (tempNumber < 0) {
			tempNumber = -tempNumber;
		}
		// Use while to add digits of the number
		while (tempNumber != 0) {
			int digit = tempNumber % 10;
			sum += digit;
			tempNumber /= 10;
		}

		// Check if the number is a Harshad Number
		if (number % sum == 0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}
	}
}
