/* Daniel Preller, 25 February 2026, Assignment 10
Class for representing an international division of an organization */

public class InternationalDivision extends Division {
	String country;
	String language;
	
	public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
		super(divisionName, accountNumber);
		this.setCountry(country);
		this.setLanguage(language);
	}
	
	//set methods
	public void setCountry(String newCountry) {
		this.country = newCountry;
	}
	public void setLanguage(String newLanguage) {
		this.language = newLanguage;
	}
	//get methods
	public String getCountry() {
		return country;
	}
	public String getLanguage() {
		return language;
	}
	
	@Override//Displays information about the division, ending in a newline
	public void display() {
		System.out.println("Division Name: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Location: " + country);
		System.out.println("Language: " + language);
	}
}
