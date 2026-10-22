//1.Scenario: A company wants to calculate the monthly salary of its employees, 
//including allowances and deductions. Requirements: 1. Create a class EmployeeSalary.
//2. Create a method calculateSalary() that accepts basic salary and allowance and returns 
//the gross salary. 
//3. Create a method calculateNetSalary() that accepts gross salary and deductions 
//and returns the net salary.
//4. Create a method displayDetails() to display the employee name, gross salary,
//and net salary.
//5. Call all methods from main() without using a constructor. Sample input:
//	Basic salary = ₹25,000, Allowance = ₹5,000, Deductions = ₹2,000. 

package FirstProgram;

public class EmployeeSalary {
	String name = "sherin";
	double salary;
	double total;
	
	double CalculateSalary(double basic, double allowance) 
	{
		double gross= basic + allowance;
		return gross;
	}
	
	double CalculateNetSalary(double salary, double deduction)
	{
		double net = salary - deduction;
		return net;
	}
	
	void DisplayDetails()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		EmployeeSalary obj1 = new EmployeeSalary();
		obj1.salary = obj1.CalculateSalary(25000,5000);
		
		
		obj1.total = obj1.CalculateNetSalary(obj1.salary,2000);
		
		obj1.DisplayDetails();
	}
	

}
