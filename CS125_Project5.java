import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*  * 
 * Bell'aria Sarian
 * 
 * Description: Battleship game program where the user
 * can play against themself to gain ultimate
 * victory over Java and Maps! 
 */


public class CS125_Project5
{
	public static void main(String[] args)
	{
		// Your code should go below this line

		Map<String, Integer> numGuess = new HashMap<String, Integer>(); // Stores unique coordinate string and number of guesses

		String[][] gameBoard = new String[8][7];
		String[][] hiddenBoard = new String[8][7];

		ArrayList<String> guessHistory = new ArrayList<String>(); // stores guess history
		ArrayList<String> printGuessHistory = new ArrayList<String>(); // Saves unique coordinate in printable form

		////////////////////////////////////////////////
		// Populates 2D array for for official game board
		for (int i = 0; i < gameBoard.length-1; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = ("-");
			}
		}

		////////////////////////////////////////////////
		// Populates 2D array for for foe game board display to hide ships
		for (int i = 0; i < hiddenBoard.length-1; i++) {
			for (int j = 0; j < hiddenBoard[i].length; j++) {
				hiddenBoard[i][j] = ("-");
			}
		}

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Game begins
		System.out.println("---------------  Welcome to Battleship!  ---------------");

		////////////////////////
		// Printing Game board to start ship placement

		System.out.println("r\\c     0       1       2       3       4       5       6");
		for (int i = 0; i < gameBoard.length-1; i++) {

			for (int j = 0; j < gameBoard[i].length; j++) {
				if (j == 0) {
					System.out.print(i + "\t");
				}
				System.out.print(gameBoard[i][j] + "\t");
			}
			System.out.print("\n"); 
		}
		System.out.println("");

		// boolean placingBattleshipsFinished = false;

		Scanner scan = new Scanner(System.in);


		///////////////////////////
		// placing ship of length 2
		System.out.println("Please enter coordinates for ship of length 2:"); 
		System.out.println("Starting Row (0-6):"); 
		int coorRow2 = scan.nextInt();

		System.out.println("Starting Column (0-6):");
		int coorCol2 = scan.nextInt();
		scan.nextLine();
		System.out.println("From the starting point, extend down or right? (d/r):");
		String direction2 = scan.nextLine().toLowerCase();


		if (direction2.contains("r")) { // If direction is Right

			gameBoard[coorRow2][coorCol2] = "S";
			gameBoard[coorRow2][coorCol2 + 1] = "S";

		}
		else { // If direction is Down

			gameBoard[coorRow2][coorCol2] = "S";
			gameBoard[coorRow2 + 1][coorCol2] = "S";

		}

		// Print Game board
		System.out.println("r\\c     0       1       2       3       4       5       6");
		for (int i = 0; i < gameBoard.length-1; i++) {

			for (int j = 0; j < gameBoard[i].length; j++) {
				if (j == 0) {
					System.out.print(i + "\t");
				}
				System.out.print(gameBoard[i][j] + "\t");
			}
			System.out.print("\n"); 
		}
		System.out.println("");


		////////////////////////////
		// Placing ship of length 3

		System.out.println("Please enter coordinates for ship of length 3:"); 
		System.out.println("Starting Row (0-6):"); 
		int coorRow3 = scan.nextInt();
		System.out.println("Starting Column (0-6):");
		int coorCol3 = scan.nextInt();
		scan.nextLine();
		System.out.println("From the starting point, extend down or right? (d/r):");
		String direction3 = scan.nextLine().toLowerCase();


		if (direction3.contains("r")) { 

			gameBoard[coorRow3][coorCol3] = "S";
			gameBoard[coorRow3][coorCol3 + 1] = "S";
			gameBoard[coorRow3][coorCol3 + 2] = "S";

		}
		else {

			gameBoard[coorRow3][coorCol3] = "S";
			gameBoard[coorRow3 + 1][coorCol3] = "S";
			gameBoard[coorRow3 + 2][coorCol3] = "S";

		}

		System.out.println("r\\c     0       1       2       3       4       5       6");
		for (int i = 0; i < gameBoard.length-1; i++) {

			for (int j = 0; j < gameBoard[i].length; j++) {
				if (j == 0) {
					System.out.print(i + "\t");
				}
				System.out.print(gameBoard[i][j] + "\t");
			}
			System.out.print("\n"); 
		}
		System.out.println("");


		////////////////////////////
		// Placing ship of length 4
		System.out.println("Please enter coordinates for ship of length 4:"); 
		System.out.println("Starting Row (0-6):"); 
		int coorRow4 = scan.nextInt();
		System.out.println("Starting Column (0-6):");
		int coorCol4 = scan.nextInt();
		scan.nextLine();
		System.out.println("From the starting point, extend down or right? (d/r):");
		String direction4 = scan.nextLine().toLowerCase();

		
		if (direction4.contains("r")) {
			gameBoard[coorRow4][coorCol4] = "S";
			gameBoard[coorRow4][coorCol4 + 1] = "S";
			gameBoard[coorRow4][coorCol4 + 2] = "S";
			gameBoard[coorRow4][coorCol4 + 3] = "S";
		}
		else {
			gameBoard[coorRow4][coorCol4] = "S";
			gameBoard[coorRow4 + 1][coorCol4] = "S";
			gameBoard[coorRow4 + 2][coorCol4] = "S";
			gameBoard[coorRow4 + 3][coorCol4] = "S";
		}

		System.out.println("r\\c     0       1       2       3       4       5       6");
		for (int i = 0; i < gameBoard.length-1; i++) {

			for (int j = 0; j < gameBoard[i].length; j++) {
				if (j == 0) {
					System.out.print(i + "\t");
				}
				System.out.print(gameBoard[i][j] + "\t");
			}
			System.out.print("\n"); 
		}

		System.out.println("Here's the final game grid... press Enter to begin playing!");
		String ent = scan.nextLine();

		System.out.println("\n\n\n\n\n");



		///////////////////////////////////////////////////
		// Guess begins!

		System.out.println("\t---------------  Begin!  ---------------");

		///////////////////////////////////////////////////

		///////////////////////////
		// Start of game


		int guessNumber = 1; // Tracks number of guesses
		int numberToHit = 0; // increments every time a ship is hit

		while (numberToHit <= 8) { // while the number of ships hit is < 8, bc there are 9 ships to hit

			///////////////////
			// Print hidden board
			System.out.println("r\\c     0       1       2       3       4       5       6");
			for (int i = 0; i < hiddenBoard.length-1; i++) {

				for (int j = 0; j < hiddenBoard[i].length; j++) {
					if (j == 0) {
						System.out.print(i + "\t");
					}
					System.out.print(hiddenBoard[i][j] + "\t");
				}
				System.out.print("\n"); 
			}
			System.out.println("");

			System.out.println("Guess number... " + guessNumber);

			///////////////
			// Gets Row and Col from user
			System.out.println("Guess a row (0-6):");
			int guessRow = scan.nextInt();

			System.out.println("Guess a column (0-6):");
			int guessCol = scan.nextInt();

			String uniqueCoor = guessRow + "-" + guessCol; // Getting unique coordinates to add to the Map and ArrayList

			String secondUniqueCoor = guessNumber + "\t| " + guessRow + "\t" + guessCol; // unique coordinates string for printability
			printGuessHistory.add(secondUniqueCoor); // adds to guess history
			
			//////////////////////////////////////////////////////////
			// If the place on the original game board is an S and hasn't been guessed on the foe game board
			if (gameBoard[guessRow][guessCol] == "S" && hiddenBoard[guessRow][guessCol] != "X" && hiddenBoard[guessRow][guessCol] != "m") {
				System.out.println("HIT!");


				if (!numGuess.containsKey(uniqueCoor)) {
					numGuess.put(uniqueCoor, 1);
					guessHistory.add(uniqueCoor);
				}
				else {
					int valueInc = numGuess.get(uniqueCoor);
					numGuess.put(uniqueCoor, valueInc + 1);
				}
				hiddenBoard[guessRow][guessCol] = "X";

				numberToHit += 1;
				guessNumber += 1;
			}
			/////////////////////////////////////////////////////
			// If it's already been guessed
			else if (hiddenBoard[guessRow][guessCol] == "X" || hiddenBoard[guessRow][guessCol] == "m") { // TODO

				System.out.println("r\\c=" + guessRow + "\\" + guessCol + " has already been guessed " + numGuess.get(uniqueCoor) +" time");

				int valueInc = numGuess.get(uniqueCoor);
				valueInc++;
				numGuess.put(uniqueCoor, valueInc);


				guessNumber += 1;
			}
			//////////////////////////////////////////////////
			// if the game board guess doesn't contain a ship, they missed
			else {
				System.out.println("MISS!");

				if (!numGuess.containsKey(uniqueCoor)) {
					numGuess.put(uniqueCoor, 1);
					guessHistory.add(uniqueCoor);
				}
				else {
					int valueInc = numGuess.get(uniqueCoor);
					numGuess.put(uniqueCoor, valueInc + 1);
				}
				hiddenBoard[guessRow][guessCol] = "m";

				guessNumber += 1;
			}

			System.out.println("\n\n----------------------------------");
		}
		
		//////////////////////////////////////////////////////////////////
		// Printing out the guess board using a for-loop and the print-formatted guess history
		guessNumber -= 1;
		System.out.println("Congratulations, you've sunk all the battleships!");
		System.out.println("You made a total of " + guessNumber + " guesses, listed as follows:");
		System.out.println("Guess\t| Row\tCol \n-------------------------");
		for (int h = 0; h < printGuessHistory.size(); h++) {
			System.out.println(printGuessHistory.get(h));

		}
		System.out.println("Thanks for playing! Goodbye.");

	}

}

