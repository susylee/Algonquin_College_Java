/*
 * Author: Stanley Pieda
 * Date: March 16, 2022
 * Modified by: **** Su Yeoun Lee ***
 * Modified Date: **** August 05, 2022 ****
 * Description: Starter Code / Sample Solution Exercise 05
 * Starter Code Note: Use the pseudocode and complete the reset and run methods
 */

import java.util.Random;

/*
 * HighLowGame class to check fuelAvailable and to guess a number, and working methods.
 */
public class HighLowGame {
	private User user = new User(); // internapl only, no get/set
	private Random random = new Random(); // internal only, no get/set
	private int fuelAvailable;
	private int numberToGuess;
	private static final int MIN = 1; // internal only, no get/set
	private static final int MAX = 10; // internal only, no get/set

	/*
	 * No argument constructor, calls method reset to initialize the game
	 */
	public HighLowGame() {
		reset();
	}

	/*
	 * Accessor for fuelAvailable
	 */
	public int getFuelAvailable() {
		return fuelAvailable;
	}

	/*
	 * Mutator for fuelAvailable
	 */
	public void setFuelAvailable(int fuelAvailable) {
		this.fuelAvailable = fuelAvailable;
	}

	/*
	 * Access for numberToGuess
	 */
	public int getNumberToGuess() {
		return numberToGuess;
	}

	/*
	 * Mutator for numberToGuess
	 */
	public void setNumberToGuess(int numberToGuess) {
		this.numberToGuess = numberToGuess;
	}

	/*
	 * reset() method to reset the game when user wants to continue the game.
	 */
	public void reset() {
		// ToDo: See Pseudocode and / or flowchart

		int sum = 0;
		numberToGuess  = random.nextInt(MAX)+1;
		
		/* 
		for loop
		int value;
		for(value=MIN; value<=MAX; value++) {
		sum += value;
				}
		 */
		
		//while loop
		int value = MIN;
		while(value>=MIN && value<=MAX) {
			sum+=value;
			value++;
		}

		fuelAvailable = sum/2;
	}

	/*
	 * run() method to check if a number entered matches the randomly selected number
	 * 
	 */
	public void run() {
		// ToDo: See Pseudocode and / or flowchart
		CheckGuessResult checkGuessResult = null;
		String message;
		boolean isWon = false;
		int guessCount = 0;
		int userNumber;

		System.out.println("Guess the number from " + MIN + " to " + MAX);
		System.out.println("You have " + fuelAvailable + " guess-fuel remaining.");
		//numberToGuess = user.inputInteger("Guess the number from " + MIN + " to " + MAX);
		//fuelAvailable = user.inputInteger("You have " + fuelAvailable + " guess-fuel remaining.");

		while(fuelAvailable>0 && isWon==false) {
			guessCount = guessCount+1;
			userNumber = user.inputInteger("guess: ");
			
			if((userNumber<=0) || (userNumber>10)) {
				System.out.println("Enter a number between 1 to 10.");
			} 
			else {
				fuelAvailable = fuelAvailable - userNumber;
				if(fuelAvailable<0) {
					fuelAvailable = 0;
				}
				checkGuessResult = checkGuess(userNumber);	
				isWon = checkGuessResult.isWin() ;
				message = checkGuessResult.getMessage();
				System.out.println(message);
			}
		}//while
		message = reportGameResult(isWon, guessCount);
		System.out.println(message);
	}

	/*
	 * This method examines the guess to see if it matches the numberToGuess
	 * value. To report win or no-win, with a message as well a CheckGuessResult
	 * instance is created with these results, and the reference to the
	 * CheckGuessResult object is returned.
	 */
	private CheckGuessResult checkGuess(int guess) {
		boolean isWin = false;
		String message;

		if (guess == numberToGuess) {
			message = "You guessed the number";
			isWin = true;
		}
		else {
			if(guess < numberToGuess) {
				message = "too low, ";
			}
			else {
				message = "too high, ";
			}
			message = message + String.format(
					"%d guess-fuel remaining", fuelAvailable);
		}
		CheckGuessResult checkGuessResult = new CheckGuessResult(message, isWin);
		return checkGuessResult;
	}

	/*
	 * This method writes out a final result of the game (win or lose) as well
	 * as the number of guesses used by the player (i.e. the user).
	 */
	private String reportGameResult(boolean isWon, int guessCount) {
		String message;
		if(isWon) {
			message = "You win! It took you ";
		}
		else {
			message = "You did not win, you used ";
		}
		message = String.format(message + "%d guesses", guessCount);
		return message;
	}
}
