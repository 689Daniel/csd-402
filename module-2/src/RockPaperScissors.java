/* Daniel Preller, 12 December 2025, Assignment 2.2
Program to simulate rock-paper-scissors */

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		int computerChoice = 1 + (int) (Math.random() * 3);
		
		//Default values to avoid compile errors by JVM
		String winner = "Player";
		int winningChoice = 0;
		
		Scanner input = new Scanner(System.in);
		
		//Obtains the player's choice and ensures it is in range
		System.out.print("Rock, paper, scissors, shoot!\n" + 
			"Enter 1 for rock\n" + 
			"enter 2 for paper\n" +
			"enter 3 for scissors\n");
		int playerChoice = input.nextInt();
		while (playerChoice < 1 || playerChoice > 3) {
			System.out.print(playerChoice + " is not a valid option.\n" + 
				"please choose rock, paper, or scissors\n");
			playerChoice = input.nextInt();
		}
		
		/*Displays the choices of the player and the computer
		I would normally do this with a function, but those have not been covered in the class yet,
		so I am manually determining the output for both the player and the computer so as not to skip ahead*/
		if (playerChoice == 1) {
			System.out.print("Player chooses rock\n");
		}
		else if (playerChoice == 2) {
			System.out.print("Player chooses paper\n");
		}
		else if (playerChoice == 3) {
			System.out.print("Player chooses scissors\n");
		}
		
		if (computerChoice == 1) {
			System.out.print("Computer chooses rock\n");
		}
		else if (computerChoice == 2) {
			System.out.print("Computer chooses paper\n");
		}
		else if (computerChoice == 3) {
			System.out.print("Computer chooses scissors\n");
		}
		
		//Determines the winner of the game and which item won (used to determine victory message)
		int gameState = (playerChoice - computerChoice + 3) % 3;
		if (gameState == 0) {
			System.out.print("Tie");
			System.exit(0);
		}
		else if (gameState == 1) {
			winner = "Player";
			winningChoice = playerChoice;
		}
		else if (gameState == 2) {
			winner = "Computer";
			winningChoice = computerChoice;
		}
		
		//Displays game results
		if (winningChoice == 1) {
			System.out.print("Rock crushes scissors. " + winner + " wins!");
		}
		else if (winningChoice == 2) {
			System.out.print("Paper covers rock. " + winner + " wins!");
		}
		else if (winningChoice == 3) {
			System.out.print("Scissors cuts paper. " + winner + " wins!");
		}
		else {
			System.out.print("An error occurred.");
		}
		
		

	}

}
