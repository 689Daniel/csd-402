/* Daniel Preller, 18 February 2026, Assignment 9
Java program to create a new file with 10 random numbers, or append 10 random numbers if the file already exists */
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class RandomNumberFile {

	public static void main(String[] args) {
		File dataFile = new File("data.file");
		
		try {//Creates the file if it does not exist, or prints an error message if an error occurs
			dataFile.createNewFile();
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
		
		try (FileWriter output = new FileWriter("data.file", true)) {//Creates a file writer in append mode and automatically closes it
			output.write(generateData());//Appends data to the end of the file
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
		
		try (Scanner input = new Scanner(dataFile)) {//Reads and displays file contents
			System.out.println("Contents of data.file:");
			
			while (input.hasNext()) {//Executes for each item of the file
				System.out.println(input.next());
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}

	}
	
	static String generateData() {// Returns a string of 10 random numbers separated by spaces (including a trailing space)
		String numbers = "";
		
		for (int i = 1; i <= 10; i++) {//Adds a random number from 0-100 and a space 10 times
			int number = (int) (Math.random() * 101);
			numbers += number;
			numbers += " ";
		}
		return numbers;
	}

}
