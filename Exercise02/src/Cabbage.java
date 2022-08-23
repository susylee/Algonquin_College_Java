//SU YEOUN LEE 
public class Cabbage {
	double weight;
	private double costPerKilogram;
	
	public Cabbage() {
		weight = 2.33;
		costPerKilogram = 2.5;
	}
	public Cabbage(double weight, double costPerKilogram) {
		weight = weight;
		costPerKilogram = costPerKilogram;
	}
	public Cabbage(Cabbage anotherCabbage) {
		weight = anotherCabbage.weight;
		costPerKilogram = anotherCabbage.costPerKilogram;
	}
	public double calculatePrice(double num1, double num2) {
		double price = num1 * num2;
		return price;
	}
	public void printReport() {
		System.out.println("cabbage.printReport() is:\nCabbage: weight " + weight + ", cost per kilogram " + costPerKilogram);
	}
	public void printReport(double a, double b) {
		System.out.println("Testing overloaded constructor with anotherCabbage");
		System.out.println("weight " + a + ", cost per kilogram " + b);
		System.out.println("anotherCabbage.printReport() is: \nCabbage: weight " + a + ", cost per kilogram " + b);
	}
	//setter getter
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setCostPerKilogram(double costPerKilogram) {
		this.costPerKilogram = costPerKilogram;
	}
	public double getCostPerKilogram() {
		return costPerKilogram;
	}
}
