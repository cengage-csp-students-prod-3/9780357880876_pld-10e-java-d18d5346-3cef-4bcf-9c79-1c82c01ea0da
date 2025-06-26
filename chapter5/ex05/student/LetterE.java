// LetterE.java - This program prints the letter E with 3 asterisks
// across and 5 asterisks down. 
// Input:  None.
// Output: Prints the letter E. 

public class LetterE
{
	public static void main(String args[])
	{	
		final int NUM_ACROSS = 3;  // Number of asterisks to print across.
		final int NUM_DOWN = 5;  // Number of asterisks to print down.
		int row;  // Loop control for row number.
		int column;  // Loop control for column number.

  		// Write a loop to control the number of rows.
          for(row = 1; row <= NUM_DOWN; row++)
          {
              for(column = 1; column <= NUM_ACROSS; column++)
	          {
                  // Print an asterisk in every column.    
                  if(row == 1 || row == 3 || row == NUM_DOWN)
                      System.out.print("*");
				  // Print asterisk in column 1 and column 4.
				  else if(column == 1)
                      System.out.print("*");
				  // Print a space instead of an asterisk.
				  else
                      System.out.print(" "); 
              }
			  System.out.println();
		  }
		  System.exit(0);
	  }
  } // End of LetterE class.


                
			
			
			
		