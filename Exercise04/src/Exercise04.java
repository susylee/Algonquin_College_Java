/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : July 22, 2022
 * Modified : July 22, 2022
 * Description: Program to verify MeterStick class.
*/
import java.util.Scanner;

/*
 * Class level overview goes here
 */
public class Exercise04 {
	/*
	 * method comment goes here
	 */
	public static void main(String[] args) {
        // create constants for the menu
		Scanner keyboard = new Scanner(System.in);
		MeterStick stick = new MeterStick();
		double userLength;
		int option;
		String output;

		System.out.println("Meter stick checker program.");
		System.out.print("Enter measured length in meters: "); //1.002
		userLength = keyboard.nextDouble();
		keyboard.nextLine();
		stick.setLength(userLength);

		// output the menu here, using constants
		System.out.println("Please select from one of the following:");
		System.out.println("1 to validate meter stick");
		System.out.println("2 to show meter stick length in centimeters");
		System.out.println("3 to show meter stick length in millimeters");
		System.out.println("4 to show meter stick report");
	
		// input user option
		option = keyboard.nextInt();

		// based on the user option entered perform the requested task
		// if outputting numbers directly from method main format to 5 decimal
		// places
		if(option==1) {
			System.out.println(stick.verify());
		} else if(option==2) {
			System.out.printf("Centimeters: %.5f\n", stick.toCentimeters());
		} else if(option==3) {
			System.out.printf("Millimeters: %.5f\n", stick.toMillimeters());
		} else if(option==4) {
			System.out.println(stick.toString());
		} else 
			System.out.println("Invalid menu option selected");
		
		
		System.out.println("Program by Su Yeoun Lee"); 
	}
}
