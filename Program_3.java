package tandemloop;

import java.util.Scanner;

public class Program_3 {

	
		public static void main(String[] args) {
			   Scanner scanner = new Scanner(System.in);

		        // for the user to enter a value for 'a'
		        System.out.print("Enter a value for a: ");
		        int a = scanner.nextInt(); // Read the integer input value

		        // Generate the series of odd numbers
		        System.out.print("Output: ");
		        for (int i = 1; i <= a; i++) {
		            if (i % 2 != 0) {  // Check if the number is odd
		                System.out.print(i + " ");
		            }
		        }

		        scanner.close();
	    }
	}
