// Cornwall.java - This program computes hotel guest rates.
// Input:  Days in stay and meals included
// Output:  Hotel guest rate
import javax.swing.*;

public class Cornwall
{
	public static void main(String args[]) 
	{
		int days;
		String dayString; 
		String mealPlan; 
		String question; 
		double rate = 0.00; 
		
		dayString = JOptionPane.showInputDialog("How many days do you plan to stay? "); 
		days = Integer.parseInt(dayString);
		question = JOptionPane.showInputDialog(" Do you want a meal plan? Y or N: "); 
		// Figure out which arguments to pass to the computeRate() method and 
		// then call the computeRate() method
		if(question.equals("N"))
		        rate = computerRate(days);
		else if(question.equals("Y"))
		{
			    mealPlan = JOptionPane.showInputDialog("Enter meal plan A or C: ");
				if(mealPlan.equals("A") || mealPlan.equals("C"))
						rate = computeRate(days, mealPlan);
		}

		System.out.println("The rate for your stay is: " + rate);

	} // End of main() method.
	
	// Write computeRate methods here.
	public static double computerRate(int days)
	{
		    double total;
			total = days * 99.99;
			return total;
	}

	public static double computeRate(int days, String mealPlan)
	{
		    double total;
			if(mealPlan.equals("A"))
			        total = days * 169.00;
			else    total = days * 112.00;
			return total;
	}

} // End of Cornwall class.
