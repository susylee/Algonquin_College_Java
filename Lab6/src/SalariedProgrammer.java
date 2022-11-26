/**
 * This class shows a SalariedProgrammer with a weeklySalary.
 * @see
 * @author Su Yeoun Lee
 */
public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;

	/**
	 * In this portion of your code, construct a SalariedProgrammer object. 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param weeklySalary
	 */
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, 
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	 * set weekly salary
	 * @param weeklySalary
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	/**
	   Returns the weekly salary.
	   @return weeklySalary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	/**
	 * getPayment method 
	 * return base salary + super.getPaymentAmount()
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}     

	/**
	 * toString method
	 * return String representation of Invoice object
	 */
	@Override       
	public String toString() {
		return String.format("%nSalaried Programmer: %s %s%nsocial security number: %s",
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
