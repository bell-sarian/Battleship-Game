import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* CS 125 - Intro to Computer Science II
 * File Name: CS125_Project5.java
 * Project 5 - Due 11/27/2018
 * Instructor: Dr. Dan Grissom
 * 
 * Name: Bell'aria Sarian
 * 
 * Description: Battleship game program where the user
 * can play against themself to gain ultimate
 * victory over Java and Maps! 
 */


public class CS125_Project5
{
	public static void main(String[] args)
	{
		// Your program should always output your name and the project number.
		// DO NOT DELETE OR COMMENT OUT. Replace with relevant info.
		System.out.println("Bell'aria Sarian");
		System.out.println("Project 5");
		System.out.println("");

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


/******************************************************************************
Insert 2 test cases, which represent program input/output for two different
combinations of inputs. You may literally copy and paste your console contents,
but your two test cases should be DIFFERENT from any test cases given in the
Project description itself.

------------
Test Case 1:
------------
(Your test case I/O here.)

Bell'aria Sarian
Project 5

---------------  Welcome to Battleship!  ---------------
r\c     0       1       2       3       4       5       6
0	-	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Please enter coordinates for ship of length 2:
Starting Row (0-6):
0
Starting Column (0-6):
0
From the starting point, extend down or right? (d/r):
d
r\c     0       1       2       3       4       5       6
0	S	-	-	-	-	-	-	
1	S	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Please enter coordinates for ship of length 3:
Starting Row (0-6):
0
Starting Column (0-6):
1
From the starting point, extend down or right? (d/r):
d
r\c     0       1       2       3       4       5       6
0	S	S	-	-	-	-	-	
1	S	S	-	-	-	-	-	
2	-	S	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Please enter coordinates for ship of length 4:
Starting Row (0-6):
0
Starting Column (0-6):
2
From the starting point, extend down or right? (d/r):
d
r\c     0       1       2       3       4       5       6
0	S	S	S	-	-	-	-	
1	S	S	S	-	-	-	-	
2	-	S	S	-	-	-	-	
3	-	-	S	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	
Here's the final game grid... press Enter to begin playing!







	---------------  Begin!  ---------------
r\c     0       1       2       3       4       5       6
0	-	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 1
Guess a row (0-6):
0
Guess a column (0-6):
0
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 2
Guess a row (0-6):
0
Guess a column (0-6):
1
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 3
Guess a row (0-6):
0
Guess a column (0-6):
2
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 4
Guess a row (0-6):
1
Guess a column (0-6):
0
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	X	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 5
Guess a row (0-6):
1
Guess a column (0-6):
1
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	X	X	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 6
Guess a row (0-6):
1
Guess a column (0-6):
2
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	X	X	X	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 7
Guess a row (0-6):
2
Guess a column (0-6):
1
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	X	X	X	-	-	-	-	
2	-	X	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 8
Guess a row (0-6):
2
Guess a column (0-6):
2
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	X	X	X	-	-	-	-	
2	-	X	X	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 9
Guess a row (0-6):
2
Guess a column (0-6):
3
MISS!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	X	X	X	-	-	-	-	
2	-	X	X	m	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 10
Guess a row (0-6):
3
Guess a column (0-6):
2
HIT!


----------------------------------
Congratulations, you've sunk all the battleships!
You made a total of 11 guesses, listed as follows:
Guess	| Row	Col 
-------------------------
1	|0	0
2	|0	1
3	|0	2
4	|1	0
5	|1	1
6	|1	2
7	|2	1
8	|2	2
9	|2	3
10	|3	2

------------
Test Case 2:
------------
(Your test case I/O here.)

Bell'aria Sarian
Project 5

---------------  Welcome to Battleship!  ---------------
r\c     0       1       2       3       4       5       6
0	-	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Please enter coordinates for ship of length 2:
Starting Row (0-6):
0
Starting Column (0-6):
0
From the starting point, extend down or right? (d/r):
r
r\c     0       1       2       3       4       5       6
0	S	S	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Please enter coordinates for ship of length 3:
Starting Row (0-6):
0
Starting Column (0-6):
2
From the starting point, extend down or right? (d/r):
d
r\c     0       1       2       3       4       5       6
0	S	S	S	-	-	-	-	
1	-	-	S	-	-	-	-	
2	-	-	S	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Please enter coordinates for ship of length 4:
Starting Row (0-6):
0
Starting Column (0-6):
3
From the starting point, extend down or right? (d/r):
r
r\c     0       1       2       3       4       5       6
0	S	S	S	S	S	S	S	
1	-	-	S	-	-	-	-	
2	-	-	S	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	
Here's the final game grid... press Enter to begin playing!







	---------------  Begin!  ---------------
r\c     0       1       2       3       4       5       6
0	-	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 1
Guess a row (0-6):
0
0Guess a column (0-6):

HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 2
Guess a row (0-6):
0
Guess a column (0-6):
0
r\c=0\0 has already been guessed 1 time


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	-	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 3
Guess a row (0-6):
0
Guess a column (0-6):
1
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	-	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 4
Guess a row (0-6):
0
Guess a column (0-6):
2
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 5
Guess a row (0-6):
0
Guess a column (0-6):
2
r\c=0\2 has already been guessed 1 time


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	-	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 6
Guess a row (0-6):
0
Guess a column (0-6):
3
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	X	-	-	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 7
Guess a row (0-6):
0
Guess a column (0-6):
5
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	X	-	X	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 8
Guess a row (0-6):
0
Guess a column (0-6):
5
r\c=0\5 has already been guessed 1 time


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	X	-	X	-	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 9
Guess a row (0-6):
0
Guess a column (0-6):
6
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	X	-	X	X	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 10
Guess a row (0-6):
0
Guess a column (0-6):
4
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	X	X	X	X	
1	-	-	-	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 11
Guess a row (0-6):
1
Guess a column (0-6):
2
HIT!


----------------------------------
r\c     0       1       2       3       4       5       6
0	X	X	X	X	X	X	X	
1	-	-	X	-	-	-	-	
2	-	-	-	-	-	-	-	
3	-	-	-	-	-	-	-	
4	-	-	-	-	-	-	-	
5	-	-	-	-	-	-	-	
6	-	-	-	-	-	-	-	

Guess number... 12
Guess a row (0-6):
2
Guess a column (0-6):
2
HIT!


----------------------------------
Congratulations, you've sunk all the battleships!
You made a total of 12 guesses, listed as follows:
Guess	| Row	Col 
-------------------------
1	| 0	0
2	| 0	0
3	| 0	1
4	| 0	2
5	| 0	2
6	| 0	3
7	| 0	5
8	| 0	5
9	| 0	6
10	| 0	4
11	| 1	2
12	| 2	2
Thanks for playing! Goodbye.




 ******************************************************************************/