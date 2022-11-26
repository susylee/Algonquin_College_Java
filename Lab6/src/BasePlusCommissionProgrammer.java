/**
 * This is a program focuses on abstract classes, inheritance, polymorphism and
 * interfaces to implement polymorphic behavior on an interface.
 * 
 * File name: BasePlusCommissionProgrammer.java
 * Author: Su Yeoun Lee
 * Course: CST8284_313
 * Professor: Fedor Ilitchev
 * Assignment: Lab6
 * Date: November 19, 2022 
 * Purpose: If the BasePlusCommissionProgrammer class inherits the firstName, lastName, socialSecurityNumber, grossSales, commisionRate and toString() method 
 * 			from the CommissionProgrammer class
 * 
 * @author Su Yeoun Lee
 * @version 11.0.16
 * @since 1.8.0_342
 * 
 *
   This class shows a BasePlusCommissionProgrammer with a baseSalary.
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 
	//variable
	private double baseSalary; // base salary per week

	/**
	 * In this portion of your code, construct a BasePlusCommissionProgrammer object. 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNumber
	 * @param grossSales
	 * @param commissionRate
	 * @param baseSalary
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber,  
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, 
				 grossSales, commissionRate);
		this.baseSalary = baseSalary;

		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	}

	/**
	 * set Base Salary
	 * @param baseSalary
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	} 

	/**
	   Returns the base salary.
	   @return base salary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * getPayment method 
	 * return base salary + super.getPaymentAmount()
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	}

	/**
	 * toString method
	 * return String representation of Invoice object
	 */
	@Override 
	public String toString() {
		return String.format("base-plus commission programmer: %s %s%nsocial security number: %s\ngross sales: $%.2f; commission rate: %.2f; base salary: $%.2f", 
				getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(),getBaseSalary());
	}  

}
