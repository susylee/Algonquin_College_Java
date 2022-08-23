import java.util.Scanner;
/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : June 24, 2022
 * Modified : June 24, 2022
 * Description: math problems related to right angle triangles
*/
public class Exercise03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create a scanner object
		System.out.println("Right angle triangle program"); 
		//Prompt the user for inputs
		System.out.print("Enter adjacent length: "); //2.0
		double adjacent_length = input.nextDouble();
		System.out.print("Enter opposite length: "); //3.0
		double opposite_length = input.nextDouble();

		//Place the data into an instance of your class
		RightAngleTriangle rat = new RightAngleTriangle(); //Instantiate one object(using no parameter constructor)
		rat.setAdjacent(adjacent_length);
		rat.setOpposite(opposite_length);
		
		//Provide outputs resulting from using the worker methods.
		//All number outputs should be formatted to 4 decimal places(using String.format)
		System.out.println(rat.createReport()); //print out the summary
		System.out.printf("Hypotenuse %.4f\n", rat.calculateHypotenuse());
		System.out.printf("Perimeter %.4f\n", rat.calculatePerimeter());
		System.out.printf("Area %.4f\n", rat.calculateArea());
		//System.out.println(String.format("Hypotenuse %.4f", rat.calculateHypotenuse())); another way using String.format
		//System.out.println(String.format("Perimeter %.4f", rat.calculatePerimeter()));
		//System.out.println(String.format("Area %.4f", rat.calculateArea()));

		System.out.println("program implemented by Su Yeoun Lee");
	}

}
