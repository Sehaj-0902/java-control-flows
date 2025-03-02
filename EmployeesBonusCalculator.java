// Program to calculate employee bonus based on years of service

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named EmployeesBonusCalculator
public class EmployeesBonusCalculator {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter the employee's salary
        	System.out.print("Enter employee's salary: ");

        	// Create a variable salary to store the salary
        	double salary = sc.nextDouble();

        	// Prompt the user to enter the employee's years of service
        	System.out.print("Enter employee's years of service: ");

        	// Create a variable yearsOfService to store the years of service
        	int yearsOfService = sc.nextInt();

        	// Check if the employee's years of service are more than 5
        	if (yearsOfService > 5) {
            		// Calculate the bonus amount (5% of salary)
            		double bonusAmount = 0.05 * salary;

            		// Print the bonus amount
            		System.out.println("Bonus amount: " + bonusAmount);
        	}
		else {
            		// Print a message indicating no bonus is applicable
            		System.out.println("No bonus is applicable for employees with 5 or fewer years of service.");
        	}
    	}
}
