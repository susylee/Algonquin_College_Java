/**
   This program is the second test for the SalesAgent class including the subclasses.
 * @see
 * @author Su Yeoun Lee
 */
public class SalesAgentTest2 {  
	
	public static void main(String[] args) {
		/** 
		 * main method 
		 * @param 
		 * args arguments from command line 
		 */
		
		// Create SalesAgent Object
		SalesAgent ag = new SalesAgent("Fernando", 60);
		// Create SalesSupervisor Object
		SalesSupervisor sup = new SalesSupervisor("Paloma", 45, "Guadalajara");
		// Create SalesChief Object
		SalesChief sc = new SalesChief("SuYeoun", 30, "Tijuana", "IT");

		// Call methods toString()
		System.out.println(ag.toString());
		System.out.println(sup.toString());
		System.out.println(sc);
	}
}  