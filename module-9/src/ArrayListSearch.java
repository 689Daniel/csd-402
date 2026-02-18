/* Daniel Preller, 18 February 2026, Assignment 9
Program to print a list of strings and then reprint the one selected by the user, with error handling */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayListSearch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Creates an ArrayList and populates it with strings (in this case Monster Hunter monsters)
		ArrayList<String> strings = new ArrayList<String>();
		Collections.addAll(strings, "Nargacuga", "Gobul", "Valstrax", "Quematrice", "Uth Duna", "Vaal Hazak", "Gore Magala", "Mizutsune", "Fatalis", "Magnamalo");
		
		for (String string: strings) {//Prints the list
			System.out.println(string);
		}
		
		System.out.print("\nPlease enter which item you would like to see again, by number: ");
		
		try {
			int searchIndex = input.nextInt() - 1;//Gets user input and adjusts for 0-indexed list
			
			System.out.print(strings.get(searchIndex));//Searches the list for the user's selection
			
		} catch (InputMismatchException e) {//Error if user enters something other than an integer
			System.out.println("ERROR: Not an integer");
		} catch (IndexOutOfBoundsException e) {//error if the user enters an out of bounds value
			System.out.println("ERROR: Out of Bounds");
		}

	}

}
