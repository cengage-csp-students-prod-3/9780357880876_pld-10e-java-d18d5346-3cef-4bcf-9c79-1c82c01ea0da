// Airline.java - This program determines if an airline passenger is eligible for a 25% discount. 

import javax.swing.*;

public class Airline 
{
	public static void main(String args[]) 
	{
		String passengerName = ""; 	// Passenger's name.
		String ageString = "";  // String version of passenger's age.
		int passengerAge = 0; 	// Passenger's age.

		passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
		ageString = JOptionPane.showInputDialog("Enter passenger's age: ");
		
		passengerAge = Integer.parseInt(ageString);
		
		// Test to see if this customer is eligible for a 25% discount. 
		if(passengerAge <= 6 || passengerAge >= 65)
		{
			System.out.println("Passenger Name: " + passengerName);
            System.out.println("Passenger Age: " + passengerAge);
			System.out.println("This passenger is eligible for a 25% discount.");
		}
		else	
	    {
            System.out.println("Passenger Name: " + passengerName);
            System.out.println("Passenger Age: " + passengerAge);
			System.out.println("This passenger is not eligible for a 25% discount.");
		}
	    }
}