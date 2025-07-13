// Computation.java - This program calculates sum, difference, and product of two values. 
// Input:  Interactive.
// Output:  Sum, difference, and product of two values. 

import javax.swing.*;

public class Computation
{
	public static void main(String args[]) 
	{
		double value1;
		String value1String;
		double value2;              	
		String value2String;	
						
		value1String = JOptionPane.showInputDialog("Enter first numeric value: ");
		value1 = Double.parseDouble(value1String); 
		value2String = JOptionPane.showInputDialog("Enter second numeric value: ");
		value2 = Double.parseDouble(value2String); 
		
		// Call calculateSum() here
		calculateSum(value1, value2);
		// Call calculateDifference() here
		calculateDifference(value1, value2);
		// Call calculateProduct() here
        calculateProduct(value1, value2);
	} // End of main() method.
	
	// Write calculateSum() method here.
	public static void calculateSum(double num1, double num2)
	{
		double sum;
		sum = num1 + num2;
		System.out.println("Sum is: " + sum);
	}

	// Write calculateDifference() method here.
    public static void calculateDifference(double num1, double num2)
	{
		    double difference;
		    difference = num1 - num2;
		    System.out.println("Difference is: " + difference);
	}

	// Write calculateProduct() method here.
	public static void calculateProduct(double num1, double num2)
    {
		    double product;
			product = num1 * num2;
			System.out.println("Product is: " + product);
	}

} // End of Computation class.
