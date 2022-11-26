/**
   This class shows a SalesSupervisor with a location.
 */
public class SalesSupervisor extends SalesAgent {
	// variable
	private String location;
	
	/**
    In this portion of your code, construct a SalesSupervisor object.
    @param n the name of the Sales Agent
    @param a the age of the Sales Agent
    @param l the location of the Sales Supervisor
	 */
	
	//constructor with parameters
	public SalesSupervisor(String n, int a, String l) {
		super(n,a);
		location = l;
	}
	
	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
	 */

	public String toString() {
		return "Sales Supervisor [super=" + super.toString() + ",location=" + location + "]";
	}
}


