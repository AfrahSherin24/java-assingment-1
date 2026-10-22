//2.Scenario: A college wants to calculate students' results based on five subject marks. 
//Requirements: 1. Create a class StudentResult. 
//2. Create a method calculateTotal() that accepts five subject marks and returns the total.
//3. Create a method calculateAverage() that accepts the total and returns the average.
//4. Create a method calculateGrade() that accepts the average and returns a grade: ○ 90 and above: A ○ 75–89: B ○ 50–74: C ○ Below
//50: Fail 5. Create a method to display the total, average, and grade.
//Sample input: 85, 78, 92, 88, 77. 

package FirstProgram;

public class StudentResult {
	
   int CalculateTotal(int mark1,int mark2,int mark3,int mark4,int mark5)
	{
		int total = mark1 + mark2 + mark3 + mark4 +  mark5;
		return total;
	}

   double CalculateAverage(int total)
   {
	   double average = total / 5.0;
	   return average;
   }
   
   String ClaculateGrade(double average)
   {
	   if(average >= 90) {
		   return "A";
	   }else if (average >= 75) {
		   return "B";
	   }else if (average >= 50) {
		   return "C";
	   }else {
		   return "FAIL";
	   }
   }
   
   void display(int total,double average,String grade)
   {
	   System.out.println(total);
	   System.out.println(average);
	   System.out.println(grade);
   }
   
   public static void main(String[] args) {
	   StudentResult obj = new StudentResult();
	   int total = obj.CalculateTotal(90,76,89,88,95);
	   double average = obj.CalculateAverage(total);
	   String grade = obj.ClaculateGrade(average);
	   
	   obj.display(total, average, grade);
	   
	   
   }
}
