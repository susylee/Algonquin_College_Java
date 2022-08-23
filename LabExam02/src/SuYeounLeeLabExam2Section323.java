/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : August 08, 2022
 * Description: Lab Exam2
 */

// Scanner imported
import java.util.Scanner;

// class created
public class SuYeounLeeLabExam2Section323 {

	public static void main(String[] args) {
		//Declarations 
		final int EDIT_COCOABEANS = 1;
		final int PRINT_COCOABEANS = 2;
		final int EXIT_COCOABEANS = 3;
		double tonnes, costPerTonne;
		int choice = 1;

		//Created a object of CocoaBeans
		CocoaBeans cocoa = new CocoaBeans();

		Scanner input = new Scanner(System.in);

		// While loop to print menu until user inputs 3.
		while(choice != EXIT_COCOABEANS) {
			// menu options
			System.out.println("Enter Option: ");
			System.out.println("1 to edit CocoaBeans");
			System.out.println("2 to show cost to purchase CocoaBeans");
			System.out.println("3 to exit program");
			System.out.println("Program by Su Yeoun Lee");
			
			// integer value entered by user will be saved in choice variable.
			choice = input.nextInt();

			//Used if-else for different outputs
			if(choice == EDIT_COCOABEANS) {
				System.out.print("Enter Tonne(s) of CocoaBeans: ");
				tonnes = input.nextDouble();
				// set the value entered by user.
				cocoa.setTonnes(tonnes);
				
				System.out.print("Enter cost per tonne to purchase CocoaBeans: ");
				costPerTonne = input.nextDouble();
				// set the value entered by user
				cocoa.setCostPerTonne(costPerTonne);
			}
			else if (choice == PRINT_COCOABEANS) {
				//Used String.format() method to print to 2 decimal places
				String printCocoa = String.format("%.2f", cocoa.calculateCost());
				System.out.println(printCocoa + " dollars to purchase CocoaBeans");

			}
			else if(choice == EXIT_COCOABEANS) {
				//Program exit
				System.out.println("Program exits");
			}
			else {
				// When user enters invalid values for the menu
				System.out.println("Invalid menu input");
			}

		} //while end

	} //main end

}
