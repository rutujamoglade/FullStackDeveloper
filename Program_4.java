package tandemloop;

/*
 * Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
 */
public class Program_4 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
		        
		        // Create an array to store the count of multiples for numbers 1 to 9
		        int[] counts = new int[9];  // counts[0] will store count for 1, counts[1] for 2, ..., counts[8] for 9
		        
		        // Loop through the numbers in the list
		        for (int number : numbers) {
		            // Check if the number is divisible by any number from 1 to 9
		            for (int i = 1; i <= 9; i++) {
		                if (number % i == 0) {
		                    // If divisible, increase the count for that number
		                    counts[i - 1]++;
		                }
		            }
		        }
		        
		        // Print the result
		        System.out.print("{");
		        for (int i = 0; i < 9; i++) {
		            System.out.print((i + 1) + ": " + counts[i]);
		            if (i < 8) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("}");
		    }
		}


