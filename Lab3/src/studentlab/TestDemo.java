
package studentlab;

import java.util.Calendar;
import java.util.Scanner;

import fall22lab3.EventSchedule;

/**
 * WELCOME TO LAB 3!
 * The essence of this lab is to work with constructors and to show overloaded constructor calls.
 * It demonstrates chaining overloaded constructors using "this" keyword.
 * It helps to consolidate understanding of the chaining rules learned in the theory class
 * This program also displays a good example of writing comments in your code using the Javadoc style.  
 */

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Su Yeoun Lee
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	
	/**
	 * YOUR TASK: COMPLETE THE CODE FOR THIS DRIVER CLASS NAMED TestDemo.
	 * Hint:  See the SampleOutput file provided for the print statements required.
	*/

	public static void main(String[] args) {
		/** 
		 * main method 
		 * @param 
		 * args arguments from command line 
		*/
		
	/**
	 * YOUR CODE STARTS HERE
	*/
		Scanner input = new Scanner(System.in);
		
		System.out.println("EventSchedule1");
		EventSchedule event = new EventSchedule();

//		System.out.print("Year? -> ");
//		int year = input.nextInt();
		System.out.println("EventSchedule2");
		EventSchedule event1 = new EventSchedule(2023);
		
//		System.out.print("Year? -> ");
//		year = input.nextInt();
//		System.out.print("Month? -> ");
//		int month = input.nextInt();
		
		System.out.println("EventSchedule3");
		EventSchedule event2 = new EventSchedule(2023,12);
		
//		System.out.print("Year? -> ");
//		year = input.nextInt();
//		event2.setYear(year);
//		System.out.print("Month? -> ");
//		month = input.nextInt();
//		System.out.print("Day? -> ");
//		int day = input.nextInt();
//		
		System.out.println("EventSchedule4");
		EventSchedule event3 = new EventSchedule(2023,12,25);
		System.out.println(event3.createReport());
		
		
	/**
	 * YOUR CODE ENDS HERE
	*/
	}

}
