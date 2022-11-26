/**
   This class shows a SalesChief with a department.
 */
public class SalesChief extends SalesSupervisor {
	// variable
	private String department;
	
	/**
      In this portion of your code, construct a SalesChief object.
      @param n the name of the Sales Agent
      @param a the age of the Sales Agent
      @param l the location of the Sales Supervisor
      @param d the department of the Sales Chief
	 */
	
	//constructor with parameters
	public SalesChief(String n, int a, String l, String d) {
		super(n,a,l);
		department = d;
	}

	/**
    This portion of your code returns the string representation of the object.
    @return a string representation of the object
	 */

	public String toString() {
		return "Sales Chief [super=" + super.toString() + ",department=[" + department + "]";
	}
}

