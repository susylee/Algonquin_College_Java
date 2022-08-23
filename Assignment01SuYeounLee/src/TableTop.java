/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : June 17, 2022
 * Description: how many of these table-tops can be varnished using one can of varnish.
*/
public class TableTop {
	private double diameter; //in inch
		
	public TableTop() { //default constructor (initialize with 0) 
		diameter = 0; // 
	}
	
	public TableTop(double diameter) { //constructor overloaded 
		this.diameter = diameter;
	}
	
	public double getDiameter() { // get for diameter
		return diameter;
	}
	
	public void setDiameter(double diameter) { //set for diameter
		this.diameter = diameter;
	}
	
	//method 1 that calculates surface area with diameter and return area value
	public double calSurfaceArea() { 
		double radius;
		double area;
		radius = diameter / 2 ;
		area = Math.PI * (Math.pow(radius,2)); // Java API Math class to obtain a value for PI, and to calculate the power of the radius (or diameter) raised to 2
		return area;
	}
	
	//method 2 that calculates the number of tables that can be varnished and returns tablePerCan value
	public double calCanUse(double surfaceArea, int coats) { 
		double tablePerCan;
		tablePerCan = 46800/(surfaceArea*coats);
		return tablePerCan;
	}
	
}
