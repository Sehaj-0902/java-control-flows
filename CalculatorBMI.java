// Program to find the BMI of a person

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create a class named CalculatorBMI 
public class CalculatorBMI {
	public static void main(String[] args) {
		// Create a scanner object
		Scanner sc = new Scanner(System.in);

		// Prompt user to enter weight in kg
		System.out.print("Enter weight (in kg): ");
		double weight = sc.nextDouble();

		// Prompt user to enter height in cm
		System.out.print("Enter height (in cm): ");
		double height = sc.nextDouble();

		// Convert height to meters by dividing height/100 (1 m = 100 cm)
		double heightInMeters = height/100;

		// Calculate BMI
		double BMI = weight / (heightInMeters * heightInMeters);

		if (BMI <= 18.4) {
			System.out.println("The BMI of the person is " + String.format("%.1f", BMI) + " and the person is Underweight");
		}
		else if (BMI >= 18.5 && BMI <= 24.9) {
                        System.out.println("The BMI of the person is " + String.format("%.1f", BMI) + " and the person is Normal");
                }
		else if (BMI >= 25.0 && BMI <= 39.9) {
                        System.out.println("The BMI of the person is " + String.format("%.1f", BMI) + " and the person is Overweight");
                }
		else {
                        System.out.println("The BMI of the person is " + String.format("%.1f", BMI) + " and the person is Obese");
                }
	}
}
