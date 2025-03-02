// Program to find all multiples of a number below 100 using while loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named FindMultiplesUsingWhileLoop
public class FindMultiplesUsingWhileLoop {
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
            		// Create a counter variable and assign counter = 99
            		int counter = 99;

            		System.out.println("Multiples of " + number + " below 100 are:");

            		// Use a while loop till the counter is >= 1
            		while (counter >= 1) {
                		// Check if the counter is perfectly divisible by the number
                		if (counter % number == 0) {
                    			// Print the multiple
                    			System.out.print(counter + " ");
                		}
                		// Decrement the counter
                		counter--;
            		}
            		System.out.println();
        	}
    	}
}
