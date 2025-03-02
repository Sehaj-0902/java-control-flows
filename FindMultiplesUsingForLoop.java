// Program to find all multiples of a number below 100 using for loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FindMultiplesUsingForLoop
public class FindMultiplesUsingForLoop {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter a positive integer
        	System.out.print("Enter a positive integer: ");

        	// Create a variable number to store the input integer
        	int number = sc.nextInt();

        	// Check if the number is a positive integer and less than 100
        	if (number <= 0 || number >= 100) {
            		System.out.println("Please enter a positive integer less than 100.");
        	}
		else {
            		// Use a for loop to iterate from 100 to 1
            		System.out.println("Multiples of " + number + " below 100 are:");
            		for (int i = 100; i >= 1; i--) {
                		// Check if i is perfectly divisible by the number
                		if (i % number == 0) {
                    			// Print the multiple
                    			System.out.print(i + " ");
                		}
            		}
            		System.out.println();
        	}
    	}
}
