/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : July 22, 2022
 * Modified : July 22, 2022
 * Description: Program to verify boolean isBagCorrectWeight() method in PotatoChipBag class.
*/
// Scanner import for data input
import java.util.Scanner;

// Assignment02 class 
public class Assignment02 {
	// main method
	public static void main(String[] args) {
		PotatoChipBag bag = new PotatoChipBag();
	
		User user = new User();
		// (other variables as needed)
		int goodBags = 0;
		int badBags = 0;

		// TODO
		// ask for bag size (as an integer, use the constants from PotatoChipBag
		while(true) {
			//System.out.println("Enter bag size: ");
			int size = user.inputInteger("Enter bag size: \n" + 
										"1 for regular size\n" +
										 "2 for large size");
			bag.setSize(size);

			if (bag.getSize() == 1 || bag.getSize() ==2) {

				// ask for the weight, accepting any number of decimal places
				//System.out.print("Enter weight: ");
				double weight = user.inputDouble("Enter weight: ");
				bag.setWeight(weight);

				// determine if the bag is good or bag
				boolean flag = bag.isBagCorrectWeight();

				// increment a bag counts for good, bad, total
				if(flag) {
					goodBags++;
				} else {
					badBags++;
				}

				// print out the good, bad, total bags
				System.out.println("Good bags: " + goodBags);
				System.out.println("Bad bags: " + badBags);
				System.out.println("Total bags: " + (goodBags + badBags));

			} 
			else {
				System.out.println("Invalid bag size entered");
			} 

			// output your name as in ACSIS
			System.out.println("Program by Su Yeoun Lee");

			// ask if there is more data (Yes, No) continuing on any Yes (not case
			// sensitive)
			System.out.println("Continue Program? (yes/no)");
			String yesOrNo = user.toString();

			if (yesOrNo.equalsIgnoreCase("yes")) {
				continue;
			}
			else if (yesOrNo.equalsIgnoreCase("no")) {
				System.out.println("Program has shut down");
				break;
			} else {
				System.out.println("Invalid input");
			}
			
		} 

		// NOTE: You can use any kind of loop, or decision structure you
		// would like. However a for loop is not recommended.

		// Remember: if the entered chip bag size is incorrect, do not
		// increase any counts, report an error, and keep the program
		// running (if text is input instead of a number the program
		// can crash, this is okay for this assignment)

	}
}