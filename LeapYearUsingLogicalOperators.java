// Program to determine if a year is a leap year using logical operators

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named LeapYearUsingLogicalOperators
public class LeapYearUsingLogicalOperators {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter a year
        	System.out.print("Enter a year (>= 1582): ");
        	int year = sc.nextInt();

      		// Check if the year is valid (>= 1582)
        	if (year < 1582) {
            		System.out.println("Please enter a year greater than or equal to 1582.");
        	}
		else {
            		// Using Single if statement with logical operators
            		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                		System.out.println(year + " is a Leap Year.");
            		}
			else {
                		System.out.println(year + " is not a Leap Year.");
            		}
        	}
    	}
}
