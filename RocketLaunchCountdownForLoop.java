// Program to perform a rocket launch countdown using for-loop

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named RocketLaunchCountdownForLoop
public class RocketLaunchCountdownForLoop {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter the starting countdown value
        	System.out.print("Enter the starting countdown value: ");

        	// Create a variable counter to store the input
        	int counter = sc.nextInt();

        	// Use a for loop to perform the countdown
        	for (int i = counter; i >= 1; i--) {
            		// Print the current countdown value
            		System.out.println(i);
        	}
	}
}
