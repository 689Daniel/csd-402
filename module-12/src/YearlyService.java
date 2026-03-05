/* Daniel Preller, 5 March 2026, Assignment 12
Program to calculate yearly auto service charges with a variety of options using overloaded methods */

public class YearlyService {
	//Prices listed as constants for easy changeability
	static final double BASIC_CHARGE = 126.99;
	static final double OIL_CHARGE = 62.99;
	static final double TIRE_CHARGE = 45.99;
	static final double DISCOUNT = 25;
	
	public static void main(String[] args) {//Demonstrates the yearlyService method by using each version twice
		System.out.println("Yearly Service: " + yearlyService());
		System.out.println("Yearly Service: " + yearlyService());//Same as previous line, but instructions require all versions of the method to be called twice
		System.out.println("Yearly Service (Oil Change): " + yearlyService(true));
		System.out.println("Yearly Service (No Oil Change): " + yearlyService(false));
		System.out.println("Yearly Service (Oil Change and Tire Rotation): " + yearlyService(true, true));
		System.out.println("Yearly Service (Tire Rotation): " + yearlyService(false, true));
		System.out.println("Yearly Service (Oil Change, Tire Rotation, and Discount): " + yearlyService(true, true, true));
		System.out.println("Yearly Service (Oil Change and Discount): " + yearlyService(true, false, true));		
	}
	
	public static double yearlyService() {//Returns the base yearly service charge
		return BASIC_CHARGE;
	}
	public static double yearlyService(boolean oilChange) {//Returns the yearly service charge with an optional oil change
		double charge = BASIC_CHARGE;
		if (oilChange) {
			charge += OIL_CHARGE;
		}
		return charge;
	}
	public static double yearlyService(boolean oilChange, boolean tireRotation) {//Returns the yearly service charge with an optional oil change and tire rotation
		double charge = BASIC_CHARGE;
		if (oilChange) {
			charge += OIL_CHARGE;
		}
		if (tireRotation) {
			charge += TIRE_CHARGE;
		}
		return charge;
	}
	public static double yearlyService(boolean oilChange, boolean tireRotation, boolean coupon) {//Returns the yearly service charge with an optional oil change, tire rotation, and coupon discount
		double charge = BASIC_CHARGE;
		if (oilChange) {
			charge += OIL_CHARGE;
		}
		if (tireRotation) {
			charge += TIRE_CHARGE;
		}
		if (coupon) {
			charge -= DISCOUNT;
		}
		return charge;
	}

}
