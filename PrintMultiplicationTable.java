// Program to print the multiplication table of a number entered by the user from 6 to 9

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named PrintMultiplicationTable
public class PrintMultiplicationTable {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter an integer
        	System.out.print("Enter an integer: ");

        	// Create a variable number to store the input integer
        	int number = sc.nextInt();

        	// Use a for loop to iterate from 6 to 9
        	for (int i = 6; i <= 9; i++) {
            		// Calculate the multiplication result
            		int result = number * i;

            		// Print the multiplication table line
            		System.out.println(number + " * " + i + " = " + result);
        	}
	}
}
