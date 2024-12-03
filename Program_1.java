package tandemloop;

import java.util.Scanner;

/*
 Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
 */

public class Program_1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in); // Create a Scanner object for taking inputs

	        // Prompt the user for inputs
	        System.out.print("Enter first value: ");
	        double a = scanner.nextDouble(); // Read first value

	        System.out.print("Enter second value: ");
	        double b = scanner.nextDouble(); // Read second value

	        boolean validInput = false; //  checking input is valid
	        double result = 0; // Variable to store the result

	        while (!validInput) {
	            // Display operation options
	            System.out.println(" for addition, please enter symbol +");
	            System.out.println(" for subtraction, please enter symbol -");
	            System.out.println(" for multiplication, please enter symbol *");
	            System.out.println(" for division, please enter symbol /");
	            System.out.print("Enter your choice: ");

	            String operation = scanner.next(); // Read operation

	            // Perform operation based on input
	            switch (operation) {
	                case "+":
	                    result = a + b;
	                    validInput = true; //  input as valid
	                    break;
	                case "-":
	                    result = a - b;
	                    validInput = true; // input as valid
	                    break;
	                case "*":
	                    result = a * b;
	                    validInput = true; //  input as valid
	                    break;
	                case "/":
	                    if (b != 0) {
	                        result = a / b;
	                        validInput = true; // input as valid
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed. Try again.");
	                    }
	                    break;
	                default:
	                    System.err.println("Error: Invalid operation");
	                    System.err.println("please enter valid operation. like +, -, *, or /");
	            }
	        }

	        // Print the result
	        System.out.println("Your result is: " + result);
	        scanner.close(); 
	    }
	}