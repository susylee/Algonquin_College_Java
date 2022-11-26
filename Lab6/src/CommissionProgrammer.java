/**
 * This class shows a CommissionProgrammer with a grossSales and commissionRate.
 * @see
 * @author Su Yeoun Lee
 */
public class CommissionProgrammer extends Programmer { 
	// variables
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	/**
	 * In this portion of your code, construct a CommissionProgrammer object. 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param commissionRate
	 */
	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber,
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 


	/**
	 * set gross sales
	 * @param grossSales
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} 

	/**
	   Returns gross sales.
	   @return grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	} 

	/**
	 * set commission rate
	 * @param commissionRate
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	} 

	/**
	   Returns commission rate.
	   @return commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 

	/**
	 * getPayment method 
	 * return commission rate + gross sales
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}

	/**
	 * toString method
	 * return String representation of Invoice object
	 */
	@Override
	public String toString() {
		return String.format("\nCommissionProgrammer: %s %s%nsocial security number: %s", 
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

