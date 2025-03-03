// Program to count the number of digits in an integer

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named DigitCounter
public class DigitCounter {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter an integer
        	System.out.print("Enter an integer: ");
        	int number = sc.nextInt();

        	// Create an integer variable count with value 0
        	int count = 0;

        	// Use a loop to iterate until number is not equal to 0
        	int tempNumber = number;
        	if (tempNumber == 0) {
            		count = 1;
        	}
		else {
			if (tempNumber < 0) { 
        			tempNumber = -tempNumber;
    			}
            		while (tempNumber != 0) {
                		// Remove the last digit from number in each iteration
                		tempNumber /= 10;

                		// Increase count by 1 in each iteration
                		count++;
            		}
        	}

        	// Print the count to show the number of digits
        	System.out.println("The number of digits in " + number + " is: " + count);
    	}
}
