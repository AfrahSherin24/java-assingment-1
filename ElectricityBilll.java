//4.Scenario: An electricity board calculates a household bill based on units consumed. Requirements: 
//	1. Create a class ElectricityBill. 
//	2. Create a method calculateBill() that accepts the number of units consumed and 
//	returns the bill amount using these slabs: ○ First 100 units: ₹2 per unit ○ Next 100 units: 
//	₹3 per unit ○ Above 200 units: ₹5 per unit 3. Apply the rates progressively.
//	For example, 250 units means 100 units at ₹2, 100 units at ₹3, and 50 units at ₹5. 
//	4. Create a method addFixedCharge() that accepts the bill amount and adds a fixed charge of ₹50. 
//	5. Create a method to display the final bill. Sample input: 250 units. Expected output: 
//			Energy Charge: 750.0 
//

package FirstProgram;

public class ElectricityBilll {
	
	double CalculateBill(int units) {
		double bill;
		
		if(units <= 100) {
		 bill = units * 2;
		}else if (units <= 200) {
			bill = (100 * 2) + (units - 100) * 3;   //first 100 units kuh 2 per unit panniachi, balance unit kandipidika total unit leh 100 minus pandroo
		}else {
			bill = (100 * 2) + (100 * 3)+ (units - 200) * 5;
		}
		return bill;
		
	}
	double addFixedCharge(double bill) {
		double finalbill = bill + 50;
		return finalbill;
		
	}
	void display(double bill, double finalbill) {
		System.out.println("bill amount : " + bill);
		System.out.println("final charged bill amount : " + finalbill);
	}
	
	public static void main(String[] args) {
		ElectricityBilll obj = new ElectricityBilll();
		double bill = obj.CalculateBill(250);
		double finalbill = obj.addFixedCharge(bill);
		
		obj.display(bill, finalbill);
	}

}
