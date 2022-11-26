/**
 * This abstract class shows a Programmer with a firstName, lastName and socialSecurityNumber.
 * @see
 * @author Su Yeoun Lee
 */
public abstract class Programmer implements Payme {
	//variables
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	/**
	 * Returns the first name 
	 * @return firstName
	 */
	String getFirstName() {
		return firstName;
	}

	/**
	 * Returns the last name 
	 * @return lastName
	 */
	String getLastName() {
		return lastName;
	}

	/**
	 * Returns the social security number 
	 * @return socialSecurityNumber
	 */
	String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * In this portion of your code, construct a Programmer object. 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 */	
	public Programmer(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	/**
	 * toString method
	 * return String representation of Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s\n%s: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	} 

	/**
	 * abstract method
	 */
	public abstract double earnings();
} 

