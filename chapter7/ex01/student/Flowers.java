// Flowers.java - This program reads names of flowers and whether they are grown in shade or sun from an input 
// file and prints the information to the user's screen. 
// Input:  flowers.dat.
// Output: Names of flowers and the words sun or shade.

import java.io.*;  // Import class for file input.

public class Flowers
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables here
		String flowerName = "";
		String sunOrShade = "";
		
		// Open input file.
		FileReader fr = new FileReader(fileName:"flowers.dat");
		
		// Create BufferedReader object.
		BufferedReader br = new BufferedReader(fr);
		
		// Write while loop that reads records from file.
		while((flowerName = br.readLine()) != null)
		{
                sunOrShade = br.readLine();
		// Print flower name and the words sun or shade.
		            System.out.println(flowerName + " is grown in the " + sunOrShade);	
		}
		br.close(); 	
	} 
} 