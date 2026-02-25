/* Daniel Preller, 25 February 2026, Assignment 10
Class for representing a domestic division of an organization */

public class DomesticDivision extends Division {
	String state;
	
	public DomesticDivision(String divisionName, String accountNumber, String state) {
		super(divisionName, accountNumber);
		this.setState(state);
	}
	
	//set methods
	public void setState(String newState) {
		this.state = newState;
	}
	//get methods
	public String getState() {
		return state;
	}
	
	@Override
	public void display() {
		System.out.println("Division Name: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Location: " + state);
	}
}
