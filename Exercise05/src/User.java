//ToDo: Supervisor wants programmer comments (use /* */ comment)

import java.util.Scanner;

//User class created 
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
		System.out.print(message);
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
	
	//method for input String
	//added method for input String to ask user to continue the program or not 
	public String inputString() {
		//String value = keyboard.next();
		String value = keyboard.nextLine();
		return value;
	}
	
	//method overloaded with message for input String
	public String inputString(String message) {
		System.out.print(message);
		String value = inputString();
		return value;
	}
}