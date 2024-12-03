package tandemloop;

import java.util.Scanner;
/*
 * With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 */
public class Program_2 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	  System.out.print("Enter a value for a: ");
     int a = scanner.nextInt(); // Read the integer input value

     // Validate the input
     if (a <= 0) {
         System.out.println("Please enter a positive integer.");
         return; // Exit the program if the input is invalid
     }
    

     // Generate the series
     System.out.print("Output: ");
     int no = 1; // Start the series with 1
     for (int i = 0; i < a; i++) {
         if (i > 0) {
             System.out.print(", ");
         }
         System.out.print(no);
         no += 2; // Increment the current number by 2
     }
   
     // Close the scanner
     scanner.close();
 }
	
}



