/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : June 10, 2022
 * Description: Cabbage // constructors // setter, getter methods
*/
import java.util.Scanner;

public class Exercise02_main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight: "); //2.33
		double weight = input.nextDouble(); 
		System.out.print("Enter cost per kilogram: "); //2.5
		double costPerKilogram = input.nextDouble();

		Cabbage cabbage = new Cabbage();
		cabbage.setWeight(weight);
		cabbage.setCostPerKilogram(costPerKilogram);
		System.out.println("cabbage.getWeight() is: " + cabbage.getWeight());
		System.out.println("cabbage.getCostPerKilogram() is: " + cabbage.getCostPerKilogram());
		
		double mul = cabbage.calculatePrice(2.33, 2.5);
		System.out.println("cabbage.calculatePrice() is: " + mul);
		//System.out.println("cabbage.calculatePrice() is: " + cabbage.calculatePrice(2.33, 2.5));
		
		cabbage.printReport();
			
		// Testing overloaded constructor with anotherCabbage
		//Weight 3.5, cost per kilogram 2.50
		//annotherCabbage.printReport() is: Cabbage: weight 3.5, cost per kilogram 2.5
		
		Cabbage anotherCabbage = new Cabbage();
		anotherCabbage.printReport(3.50,2.50);
		
		System.out.println("program implemented by Su Yeoun Lee");
	}
}
