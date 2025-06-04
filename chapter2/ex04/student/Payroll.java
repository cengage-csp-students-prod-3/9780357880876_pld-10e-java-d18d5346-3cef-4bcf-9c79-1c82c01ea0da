// This program calculates an employee's take home pay. 
public class Payroll
{
	public static void main(String args[])
	{
		double salary = 1250.00;
		double stateTax;
		double federalTax;
		double numDependents = 2;
		double dependentDeduction;
		double totalWithholding;
		double takeHomePay;

		// Calculate state tax here.
		stateTax = salary * 0.065;
		System.out.println("State Tax: $" + stateTax);

		// Calculate federal tax here. 
		federalTax = salary * 0.28;
		System.out.println("Federal Tax: $" + federalTax);

		// Calculate dependant deduction here.
		dependentDeduction = salary * 0.025 * numDependents;
		System.out.println("Dependents: $" + dependentDeduction);
		
      // Calculate total withholding here.
	    totalWithholding = stateTax + federalTax;
      System.out.println("Total Withholdings: $" + totalWithholding);

		// Calculate take home pay here.
		takeHomePay = salary - totalWithholding + dependentDeduction;

		System.out.println("Salary: $" + salary);
		System.out.println("Take Home Pay: $" + takeHomePay);

		System.exit(0);
	}
}