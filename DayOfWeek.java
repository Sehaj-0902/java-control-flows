// Program to print the day of the week

// Import Scanner class from java.util package
import java.util.Scanner;

// Create a class named DayOfWeek
public class DayOfWeek {
    	public static void main(String[] args) {
        	// Create a scanner object
        	Scanner sc = new Scanner(System.in);

		// Prompt the user to enter a month
        	System.out.print("Enter month (1-12): ");
        	int m = sc.nextInt();

		// Prompt the user to enter a day
        	System.out.print("Enter day (1-31): ");
        	int d = sc.nextInt();

        	// Prompt the user to enter a year
		System.out.print("Enter year (e.g., 2002): ");
        	int y = sc.nextInt(); 

		// Calculate the day of the week
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int day = (d + x + 31 * m0 / 12) % 7;

		System.out.println("The day of the week is: " + day);
	}
}
