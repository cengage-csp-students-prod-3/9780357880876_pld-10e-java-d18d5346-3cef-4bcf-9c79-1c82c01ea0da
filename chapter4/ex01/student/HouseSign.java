// HouseSign.java - This program calculates prices for custom house signs.


public class HouseSign 
{
	public static void main(String args[])
	{
		// Declare and initialize variables here.
		double charge = 0.0;     // Charge for this sign.    
		int numChars = 8;        // Number of characters.
		String color = "gold";     // Color of characters.
		String woodType = "oak";   // Type of wood.
			 
		// Write assignment and if statements here as appropriate.	
		charge = 35.00; // All signs are $35.00
		// Is the number of characters more than 6?
		if(numChars > 5)
		        charge += (numChars - 5) * 4.00;

		// Is the wood type oak?
		if(woodType.equals("oak"))
		        charge += 20.00;
		
		// Is the character color gold?	
		if(color.equals("gold"))
		        charge += 15.00;	

		// Output Charge for this sign.
		System.out.println("The charge for this sign is $" + charge);
	}
} 	