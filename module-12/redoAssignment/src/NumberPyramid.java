/* Daniel Preller, 5 March 2026, Assignment 3 Redo
Program to print a number pyramid in a specific format using nested loops
 */
public class NumberPyramid {

	public static void main(String[] args) {
		final int lines = 7;//The number of lines to be printed, declared as final for easy changeability. Can go up to 62 before encountering problems related to the 64-bit integer limit
		
		String finalLine = "";
		long value = 1;//Starting value for each line
		
		//Creates the last line to use as a reference for required spaces
		//Normally, this would be done within a function alongside the regular line creation to avoid repetition, but the instructions require nested loops and not loops in a function in a loop
		for (int i = 1; i <= lines; i++) {//Multiplies up
			finalLine += value + " ";
			value *= 2;
		}
		value /= 2;//Reverts last multiplication to reset number

		for (int i = 1; i <= lines - 1; i++) {//Divides down
			value /= 2;
			finalLine += value + " ";
		}
		
		
		for (int currentLine = 1; currentLine <= lines - 1; currentLine++) {//Executes for each specified line, except the final line, which has already been made
			String line = "";
			value = 1;
			
			for (int i = 1; i <= currentLine; i ++) {//Multiplies up
				line += value + " ";
				value *= 2;
			}
			value /= 2;//Reverts last multiplication to reset number
			
			for (int i = 1; i<= currentLine - 1; i ++) {//Divides down
				value /= 2;
				line += value + " ";
			}
			
			//Finds number of spaces needed to pad each side of each line based on the final line
			int totalSpaces = finalLine.length() - line.length();
			int rightSpaces = totalSpaces / 2;
			int leftSpaces = totalSpaces - rightSpaces;//Right side already has a closing space, so in the event of an odd number, the division of the right side will be rounded down and the excess will be placed on the left
			line = " ".repeat(leftSpaces) + line + " ".repeat(rightSpaces) + "@";
			
			System.out.println(line);
		}
		System.out.println(finalLine + "@");

	}

}
