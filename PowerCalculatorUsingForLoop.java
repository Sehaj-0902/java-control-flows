// Program to find the power of a number

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named PowerCalculatorUsingForLoop
public class PowerCalculatorUsingForLoop {
        public static void main(String[] args) {
                // Create a Scanner object to read input from the console
                Scanner sc = new Scanner(System.in);

                // Prompt the user to enter the number
                System.out.print("Enter the number: ");
                int number = sc.nextInt();

                // Prompt the user to enter the power
                System.out.print("Enter the power: ");
                int power = sc.nextInt();

                // Check if the number and power are positive integers
                if (number < 0 || power < 0) {
                        System.out.println("Please enter positive integers.");
                }
                else {
                        // Create a result variable with an initial value of 1
                        long result = 1;

                        // Use a for loop to calculate the power
                        for (int i = 1; i <= power; i++) {
                                result *= number;
                        }

                        // Print the result
                        System.out.println(number + " raised to the power of " + power + " is: " + result);
                }
        }
}
