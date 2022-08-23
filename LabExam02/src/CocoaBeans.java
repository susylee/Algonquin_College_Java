/*
 * Author Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: The due date
 * Description: Starter Code for Lab Exam 2 (22S) Section 323
 */

/*
 * This class abstracts a measure of Cocoa Beans in tonnes, with the weight
 * in tonnes, and the costPerTonne in dollars. There is a worker method
 * to calculate the cost based on the number
 * of tonnes and the cost per tonne in dollars.
 */
public class CocoaBeans {
	private double tonnes; // weight of Cocoa Beans to dispose
	private double costPerTonne; // cost in dollars per tonne
	
	/*
	 * no-argument constructor, sets fields to zero
	 */
	public CocoaBeans() {
		tonnes = 0.0;
		costPerTonne = 0.0;
	}

	/*
	 * acessor for tonnes
	 */
	public double getTonnes() {
		return tonnes;
	}

	/*
	 * mutator for tonnes
	 */
	public void setTonnes(double tonnes) {
		this.tonnes = tonnes;
	}

	/*
	 * accessor for costPerTonne in dollars
	 */
	public double getCostPerTonne() {
		return costPerTonne;
	}

	/*
	 * mutator for costPerTonne in dollars
	 */
	public void setCostPerTonne(double costPerTonne) {
		this.costPerTonne = costPerTonne;
	}
	
	/*
	 * Calculates the Cost of the Cocoa Beans
	 * based on the cost per tonne times the number of tonnes.
	 */
	public double calculateCost() {
		double cost;
		cost = tonnes * costPerTonne;
		return cost;
	}

}
