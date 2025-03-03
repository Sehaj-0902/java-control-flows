// Program to check if a number is an Abundant Number

// Import Scanner class from java.util package
import java.util.Scanner;

// Create a class named CheckAbundantNumber
public class CheckAbundantNumber {
    	public static void main(String[] args) {
        	// Create a scanner object
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter a number
        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

	        // Create an integer variable sum with initial value 0
        	int sum = 0;

        	for (int i = 1; i < number; i++) {
            		// Check if number is divisible by i
            		if (number % i == 0) {
                		sum += i;
            		}
        	}

        	// Check if sum is greater than number
        	if (sum > number) {
            		System.out.println("Abundant Number");
        	}
		else {
            		System.out.println("Not an Abundant Number");
        	}
    	}
}
