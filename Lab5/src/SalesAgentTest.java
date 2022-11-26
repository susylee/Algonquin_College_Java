
/**
   This program is the first test for the SalesAgent class including the subclass. Check the lab slides to ensure you include every item required.
 * @see
 * @author Su Yeoun Lee
 */

public class SalesAgentTest {  
	public static void main(String[] args) {
		/** 
		 * main method 
		 * @param 
		 * args arguments from command line 
		 */
		
		// Create SalesAgent Object
		SalesAgent agent = new SalesAgent("Andres", 55);
		// Call a method toString()
		System.out.println(agent.toString());

		// Create SalesSupervisor Object
		SalesSupervisor suvi = new SalesSupervisor("Carlos", 45, "Cartagena");
		// Call a method toString()
		System.out.println(suvi.toString());
	}
}  