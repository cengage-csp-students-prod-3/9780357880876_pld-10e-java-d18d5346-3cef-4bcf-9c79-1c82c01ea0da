// Reverse.java - This program reverses numbers stored in an array.
// Input:  Interactive.
// Output:  Original contents of array and the reversed contents of the array. 

import javax.swing.*;

public class Reverse
{
	public static void main(String args[]) 
	{
		int numbers[] = {9, 8, 7, 6, 5};
		int x; 

		// Print contents of array
		System.out.println("Original contents of the array: ");
		for (x = 0; x < 5; x++)
		         System.out.println(numbers[x]);
		
		// Call reverseArray method here		
		reverseArray(numbers);
	
		// Print contents of reversed array
        System.out.println("Reverse contents of array: ");
		for (x = 0; x < 5; x++)
		         System.out.println(numbers[x]);
	} // End of main() method.
	
	// Write reverseArray method here.
	public static void reverseArray(int [] values)
	{
		    int temp;
			temp = values[4];
			values[4] = values[0];
			values[0] = temp;
			temp = values[3];
			values[3] = values[1];
			values[1] = temp;
	}


} // End of Reverse class.
