/**
 * This main class shows a PaymeInterfaceTest.
 * @see
 * @author Su Yeoun Lee
 */
public class PaymeInterfaceTest  {
	/** 
	 * main method 
	 * @param 
	 * args arguments from command line 
	 */
	public static void main(String[] args) {

		// Payme array with 6 elements.
		Payme[] paymeObjects = new Payme[6];

		// Array with objects that implements Payme
		paymeObjects[0] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 1200.00, 0.04, 720.00);
		paymeObjects[1] = new HourlyProgrammer("Kangin", "Lee", "12345", 18.95, 40);
		paymeObjects[2] = new CommissionProgrammer("Leo", "Hernan", "56789",16500.00, 0.44);
		paymeObjects[3] = new SalariedProgrammer("Noel", "Park", "12345", 320.00);
		paymeObjects[4] = new Invoice("22776","brakes", 3, 300.00);
		paymeObjects[5] = new Invoice("33442", "gear", 5, 90.99);

		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n"); 

		// generically process each element in array paymeObjects
		for (Payme currentPayme : paymeObjects) {
			// output currentPayme and its appropriate payment amount
			System.out.printf("%s \n", currentPayme.toString()); 

			// downcast Payme reference to BasePlusCommissioProgrammer reference
			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				BasePlusCommissionProgrammer programmer = 
						(BasePlusCommissionProgrammer) currentPayme;

				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f\n",
						programmer.getBaseSalary());
				
				//downcast Payme reference to HourlyProgrammer reference
			} else if(currentPayme instanceof HourlyProgrammer) {
				HourlyProgrammer hrProgrammer = (HourlyProgrammer) currentPayme;
				System.out.printf("hourly wage: $%.2f; hours worked: %.2f%n", hrProgrammer.getWage(), hrProgrammer.getHours());

				//downcast Payme reference to CommissionProgrammer reference
			} else if (currentPayme instanceof CommissionProgrammer) {
				CommissionProgrammer cmProgrammer = (CommissionProgrammer) currentPayme;
				System.out.printf("gross slaes: %,.2f; commission rate: %,.2f%n", cmProgrammer.getGrossSales(), cmProgrammer.getCommissionRate());

				//downcast Payme reference to SalariedProgrammer reference
			} else if (currentPayme instanceof SalariedProgrammer) {
				SalariedProgrammer salaryProgrammer = (SalariedProgrammer) currentPayme;
				System.out.printf("weekly salary: $%.2f\n", salaryProgrammer.getWeeklySalary());
			}

			// print statement for Payment due: 
			System.out.printf("Payment due: $%,.2f\n ", currentPayme.getPaymentAmount());
		}
	}
}
