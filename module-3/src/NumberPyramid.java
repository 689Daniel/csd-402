/*Daniel Preller, 18 December 2025, Assignment 3
Program to display a pyramid of numbers in a specific format using nested loops */
public class NumberPyramid {

	public static void main(String[] args) {
		
		for (int currentLine = 1; currentLine <= 7; currentLine++) {// Creates seven lines
			
			int lineMax = Math.powExact(2, currentLine - 1);//Determines the amount for the center number of the line
			String numbers = "";
			
			//Multiplies up
			for (int i = 1; i <= lineMax; i *= 2) {
				numbers += i + " ";
			}
			
			//Divides down
			for (int i = lineMax / 2; i > 0;  i /= 2) {
				numbers += i + " ";
			}
			
			//Pads the string evenly on each side
			int padding = 31 - numbers.length();
			numbers = String.format("%" + ((padding/2) + numbers.length()) + "s", numbers);
			numbers = String.format("%-31s", numbers);
			
			System.out.println(numbers + "@");
		}

	}

}