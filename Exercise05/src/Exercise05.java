/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : August 05, 2022
 * Description: Starter Code / Sample Solution Exercise 05
 * Starter Code Note: No changes required to this file.
 */

/*
 * This class only contains method main, to drive the application.
 */
public class Exercise05 {

	/*
	 * In method main reset(), run() methods of HighLowGame class will be runned by user.
	 */
	public static void main(String[] args) {
		// ToDo: See Pseudocode and / or flowchart

		User user = new User();
		HighLowGame game = new HighLowGame();
		String CONTINUE_GAME = "Y";
		String EXIT_GAME = "N";
		String shouldContinue = EXIT_GAME;

		do{
			if(shouldContinue.equalsIgnoreCase(CONTINUE_GAME)) {
				game.reset();
			}
			game.run();
			
			shouldContinue = user.inputString("Would you like to play again?(Y/N)? ");
			
		}while(shouldContinue.equalsIgnoreCase(CONTINUE_GAME));
		System.out.println("Program by Student Su Yeoun Lee");

	}
}
