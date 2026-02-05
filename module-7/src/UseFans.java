/* Daniel Preller, 5 February 2026, Assignment 7
Class containing methods to display information of fans from the Fan class */

public class UseFans {
	
	public static void displayFan (Fan fan) {//Prints information about a single fan in a specific format
		System.out.printf("%-7s %s\n", "On:", fan.getOn());
		System.out.printf("%-7s %s\n", "Speed:", fan.getSpeed());
		System.out.printf("%-7s %.2f\n", "Radius:", fan.getRadius());
		System.out.printf("%-7s %s\n", "Color:", fan.getColor());
	}
	
	public static void displayFans(Iterable<Fan> fans) {//Prints information about each fan in any Iterable in a specific format, along with the fan's number
		int fanNumber = 1;
		for (Fan fan : fans) {
			System.out.println("Fan " + fanNumber);
			displayFan(fan);
			System.out.println();
			fanNumber++;
		}
	}

}
