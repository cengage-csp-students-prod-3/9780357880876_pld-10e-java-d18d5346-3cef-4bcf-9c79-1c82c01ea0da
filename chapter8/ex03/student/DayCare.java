import javax.swing.*;

public class DayCare
{
	public static void main(String args[]) 
	{
		// Declare two-dimensional array here.
		double weeklyRate[][] = {{30.00, 60.00, 88.00, 115.00, 140.00,},
	                            {26.00, 52.00, 70.00, 96.00, 120.00},
	                            {24.00, 46.00, 67.00, 89.00, 110.00},
							    {22.00, 40.00, 60.00, 75.00, 88.00}}
								{20.00, 35.00, 50.00, 66.00, 84.00}};
														
								// Declare other variables.
		int numDays;   
		int age;
		String numDaysString;
		String ageString;
		int QUIT = 99;
				
		// This is the work done in the getReady() method
		ageString = JOptionPane.showInputDialog(
			            "Enter the age of the child or 99 to quit: ");
		// Perform a priming read to get the age of the child.
		age = integer.parseInt(ageString);

		while(age != QUIT)
		{	
			// This is the work done in the determineRateCharge() method
			// Ask the user to enter the number of days
			numdaysString = JOptionPane.showInputDialog(
                    "Enter number of days: ");
            numDays = Integer.parseInt(numDaysString);
			if(age >= 4)
			        age = 4;

            // Print the weekly rate
			system.out.println(Weekly charge is $" + weeklyRate[age][numDays - 1]);
			// Ask the user to enter the next child's age
            ageString = JOptionPane.showInputDialog(
		            "Enter the age of the child or 99 to quit: ");
			age = Integer.parseInt(ageString);
		
	    }
		// This is the work done in the finish() method
        System.out.println("End of program");
      
	} // End of main() method.
} // End of DayCare class.