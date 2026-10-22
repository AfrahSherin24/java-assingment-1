//3.Scenario: An online shopping application calculates the final bill based
//on the purchase amount and membership type. Requirements: 1. Create a class ShoppingCart.
//2. Create a method calculateTotal() that accepts the prices of three products and returns the total.
//3. Create a method calculateDiscount() that accepts the total and membership type. Apply: ○ Gold: 20% discount ○ Silver: 10% discount ○ Regular: 5% discount 
//4. Create a method calculateFinalAmount() that returns the amount after discount. 
//5. Create a method to display the total, discount, and final amount. Sample input: ₹2,000, ₹1,500, ₹500; membership = Gold. 

package FirstProgram;

public class ShoppingCart {

	
	int CalculateTotal(int product1, int product2, int product3)
	{
		int total = product1 + product2 + product3;
		return total;
	}
	
	double CalculateDiscount(int total,String membership) 
	{
	
		if (membership == "gold") {
			return total * (20.0/100) ;
		}else if(membership == "silver") {
			return total * (10.0/100);
		}else {
			return total * (5.0/100);
		}
	}
	
	double FinalAmount(int total, double discount) 
	{
		double discountedprice = total - discount;
		return discountedprice;
	}
	
	void display(int total, double discount, double finalamount) {
		System.out.println("total " + total);
		System.out.println("memebership discount " + discount);
		System.out.println("final discounted price " + finalamount);
	}
	
	public static void main(String[] args) {
		ShoppingCart obj = new ShoppingCart();
		
		int total = obj.CalculateTotal(2000, 50000, 3000);
		double discount = obj.CalculateDiscount(total,"gold");
		double finalamount = obj.FinalAmount(total,discount);
		
		obj.display(total, discount,finalamount);
		
		
	}

}
