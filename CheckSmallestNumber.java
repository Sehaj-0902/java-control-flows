// Program to check if the first number is the smallest of three numbers

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create CheckSmallestNumber class to check if the first number is smallest
public class CheckSmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");

        // Create a variable number1 to store the first number
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");

        // Create a variable number2 to store the second number
        int number2 = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number: ");

        // Create a variable number3 to store the third number
        int number3 = scanner.nextInt();

        // Check if the first number is the smallest using comparison operators
        if((number1 < number2) && (number1 < number3)) {
		// Print the result of the check
        	System.out.println("Is the first number the smallest? Yes");
	}
	else {
        	// Print the result of the check
        	System.out.println("Is the first number the smallest? No");
	}

    }
}
