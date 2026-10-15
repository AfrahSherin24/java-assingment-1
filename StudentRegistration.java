//Assignment 1
//1. Student Registration — Instance Variables
//
//Question: Create three students with different names and roll numbers using a method


package FirstProgram;

public class StudentRegistration {

    String name;
    int rollNum;

    void display(String n, int r) {
        name = n;
        rollNum = r;

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println();
    }

    public static void main(String[] args) {

        StudentRegistration s1 = new StudentRegistration();
        StudentRegistration s2 = new StudentRegistration();
        StudentRegistration s3 = new StudentRegistration();

        s1.display("Arun", 101);
        s2.display("Priya", 102);
        s3.display("Kumar", 103);
    }
}

	
