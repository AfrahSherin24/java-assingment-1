//Assign-1
//2. Employee Counter — Static Variable
//
//Question: Count how many employee objects are created by calling a method to register each employee


package FirstProgram;

public class EmployeeCounter {

    
    static int count = 0;

  
    void registerEmployee() {
        count++;
        System.out.println("Employee registered");
    }

    public static void main(String[] args) {

        EmployeeCounter e1 = new EmployeeCounter();
        e1.registerEmployee();

        EmployeeCounter e2 = new EmployeeCounter();
        e2.registerEmployee();

        EmployeeCounter e3 = new EmployeeCounter();
        e3.registerEmployee();

        System.out.println("Total Employees: " + count);
    }
}
