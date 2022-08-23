/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : July 22, 2022
 * Modified : July 22, 2022
 * Description: Program using Scanner to data input
 */
// import scanner for data input
import java.util.Scanner;

// User class created
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	//method for input integer
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	//method overloaded with message for input integer
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	//method for input double
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	//method overloaded with message for input double
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
	
	//added method for input String to ask user to continue the program or not 
	public String toString() {
		String value = keyboard.next();
		return value;
	}
	
	
}