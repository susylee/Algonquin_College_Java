
public class Assignment03SuYeounLee {

	public static void main(String[] args) {
		//Variable declarations
		int roll = 0;
		//Create an array with 10 int rooms
		int[] diceRolls = new int[16];
		int totalRolls = 0;

		int oddNumberCounter = 0;
		int evenNumberCounter = 0;

		// sample the rolls
		//for statement to get random numbers of the dice
		for(int count = 0; count < 1000; count++) {
			roll = (int)(Math.random() * 16) + 1;
			diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}	
		// run a report
		//for statement to print the random number generated
		for(int index = 0; index < diceRolls.length; index++) {  // crashes
			System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
			//if the number is even, add 1 to evenNumberCounter
			if (diceRolls[index] %2 == 0) {
				evenNumberCounter++;
				//if the number is odd, add 1 to oddNumberCounter
			} else {
				oddNumberCounter++;
			}

			totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("The number of even rolls is " + evenNumberCounter);
		System.out.println("The number of odd rolls is " + oddNumberCounter);
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Su Yeoun Lee");

	}

}
