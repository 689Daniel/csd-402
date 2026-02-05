/* Daniel Preller, 5 February 2026, Assignment 7
Test program to demonstrate the UseFans and Fan classes */

import java.util.ArrayList;

public class UseFansTest {

	public static void main(String[] args) {
		//Creates sample fans
		Fan fanA = new Fan(2, true, 8, "Green");
		Fan fanB = new Fan(0, false, 6, "White");
		Fan fanC = new Fan(3, true, 7, "Black");
		
		//Prints fan information using displayFan method
		System.out.println("Printed individually:\n\nFan A:");
		UseFans.displayFan(fanA);
		System.out.println("\nFan B:");
		UseFans.displayFan(fanB);
		System.out.println("\nFan C:");
		UseFans.displayFan(fanC);
		
		//Creates an ArrayList of fans and adds sample fans to it
		ArrayList<Fan> fanList = new ArrayList<Fan>();
		fanList.add(fanA);
		fanList.add(fanB);
		fanList.add(fanC);
		
		//Displays the fans in the ArrayList using the displayFans method
		System.out.println("\nPrinted as a collection:\n");
		UseFans.displayFans(fanList);

	}

}
