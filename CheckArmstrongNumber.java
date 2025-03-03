// Program to check if a number is Armstrong or not

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named CheckArmstrongNumber
public class CheckArmstrongNumber {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter an integer
        	System.out.print("Enter an integer: ");
        	int number = sc.nextInt();

        	// Define a variable sum, initialize it to zero
        	int sum = 0;

        	// Define a variable originalNumber and assign it to input number variable
        	int originalNumber = number;

        	// Use the while loop till the originalNumber is not equal to zero
        	while (originalNumber != 0) {
            		// Find each digit which is the remainder of the modulus operation number % 10
            		int digit = originalNumber % 10;

            		// Find the cube of the number and add it to the sum variable
            		sum += Math.pow(digit, 3);

            		// Find the quotient of the number using the division operation number/10 and assign it to the original number
			// This removes the last digit of the original number
            		originalNumber /= 10;
        	}

        	// Finally check if the number and the sum are the same, if same then it is an Armstrong number
		// Print the results accordingly
        	if (sum == number) {
            		System.out.println(number + " is an Armstrong number.");
        	}
		else {
            		System.out.println(number + " is not an Armstrong number.");
        	}
    	}
}
