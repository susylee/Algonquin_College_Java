import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/**
 * 
 * File name: CarBrandList.java
 * Author: Su Yeoun Lee
 * Course: CST8284_313
 * Professor: Fedor Ilitchev
 * Assignment: Assignment03
 * Date: November 30, 2022 
 * Description:  lists of car brands and required to perform some operations.
	some interesting collection methods and concepts such as
	Lists, LinkedLists, ListIterators and more. Some specific methods have been mentioned.
 * 
 * @author Su Yeoun Lee
 * @version 11.0.16
 * @since 1.8.0_342
 * 
 */

public class CarBrandsList {

	/**
	 * the main method
	 * @param args arguments
	 */

	public static void main(String[] args) {

		/**
		 *  2 Arrays rides and rides2 of the type String with car brand names.
		 */
		String[] rides = {"cardillac", "toyota", "suzuki", "chevrolet", "hyundai", "mercedes"};
		String[] rides2 = {"volvo", "subaru", "volkswagen", "nissan", "cardillac", "toyota", "honda"};


		/**
		 *  Created two LinkedLists of Strings namely list1 and list2.
		 */
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();

		/**
		 *  Added the content of rides to list1 and then rides2 to list2
		 */
		for(int i=0; i<rides.length; i++) {
			list1.add(rides[i]);
		}
		//System.out.println(list1);


		for(int i=0; i<rides2.length; i++) {
			list2.add(rides2[i]);
		}
		//System.out.println(list2);

		/*
		 * Used the asList method and the LinkedList to make the code more concise.
		 */
		List<String> lst = Arrays.asList(rides);
		//System.out.println(lst);

		/*
		 * Add the elements in list2 to list1 using the addAll method.
		 */
		list1.addAll(list2);

		/*
		 * Created a method named printList() to print our the updated content of list1.
		 */
		printList(list1);
		//list1.removeAll(list2);

		/*
		 * converted all the elements in list1 to uppercase and print out this update.
		 */
		for(int i=0; i<list1.size(); i++ ) {
			list1.set(i, list1.get(i).toUpperCase());
		};
		System.out.println("This is showing the Car Brands in uppercase letters...\r\n"
				+ "List is:");
		System.out.println("Uppercase: " + list1.toString()+"\n");


		/*
		 * obtained the sublist and use the clear method to delete sublist items.
		 * deleted car brands (in positions) 5 to 7 from the list, and then print out the updated output at this point.
		 */
		List sublist = list1.subList(5, 7);
		//System.out.println(sublist); //[MERCEDES, VOLVO]

		sublist.clear();
		System.out.println("Deleting the car brands 5 to 7...\r\n"
				+ "List is:");
		System.out.println(list1 + "\n");

		/*
		 * the current list in reverse order using the printReversedList method
		 */
		printReversedList(list1);


		/*
		 * sorted the list to ensure that the contents are in alphabetical order using the sort method.
		 * print the list to show this expected order.
		 */
		Collections.sort(list1);
		System.out.println("Sorted car brands in an alphabetical order...\r\n"
				+ "List is:");
		System.out.println(list1 + "\n");

		/*
		 * call method printNonDuplicates to eliminate all duplicated elements and then print out the final content of the list.
		 */
		printNonDuplicates(list1);

	}

	/**
	 * method to print list1        
	 */
	public static void printList (LinkedList<String> list1) {
		System.out.println("Updated list:\n" + list1.toString() + "\n");

	}//printList


	/**
	 * @return list1 with elements in reversed order.        
	 */
	private static LinkedList<String> printReversedList(LinkedList<String> list1) {
		Collections.reverse(list1);
		System.out.println("Reversed List:\n" + list1 + "\n");
		return list1;

	} //printReversedList

	/**
	 * method to remove duplicated elements using HashSet and print the final content. 
	 */
	private static void printNonDuplicates(LinkedList<String> list1) {
		Set<String> set = new HashSet<>(list1);
		List<String> after = new ArrayList<>(set);
		System.out.println("Removing duplicate car brands...");
		System.out.println(after);

	} //printNonDuplicates

}
