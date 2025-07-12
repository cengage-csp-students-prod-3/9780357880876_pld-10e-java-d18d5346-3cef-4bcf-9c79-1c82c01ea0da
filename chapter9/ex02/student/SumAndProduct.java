// SumAndProduct.java - This program computes sums and products. 
// Input:  Interactive.
// Output:  Computed sum and product. 

import javax.swing.*;

public class SumAndProduct
{
   public static void main(String args[]) 
   {
      int number;              	
      String numberString;	
						
      numberString = JOptionPane.showInputDialog("Enter a positive integer or 0 to quit: ");
      number = Integer.parseInt(numberString); 
		
      while(number != 0)
      {
         sums(number);
	      products(number);
	      numberString = JOptionPane.showInputDialog("Enter a positive integer or 0 to quit: ");
         number = Integer.parseInt(numberString); 
      }

      System.exit(0);
	
   } // End of main() method.
  
   public static void sums(int num)
   {
      int result = 0;
      int i;
      for(i = 1; i <= num; i++)
         result += i;
      System.out.println("The sum is " + result + ".");
   }

   // Write products() method here.
   public static void products(int num)
   {
      int result = 1;
      int i;
      for(i=1; i <= num; i++)
         result *= i;
      System.out.println("The product is " + result + ".");
   }


} // End of SumAndProduct class.