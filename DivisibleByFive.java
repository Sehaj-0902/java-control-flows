// Program to check if a number is divisible by 5

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create DivisibleByFive class to check divisibility
public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Create a variable number to store the input number
        int number = scanner.nextInt();

        // Check if the number is divisible by 5
	if (number % 5 == 0) {
		// Print the result of the divisibility check
        	System.out.println("Is the number " + number + " divisible by 5? Yes");
	}
	else {
        	// Print the result of the divisibility check
        	System.out.println("Is the number " + number + " divisible by 5? No");
	}
    }
}
