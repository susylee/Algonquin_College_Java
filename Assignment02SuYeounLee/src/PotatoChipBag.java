/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : July 22, 2022
 * Modified : July 22, 2022
 * Description: Program to verify potato chip bag size and weight.
 */

// class for setter, getter and boolean worker method

//PotatoChipBag class 
public class PotatoChipBag {
	private int size; // Regular or Large (use constants below)
	private double weight; // oz
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz

	// TODO: declare an EPSILON constant with value 0.01
	private static final double EPSILON = 0.01;

	//default constructor
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}

	//constructor overloaded with parameters
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}

	//get for size
	public int getSize() {
		return size;
	}

	//set for size
	public void setSize(int size) {
		this.size = size;
	}

	//get for weight
	public double getWeight() {
		return weight;
	}

	//set for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//worker method to verify if the weight entered by user is within tolerance or not
	public boolean isBagCorrectWeight() {
		boolean result = false; // can be changed to true here if needed
		// TODO:
		// Use EPSILON to check if the weight is within tolerance,
		// when user input option1
		if (size == 1) {
			if ((Math.abs(weight - REGULAR_WEIGHT)) <= EPSILON) {
				result = true;
				//if the weight entered is out of tolerance	
			} else {
				result = false;
			}
			//when user input option2 	
		} else if (size == 2) {
			if ((Math.abs(weight - LARGE_WEIGHT)) <= EPSILON) {
				result = true;
				// if the weight entered is out of tolerance
			} else {
				result = false;
			}
			// when user input a value other than 1 or 2
		} else {
			System.out.println("Invalid input");
		}
		// based on size of bag and weight. Regular size at 9.25 oz, Large 
		// size at 15.75 oz, within 0.01 oz.
		return result;
	}
}