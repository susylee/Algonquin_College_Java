/**
 * This class shows a HourlyProgrammer with a wage and hours.
 * @see
 * @author Su Yeoun Lee
 */
public class HourlyProgrammer extends Programmer {
	// variables
	private double wage; // wage per hour
	private double hours; // hours worked for week

	/**
	 * In this portion of your code, construct a HourlyProgrammer object. 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param wage
	 * @param hours
	 */
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	} 

	/**
	 * set wage
	 * @param wage
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	} 

	/**
	   Returns the wage.
	   @return wage
	 */
	public double getWage() {
		return wage;
	} 

	/**
	 * set hours
	 * @param hours
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	} 

	/**
	   Returns the hours.
	   @return hours
	 */	public double getHours() {
		 return hours;
	 } 

	 /**
	  * getPayment method 
	  * return wage * hours
	  */
	 public double getPaymentAmount() {                                            
		 if (getHours() <= 40) { // no overtime                           
			 return getWage() * getHours();   
		 }
		 else {                                                             
			 return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		 }
	 }

	 /**
	  * toString method
	  * return String representation of Invoice object
	  */
	 @Override  
	 public String toString() {
		 return String.format("%nhourly Programmer: %s %s%nsocial security number: %s", 
				 getFirstName(), getLastName(), getSocialSecurityNumber());	
	 }

	 /**
	  * earnings method
	  * return payment amount
	  */
	 @Override
	 public double earnings() {
		 // TODO Auto-generated method stub
		 return getPaymentAmount();
	 }                                          

}