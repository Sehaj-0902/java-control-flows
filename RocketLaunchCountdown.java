// Program to perform a rocket launch countdown

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named RocketLaunchCountdown
public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the starting countdown value
        System.out.print("Enter the starting countdown value: ");

        // Create a variable counter to store the input
        int counter = sc.nextInt();

        // Use a while loop to perform the countdown
        while (counter >= 1) {
            // Print the current countdown value
            System.out.println(counter);

            // Decrement the counter
            counter--;
        }
    }
}
