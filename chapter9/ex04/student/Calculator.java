// Calculator.java - This program performs arithmetic, ( +. -, *. /, % ) on two numbers
// Input:  Interactive.
// Output:  Result of arithmetic operation

import javax.swing.*;

public class Calculator
{
	public static void main(String args[]) 
	{
		double numberOne, numberTwo;              	
		String numberOneString, numberTwoString;
		String operation;
		double result; 	
						
		numberOneString = JOptionPane.showInputDialog("Enter the first number: ");
		numberOne = Double.parseDouble(numberOneString); 
		numberTwoString = JOptionPane.showInputDialog("Enter the second number: ");
		numberTwo = Double.parseDouble(numberTwoString); 
		operation = JOptionPane.showInputDialog("Enter an operator (+.-.*,/,%): ");
		
		// Call performOperation method here		
		result = performanceOperation(numberOne, numberTwo, operation);

		System.out.format("%.2f",numberOne);
		System.out.print(" " + operation + " ");
		System.out.format("%.2f", numberTwo);
		System.out.print(" = ");
		System.out.format("%.2f", result);

	} // End of main() method.
	
	
	
	// Write performOperation method here.
	public static double performanceOperation(double numOne, double numTwo, String operation)
	{
		double result = 0;
		if(operation.equals("+"))
			result = numOne + numTwo;
		else if(operation.equals("-"))
			result = numOne - numTwo;
		else if(operation.equals("*"))
			result = numOne * numTwo;
		else if(operation.equals("/")) {
			if (numTwo ==0)
                 System.out.println("Division by 0 is not allowed.");
            else
				result = numOne / numTwo;
		}
		else if(operation.equals("%"))
			result = numOne % numTwo;
		else 
			System.out.println("Error. not a valid operator");
	        
        return(result);

	} // End of performOperation() method	
} // End of Calculator class.
