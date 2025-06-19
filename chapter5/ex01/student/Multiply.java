// Multiply.java - This program prints the numbers 0 through 10 along
// with these values multiplied by 2 and by 10.
// Input:  None.
// Output: Prints the numbers 0 through 10 along with their values multiplied by 2 and by 10. 

public class Multiply
{
	public static void main(String args[])
	{		
		String head1 = "Number: ";
		String head2 = "Multiplied by 2: ";
		String head3 = "Multiplied by 10:  ";				
		int byTen;  // Stores the number multiplied by 10.
		int byTwo;  // Stores the number multiplied by 2.
		final int NUM_LOOPS = 10;  // Constant used to control loop.

		System.out.println("0 through 10 multiplied by 2 and by 10" + "\n");

		int numberCounter = 0; // Initialize loop control variable.
		while(numberCounter <= NUM_LOOPS) // Write your counter controlled while loop here
		{
			byTen = numberCounter * 10; // Multiply by 10
			byTwo = numberCounter * 2;// Multiply by 2
		    System.out.println(head1 + numberCounter);
		    System.out.println(head2 + byTwo);
		    System.out.println(head3 + byTen);
	        numberCounter++;  // Next number.
		}  // End of while loop.
	
		System.exit(0);
	}
}  // End of Multiply class.