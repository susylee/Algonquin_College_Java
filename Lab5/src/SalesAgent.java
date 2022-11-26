/**
 * This is a program focuses on the OOP concept of Inheritance,
 * using super classes, subclasses, super keyword, toString(), overriding and more.
 * 
 * File name: SalesAgent.java
 * Author: Su Yeoun Lee
 * Course: CST8284_313
 * Professor: Fedor Ilitchev
 * Assignment: Assignment01
 * Date: November 08, 2022 
 * Purpose: If the SalesSupervisor class inherits the name, age, and toString() method 
 * 			from the SalesAgent class, and SalesChief class inherits from SalesSupervisor class.
 * 
 * @author Su Yeoun Lee
 * @version 11.0.16
 * @since 1.8.0_342
 * 
 */

/**
   This class shows a Sales Agent with a name and age.
 */
public class SalesAgent {  
	// variables
	private String name;
	private int age;
	

	/**
      In this portion of your code, construct a SalesAgent object.
      @param n the name of the Sales Agent
      @param a the age of the Sales Agent
	 */
	
	//default constructor
	public SalesAgent() {

	}

	//constructor with parameters
	public SalesAgent(String n, int a) {
		name = n;
		age = a;
	}

	/**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
	 */

	public String toString() {  
		return "Sales Agent [name=" + name + ",age=" + age + "]";
	}

	
}