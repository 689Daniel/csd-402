/* Daniel Preller, 25 February 2026, Assignment 10
Test program for Division class and subclasses */

public class UseDivision {

	public static void main(String[] args) {
		
		
		//Creates an array containing two international divisions and two domestic divisions
		Division[] divisions = new Division[4];
		divisions[0] = new InternationalDivision("Japanese Division", "0132", "Japan", "Japanese");
		divisions[1] = new InternationalDivision("Indonesian Division", "0156", "Indonesia", "Indonesian");
		divisions[2] = new DomesticDivision("Maryland Division", "0124", "Maryland");
		divisions[3] = new DomesticDivision("Nebraska Division", "0126", "Nebraska");
		
		//Executes the display method for all divisions
		for (Division division : divisions) {
			division.display();
			System.out.println("-".repeat(35));
		}
	}
}
