/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : July 22, 2022
 * Modified : July 22, 2022
 * Description: Program to verify the lengths of meter sticks is within 0.0001 meters of 1 meter.
 */
/*
 * Class level overview goes here
 */
public class MeterStick {
	public static final double EXPECTED_LENGTH = 1.0; // meters
	public static final double EPSILON = 0.0001;
	private double length;
	/*
	 * default constructor
	 */
	public MeterStick() {  
		this(EXPECTED_LENGTH);
	}

	/*
	 * constructor with parameters
	 */
	public MeterStick(double length) { 
		this.length = length;
	}

	/*
	 * get for length
	 */
	public double getLength() { 
		return length;
	}

	/*
	 * set for length
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/*
	 * method to see the centimeters of the meter stick
	 */
	public double toCentimeters() {
		double centimeters;
		centimeters = length * 100;
		return centimeters;
	}

	/*
	 * method to see the millimetres of the1. meter stick
	 */
	public double toMillimeters() {
		double millimeters;
		millimeters = length * 1000;
		return millimeters;
	}

	/*
	 * method to see a text report that represents the meter stick.
	 */
	public String toString() {
		String report;
		report = String.format("MeterStick length %.5f", getLength());
		return report;
		
	} //toString

	/*
	 * method to verify if the company uses a tolerance of 0.0001 meters 
	 */
	public String verify() { 
		String tolerance = String.format("Meter stick is within tolerance of %.5f", EPSILON);
		//String tolerance = "Meter stick is within tolerance of " + EPSILON;
		String notTolerance = String.format("Meter Stick is not within tolerance of %.5f", EPSILON);
		//String notTolerance = "Meter stick is not within tolerance of " + EPSILON;
		
		if((Math.abs(length - EXPECTED_LENGTH)) <= EPSILON) {
			return tolerance;
			
		} else {
			return notTolerance; 
		}
	}//verify
}
