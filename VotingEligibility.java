// Program to check whether a person can vote based on their age

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named VotingEligibility to check whether a person is eligible to vote
public class VotingEligibility {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter their age
		System.out.print("Enter your age: ");

		// Create a variable age to store the input age
		int age = sc.nextInt();

		// Check if the person is eligible to vote
		if (age >= 18) {
			// Print that the person can vote
			System.out.println("The person's age is " + age + " and can vote.");
		}
		else {
			// Print that the person cannot vote
			System.out.println("The person's age is " + age + " and cannot vote.");
		}
	}
}
