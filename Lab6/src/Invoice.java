/**
 * This class Invoice implements interface Payme with partNumber, partDescription, quantity, pricePerItem.
 * @see
 * @author Su Yeoun Lee
 */
public class Invoice implements Payme {
	//variables
	private String partNumber; 
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	/**
	 * In this portion of your code, construct a Invoice object. 
	 * @param part
	 * @param description
	 * @param count
	 * @param price
	 */
	public Invoice(String part, String description, int count, 
			double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); // validate and store quantity
		setPricePerItem(price); // validate and store price per item
	}

	/**
	 * set the part number
	 * @param part
	 */
	public void setPartNumber(String part) {
		partNumber = part; // should validate
	}

	/**
	   Returns the part number.
	   @return partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * set the part description
	 * @param description
	 */
	public void setPartDescription(String description) {
		partDescription = description; // should validate
	}

	/**
	   Returns the part description
	   @return partDescription
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * set the quantity
	 * @param count
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

	/**
	   Returns the quantity
	   @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * set the price item
	 * @param price
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}


	/**
	   Returns the price per item 
	   @return pricePerItem
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * toString method
	 * return String representation of Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%n%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 

	/**
	 * getPayment method 
	 * return amount of quantity * price per item 
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}


