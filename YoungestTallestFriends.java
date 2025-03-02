// Program to find the youngest and tallest friends among Amar, Akbar, and Anthony

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named YoungestTallestFriends
public class YoungestTallestFriends {
    	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Input age for Amar, Akbar, and Anthony
        	System.out.print("Enter Amar's age: ");
        	int amarAge = sc.nextInt();

        	System.out.print("Enter Akbar's age: ");
        	int akbarAge = sc.nextInt();

        	System.out.print("Enter Anthony's age: ");
        	int anthonyAge = sc.nextInt();

		// Input height for Amar, Akbar, and Anthony
		System.out.print("Enter Amar's height (in cm): ");
        	double amarHeight = sc.nextDouble();

		System.out.print("Enter Akbar's height (in cm): ");
        	double akbarHeight = sc.nextDouble();

        	System.out.print("Enter Anthony's height (in cm): ");
        	double anthonyHeight = sc.nextDouble();

        	// Find the youngest friend
        	int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        	String youngestFriend = "";
        	if (youngestAge == amarAge) {
            		youngestFriend = "Amar";
        	}
		else if (youngestAge == akbarAge) {
            		youngestFriend = "Akbar";
        	}
		else {
            		youngestFriend = "Anthony";
        	}

        	// Find the tallest friend
        	double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        	String tallestFriend = "";
        	if (tallestHeight == amarHeight) {
            		tallestFriend = "Amar";
        	}
		else if (tallestHeight == akbarHeight) {
            		tallestFriend = "Akbar";
        	}
		else {
            		tallestFriend = "Anthony";
        	}

        	// Print the youngest and tallest friends
        	System.out.println("The youngest friend is " + youngestFriend);
        	System.out.println("The tallest friend is " + tallestFriend);
    	}
}
