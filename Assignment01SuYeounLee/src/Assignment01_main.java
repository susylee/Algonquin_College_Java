import java.util.Scanner;
/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : June 17, 2022
 * Description: how many of these table-tops can be varnished using one can of varnish.
*/
public class Assignment01_main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // class Scanner for input value
		TableTop tTop = new TableTop(); //creates an instance of class TableTop
		double diameter;
		int coats;
		double surfaceArea;
		double tablesPerCan;
		
		System.out.print("Enter diameter(inches): ");
		diameter = input.nextDouble(); //4.25
		System.out.print("Enter coats needed: ");
		coats = input.nextInt(); //4
		
		tTop.setDiameter(diameter);
		surfaceArea = tTop.calSurfaceArea();
		
		tablesPerCan = tTop.calCanUse(surfaceArea, coats);
		
		System.out.println("Tables per one can: " + tablesPerCan);
		System.out.println("Program by Su Yeoun Lee");
		
		//System.out.println(Math.PI); // Math class testing.. 3.141592653589793 
		
	}

}
