// Program to check if it is Spring Season

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named SpringSeason to check if it is Spring Season
public class SpringSeason {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the month
		System.out.print("Enter month (1-12): ");

		// Create a variable month to store the input month
		int month = sc.nextInt();

		// Prompt the user to enter the day
		System.out.print("Enter day (1-31): ");

		// Create a variable day to store the input day
		int day = sc.nextInt();

		// Check if the month is March and the day is between 20 and 31 (inclusive)
		if (month == 3 && day >= 20 && day <= 31) {
			System.out.println("It's a Spring Season");
		}

		// Check if the month is April and the day is between 1 and 30 (inclusive)
		else if (month == 4 && day >= 1 && day <= 30) {
			System.out.println("It's a Spring Season");
		}

		// Check if the month is May and the day is between 1 and 31 (inclusive)
		else if (month == 5 && day >= 1 && day <= 31) {
			System.out.println("It's a Spring Season");
		}

		// Check if the month is June and the day is between 1 and 20 (inclusive)
		else if (month == 6 && day >= 1 && day <= 20) {
			System.out.println("It's a Spring Season");
		}

		else {
			System.out.println("Not a Spring Season");
		}
	}
}
