/* Daniel Preller, 12 February 2026, Assignment 8
Program to create an ArrayList of Integers from user input and return the highest value */

import java.util.ArrayList;
import java.util.Scanner;

public class DanielArrayListTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		while (true) {//Gets user input and adds it to the list until a 0 is entered (The 0 is not added to the list)
			System.out.print("Please enter an integer to add to the list. To stop, enter 0: ");
			
			try {
				Integer inputValue = input.nextInt();
				if (inputValue == 0) {//Stops the loop if a 0 is entered
					break;
				}
				integerList.add(inputValue);
				
			} catch (java.util.InputMismatchException exception) {//If a non-integer value is entered, an error message is printed and the value is disposed of
				System.out.println("ERROR: Only integers are accepted.");
				input.nextLine();
			}
		
		}
		
		System.out.print("The largest value is " + max(integerList));
		
		

	}
	
	static Integer max(ArrayList<Integer> list) {//Returns the largest value in an array if Integer objects
		if (list.size() == 0) {//Returns 0 if the array is empty
			return 0;
		}
		
		//Sets highest value to the first value and compares all values to the highest, changing the highest if necessary
		Integer max = list.getFirst();
		for (Integer value: list) {
			if (value.compareTo(max) == 1) {
				max = value;
			}
		}
		return max;
	}
}
