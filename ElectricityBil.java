//assign 1
//3.Electricity Bill — Local Variables
//
//Question: Calculate the electricity bill using a method and local variables.
//Rates: first 100 units ₹2/unit, next 100 units ₹3/unit, and above 200 units ₹5/unit.


package FirstProgram;

public class ElectricityBil {

    void bill(int units) {
        int amount = 0;

        if (units <= 100)
            amount = units * 2;
        else if (units <= 200)
            amount = 200 + (units - 100) * 3;
        else
            amount = 500 + (units - 200) * 5;

        System.out.println("Bill: Rs." + amount);
    }

    public static void main(String[] args) {
        ElectricityBil obj = new ElectricityBil();
        obj.bill(250);
    }
}

