// Program to create a calculator using switch case

// Import Scanner class from java.util package
import java.util.Scanner;

// Create a class named CalculatorSwitchCase
public class CalculatorSwitchCase {
	public static void main(String[] args) {
		// Create a scanner object
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter first number
		System.out.print("Enter the first number: ");
		double first = sc.nextInt();

		// Prompt the user to enter second number
                System.out.print("Enter the second number: ");
                double second = sc.nextInt();

		// Prompt the user to enter the operator
		System.out.print("Enter the operator (+, -, *, /): ");
		String op = sc.next();

		// Using switch case to perform operations
		switch (op) {
			case "+":
                		System.out.println(first + " + " + second + " = " + (first + second));
                		break;
            		case "-":
                		System.out.println(first + " - " + second + " = " + (first - second));
                		break;
            		case "*":
                		System.out.println(first + " * " + second + " = " + (first * second));
                		break;
            		case "/":
                		if (second == 0) {
                    			System.out.println("Error: Division by zero is not allowed.");
                		}
				else {
                    			System.out.println(first + " / " + second + " = " + (first / second));
                		}
             		   	break;
            		default:
                		System.out.println("Invalid Operator");
		}
	}
}

