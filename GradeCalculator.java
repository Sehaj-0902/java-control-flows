// Program to calculate percentage and grade based on subject marks

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named GradeCalculator
public class GradeCalculator {
	public static void main(String[] args) {
        	// Create a Scanner object to read input from the console
        	Scanner sc = new Scanner(System.in);

        	// Prompt the user to enter marks for physics
        	System.out.print("Enter marks for Physics: ");
        	double physicsMarks = sc.nextDouble();

        	// Prompt the user to enter marks for chemistry
        	System.out.print("Enter marks for Chemistry: ");
        	double chemistryMarks = sc.nextDouble();

        	// Prompt the user to enter marks for maths
        	System.out.print("Enter marks for Maths: ");
        	double mathsMarks = sc.nextDouble();

        	// Calculate total marks
        	double totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        	// Calculate percentage
        	double percentage = (totalMarks / 300) * 100;

        	// Determine the grade and remarks
        	String grade;
        	String remarks;

        	if (percentage >= 80) {
            		grade = "A";
            		remarks = "(Level 4, above agency-normalized standards)";
        	}
		else if (percentage >= 70) {
            		grade = "B";
            		remarks = "(Level 3, at agency-normalized standards)";
        	}
		else if (percentage >= 60) {
            		grade = "C";
            		remarks = "(Level 2, below, but approaching agency-normalized standards)";
        	}
		else if (percentage >= 50) {
            		grade = "D";
            		remarks = "(Level 1, well below agency-normalized standards)";
        	}
		else if (percentage >= 40) {
            		grade = "E";
            		remarks = "(Level 1-, too below agency-normalized standards)";
        	}
		else {
            		grade = "R";
            		remarks = "(Remedial standards)";
        	}

        	// Print the results
        	System.out.println("\nResults");
        	System.out.println("Average Marks: " + percentage + "%");
        	System.out.println("Grade: " + grade);
        	System.out.println("Remarks: " + remarks);
    	}
}
