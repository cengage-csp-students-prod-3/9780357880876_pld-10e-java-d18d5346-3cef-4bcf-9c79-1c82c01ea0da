import javax.swing.*;
public class BattingAverage
{
	public static void main(String args[])
	{
		// Declare a named constant for array size here.
		final int MAX_AVERAGES = 8;

		// Declare array here.
		double averages[] = new double[MAX_AVERAGES];
		
		// Use this variable to store the batting average input by user.
		double battingAverage;

		// String version of batting average input by user.
		String averageString; 

		// Use these variables to store the minimim and maximum batting averages.
		double min, max;

		// Use these variables to store the total and the average.
		double total, average; 

		// Write a loop to get batting averages from user and assign to array.
		for(int loopIndex = 0; loopIndex < MAX_AVERAGES; loopIndex++)
		{
		   averageString = JOptionPane.showInputDialog("Enter a batting average: ");
		   battingAverage = Double.parseDouble(averageString);
		   // Assign value to array.
		   averages[loopIndex] = battingAverage;
		}
		
		// Assign the first element in the array to be the minimum and the maximum.
		min = averages[0];
		max = averages[0];
		// Start out your total with the value of the first element in the array.
		total = averages[0]; 
		
		// Write a loop here to access array values starting with averages[1]
        for(int loopIndex = 1; loopIndex < MAX_AVERAGES; loopIndex++)
		{
			// Within the loop test for minimum and maximum batting averages.
			if(averages[loopIndex] < min)
			    min = averages[loopIndex];
			if(averages[loopIndex] > max)
			    max = averages[loopIndex];
			// Also accumulate a total of all batting averages.
			total += averages[loopIndex];
		}

		// Calculate the average of the 10 averages.
		average = total / MAX_AVERAGES;
		
        // Print the averages stored in the averages array.
		for(int loopIndex = 0; loopIndex < MAX_AVERAGES; loopIndex++)
        {
			System.out.println("averages[" + loopIndex + "] is: " + averages[loopIndex]);
		}
		// Print the maximum batting average, minimum batting average, and average batting average.
		System.out.println("Minimum batting averages is " + min);
		System.out.println("Maximum batting averages is " + max);
		System.out.println("Average batting averages is " + average); 

    }
}