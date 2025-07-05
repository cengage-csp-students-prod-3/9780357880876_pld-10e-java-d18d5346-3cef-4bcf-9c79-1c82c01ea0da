// HouseholdSize.java - This program uses a bubble sort to arrange up to 300 household sizes in
// descending order and then prints the mean and median household size. 
// Input:  Interactive.
// Output:  Mean and median household size. 

import javax.swing.*;

public class HouseholdSize
{
	public static void main(String args[]) 
	{
		// Declare variables.
		
		final int SIZE = 300;			// Maximum number of household sizes.
		int householdSizes[] = new int[SIZE];   // Array used to store up to 300 household sizes.
		int x;
		int limit = SIZE;
		int householdSize = 0; 
		String householdSizeString;
		int pairsToCompare;
		boolean switchOccurred;
		int temp;
		double sum = 0; 
		double mean = 0;
		int median = 0;

		// Input household size
		householdSizeString = JOptionPane.showInputDialog("Enter household size or 999 to quit: ");
		householdSize = Integer.parseInt(householdSizeString);
		// This is the work done in the fillArray() method
		x = 0;
		while(x < limit && householdSize != 999)   
		{
			// Place value in array.
			householdSizes[x] = householdSize;
			// Calculate total of household sizes here
			sum += householdSizes [x];
			x++;    // Get ready for next input item.
			householdSizeString = JOptionPane.showInputDialog("Enter household size or 999 to quit: ");
			householdSize = Integer.parseInt(householdSizeString); 
		}  // End of input loop.
		
		limit = x;
		// Find the mean
		mean = sum / limit;
		// This is the work done in the sortArray() method
		x = 0;
		pairsToCompare = limit - 1;
		switchOccurred = true;

	while(switchOccurred == true)
	{
		    x = 0;
			switchOccurred = false;
            
			while(x < pairsToCompare)
			{
                    if(householdSizes[x] > householdSizes[x+1])
					{
						    temp = householdSizes[x + 1];
							householdSizes[x+1] = householdSizes[x];
							householdSizes[x] = temp;
							switchOccurred = true;

					}
					x++;
			}
			pairsToCompare--;
	}
		// This is the work done in the displayArray() method
		// Print the mean
        System.out.println("Mean household size in Marengo is : " + mean);
		
        // Calculate the median
		median = (limit - 1) / 2;
      // Print the median
      System.out.println("Median household size in Marengo is : " + householdSizes[median]);
	} // End of main() method.
} // End of HouseholdSize class.
