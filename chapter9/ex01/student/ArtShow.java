// ArtShow.java - This program determines if an art show attendee gets a 5% discount
// for preregistering. 
// Input:  Interactive.
// Output:  A statement telling the user if they get a discount or no discount. 

import javax.swing.*;

public class ArtShow
{
	public static void main(String args[]) 
	{		             	
		String registerString;							
		registerString = JOptionPane.showInputDialog("Did you preregister? Enter Y or N: ");
				
		// Test input here. If Y, call discount(), else call noDiscount(). 		
	    if(registerString.equals("Y"))
		        discount();
		else
		        noDiscount();

	} // End of main() method.
	
	// Write discount method here.
    public static void discount()
	{
		    System.out.println("You are pre-registered and qualify for a 5% discount.");
	}

	// Write noDiscount method here. 
    public static void noDiscount()
	{
		    System.out.println("Sorry, you did not pre-register and do not qualify for a 5% discount.");
	}
} // End of ArtShow class.