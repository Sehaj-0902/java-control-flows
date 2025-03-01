// Program to check if the first, second, or third number is the largest of three numbers

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create CheckLargestNumber class to check which number is largest
public class CheckLargestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");

        // Create a variable number1 to store the first number
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");

        // Create a variable number2 to store the second number
        int number2 = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.println("Enter the third number: ");

        // Create a variable number3 to store the third number
        int number3 = scanner.nextInt();

        // Check if the first number is the largest using comparison operators
        boolean isFirstLargest = (number1 >= number2) && (number1 >= number3);

        // Check if the second number is the largest using comparison operators
        boolean isSecondLargest = (number2 >= number1) && (number2 >= number3);

        // Check if the third number is the largest using comparison operators
        boolean isThirdLargest = (number3 >= number1) && (number3 >= number2);

        // Print the results of the checks
        System.out.println("Is the first number the largest? " + (isFirstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (isSecondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (isThirdLargest ? "Yes" : "No"));
    }
}
