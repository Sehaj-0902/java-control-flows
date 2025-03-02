// Program to check if a number is prime or not

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named CheckPrimeNumber
public class CheckPrimeNumber {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter a number
       		System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	// Check if the number is greater than 1
        	if (number <= 1) {
            		System.out.println(number + " is not a prime number.");
        	}
		else {
            		// Create a boolean variable to store the result
            		boolean isPrime = true;

            		// Loop through all the numbers from 2 to number - 1
            		for (int i = 2; i < number; i++) {
             		   	// Check if the number is divisible by i
		                if (number % i == 0) {
                    			// If divisible, it's not a prime number
                    			isPrime = false;

					// Break out of the loop
                    			break;
                		}
            		}

            		// Print the result
            		if (isPrime) {
                		System.out.println(number + " is a prime number.");
            		}
			else {
                		System.out.println(number + " is not a prime number.");
            		}
        	}
	}
}
