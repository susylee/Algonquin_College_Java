import java.util.Calendar;
import java.util.Scanner;
/**
 * This is a program that analyses the patient's data,
 * Draws conclusions, and shows the results to the user. 
 * This system stores vital health information about a patient.
 * 
 * File name: MyHealthData.java
 * Author: Su Yeoun Lee
 * Course: CST8284_313
 * Professor: Fedor Ilitchev
 * Assignment: Assignment01
 * Date: November 07, 2022 
 * Purpose: This is a program that analyses the patient's data,
 *          Draws conclusions, and shows the results to the user. 
 *          This system stores vital health information about a patient.
 * 
 * @author Su Yeoun Lee
 * @version 11.0.16
 * @since 1.8.0_342
 * 
 */
public class MyHealthData {
	// variables
	public String firstName;
	public String lastName;
	public String gender;
	public int birthYear;
	public int currentYear;
	public double height; //inches 65inches = 165.1cm
	public double weight; //pounds 150 pounds = 68.04kg


	/**
	 * Default constructor
	 */
	public MyHealthData () {

	}

	/**
	 * This constructor with parameters sets the values of all the above stated
	 * attributes
	 * 
	 * @param firstName, lastName, gender, birthYear, currentYear, height, weight and Abbreviations for all the attributes of the class.
	 */

	public MyHealthData(String firstName, String lastName, String gender, int birthYear, int currentYear, double height,
			double weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;
	}

	// getter and setters

	/**
	 * Returns the first name of the patient
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of patient
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of the patient
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Sets the last name of patient
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the gender of the patient
	 * 
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender of patient
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Returns the birtYear of the patient
	 * 
	 * @return birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * Sets the birthYear of patient
	 * 
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Returns the currentYear of the patient
	 * 
	 * @return currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * Sets the currentYear of patient
	 * 
	 * @param currentYear
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	/**
	 * Returns the height of the patient
	 * 
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height of patient
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Returns the weight of the patient
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight of patient
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Returns the age of the patient
	 * 
	 * @return age (currentYear-birthYear)
	 */
	public int calculateAge() {
		int age = currentYear - birthYear;
		return age;
	}

	/**
	 * Returns the maximum heart rate of the patient
	 * 
	 * @return maximumHealthRate(220 - age of patient)
	 */
	public double getMaximumHeartRate() {
		//Hint 2: MaximumHeartRate is calculated as: 220 – Age in years)
		double maximumHealthRate = 220 - calculateAge();
		return maximumHealthRate;
	}

	/**
	 * method to calculate minimum target heart rate
	 * Returns the minimum target heart rate of the patient
	 * 
	 * @return minimumTargetHeartRate(50% 0f age of patient)
	 */

	public double getMinimumTargetHeartRate() {
		//Hint 3: MinimumTargetHeartRate is calculated as: 50% of MaximumHeartRate.
		double minimumTargetHeartRate = getMaximumHeartRate() * 0.5 ;
		return minimumTargetHeartRate;
	}

	/**
	 * method to calculate Maximum target heart rate
	 * Returns the maximum target heart rate of the patient
	 * 
	 * @return maximumTargetHeartRate(85% of age of patient)
	 */
	public double getMaximumTargetHeartRate() {
		//Hint 4: MaximumTargetHeartRate is calculated as: 85% of 
		double maximumTargetHeartRate = getMaximumHeartRate() * 0.85;
		return maximumTargetHeartRate;
	}

	/**
	 * method to calculate BMI of patient
	 * Returns the BMI
	 * 
	 * @return (weight*703)/(height*height)
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight()); 
	} 


	/**
	 * This method displays all the information of the patient
	 */
	public void displayMyHealthData() { 

		//System.out.println("Patient's Health Data is: " + firstName +", " + lastName +", " +  gender +", " +  birthYear + ", " + height +", " +  weight +", " +  calculateAge() +", " + getMaximumHeartRate() + ", " + getMaximumTargetHeartRate() + ", " + getMinimumTargetHeartRate() + ", " + getBMI());
		//System.out.printf("Patient's Health Data is: %s, %s, %s, %d, %.2f, %.2f, %d, %.2f, %.2f, %.2f, %n", firstName, getLastName(), getGender(), getBirthYear(), getHeight(), getWeight(), calculateAge(), getMaximumHeartRate(), getMaximumTargetHeartRate(), getMinimumTargetHeartRate(), "\n");
		System.out.printf("Patient's Health Data :\nFirst name: %s \nLast name: %s \nGender: %s \nBirth year: %d \nHeight: %.2f \nWeight: %.2f \nAge: %d \nMaximum Heart Rate: %.2f \nTarget Heart Rate: %.2f - %.2f\nBMI: %.2f %n", firstName, getLastName(), getGender(), getBirthYear(), getHeight(), getWeight(), calculateAge(), getMaximumHeartRate(), getMinimumTargetHeartRate(), getMaximumTargetHeartRate(),  getBMI(), "\n");
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
	} //displayMyHealthData

} //end class MyHealthData