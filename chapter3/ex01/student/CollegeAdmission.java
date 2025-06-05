/* Program Name: CollegeAdmission.java 
   Function: This program determines if a student will be admitted or rejected. 
   Input:  Interactive
   Output: Accept or Reject
*/  

import java.util.Scanner;
public class CollegeAdmission
{
	public static void main(String args[])
   { 
  		// Declare variables 
      String testScoreString, String classRankString;
      int testScore, classRank;  
      Scanner scanner = new Scanner(System.in);



     
     	// Get input and convert to correct data type    
     System.out.print("Enter your test score: ");
     testScoreString = input.nextline();
     System.out.print("Enter your class rank: ");
     classRankString = input.nextLine();
     int testScore = Integer.parseInt(testScoreString);
     int classRank = Integer.parseInt(classRankString);



     	// Test using admission requirements and print Accept or Reject 
		if( testScore >= 90 )
		{
			if( classRank >= 25)
			{
			   System.out.println("Accept");
			}
			else
	   		System.out.println("Reject"); 
		}
     	else 
        {
           if (testScore >= 80) {
              if (classRank >= 50)
                 System.out.println("Accept");
              else
                 System.out.println("Reject");
           } else {
              if (testScore >= 70) {
                 if (classRank >= 75)
                    System.out.println("Accept");
                 else
                    System.out.println("Reject");
              } else
                 System.out.println("Reject");
           }
        }
        scanner.close();
   } // End of main() method
} // End of CollegeAdmission class