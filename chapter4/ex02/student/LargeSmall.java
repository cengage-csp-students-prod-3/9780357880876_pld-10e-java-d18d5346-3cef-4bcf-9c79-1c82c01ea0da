// LargeSmall.java - This program calculates the largest and smallest of three integer values. 


public class LargeSmall 
{
	public static void main(String args[])
	{
		// Declare and initialize variables here.
		int largest;		// Largest of the three values.
		int smallest;		// Smallest of the three values.
		int big_one, small_one;
		int big_two, small_two;
		int firstNumber = -50;
		int secondNumber = 53;
		int thirdNumber = 78;

		//Write assignment, if, or if else statements here as appropriate.	
		if(firstNumber > secondNumber)
		{
			    big_one = firstNumber;
				small_one = secondNumber;
		}
		else
		{
			    big_one = secondNumber;
				small_one = firstNumber;
		}
		if(secondNumber > thirdNumber)
		{
			    big_two = secondNumber;
				small_two = thirdNumber;
		}
		else
		{
			    big_two = thirdNumber;
				small_two = secondNumber;
		}
        if(big_one > big_two)
		        largest = big_one;
		else 
		        largest = big_two;
		if(small_one < small_two)
		        smallest = small_one;
		else 
		        smallest = small_two;
		
		// Output largest and smallest number.
		System.out.println("The largest value is " + largest);
		System.out.println("The smallest value is " + smallest);
	}
} 