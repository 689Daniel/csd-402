/*Daniel Preller, 3 December 2025, Assignment 1.3
Program to calculate the number of Joules required to heat a certain amount of water from one temperature to another */

package waterHeating;
import java.util.Scanner;

public class WaterHeating {

	public static void main(String[] args) {

		//Sets the specific heat capacity of water (a constant) and gets calculation values from the user
		final int SPECIFIC_HEAT_CAPACITY = 4184;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the quantity of water to be heated, in kilograms: ");
		double water_quantity = input.nextDouble();
		System.out.print("Please enter the starting temperature of the water, in degrees Celsius: ");
		double starting_temperature = input.nextDouble();
		System.out.print("Please enter the final temperature of the water, in degrees Celsius: ");
		double final_temperature = input.nextDouble();
		
		//Calculates amount of energy required and displays results
		double required_energy = water_quantity * SPECIFIC_HEAT_CAPACITY * (final_temperature - starting_temperature);
		System.out.println("The amount of energy required to heat " + 
				water_quantity + " kilograms of water from " + 
				starting_temperature + " to " + final_temperature + 
				" degrees celsius is " + String.format("%,f", required_energy) + " Joules.");
		

	}

}
