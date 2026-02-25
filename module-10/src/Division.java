/* Daniel Preller, 25 February 2026, Assignment 10
Abstract class for representing the divisions of an organization */

public abstract class Division {
	String divisionName;
	String accountNumber;// Account number uses a string to allow for leading 0s and because numeric operations will not be performed on it
	
	protected Division(String divisionName, String accountNumber) {
		this.setDivisionName(divisionName);
		this.setAccountNumber(accountNumber);
	}
	
	//set methods
	public void setDivisionName (String newName) {
		this.divisionName = newName;
	}
	public void setAccountNumber (String newNumber) {
		this.accountNumber = newNumber;
	}
	//get methods
	public String getDivisionName() {
		return divisionName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	abstract public void display();//Displays information about the division

}
