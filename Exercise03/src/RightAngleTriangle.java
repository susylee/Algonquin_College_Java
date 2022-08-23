/*Student Name : Su Yeoun Lee
 * Lab Professor : Professor Fedor Ilitchev
 * Due date : June 24, 2022
 * Modified : June 24, 2022
 * Description: math problems related to right angle triangles
*/
public class RightAngleTriangle {
		private double adjacent;
		private double opposite;
		
		public RightAngleTriangle() { //default constructor(no parameter constructor)
			
		}

		public RightAngleTriangle(double adjacent, double opposite) { //constructor with parameters
			this.adjacent = adjacent;
			this.opposite = opposite;
		}
		
		public double getAdjacent() { // get for adjacent
			return adjacent;
		}
		public void setAdjacent(double adjacent) { // set for adjacent
			this.adjacent = adjacent;
		}
		public double getOpposite() { // get for opposite
			return opposite;
		}
		public void setOpposite(double opposite) { // set for opposite
			this.opposite = opposite;
		}
		
		//method1 to calculate hypotenuse using Math class
		public double calculateHypotenuse() {
			double hypotenuse_square;
			hypotenuse_square = (Math.pow(adjacent, 2)) + (Math.pow(opposite,2));
			double hypotenuse = Math.sqrt(hypotenuse_square);
			return hypotenuse;
		}
		
		//method2 to calculate perimeter calling the method calculateHypotenuse()
		public double calculatePerimeter() {
			double perimeter;
			perimeter = adjacent + opposite + calculateHypotenuse();
			return perimeter;
		}
		
		//method3 to calculate area
		public double calculateArea() {
			double area;
			area = adjacent * opposite / 2;
			return area;
		}
		
		//method4 to report calling method calculateHypotenuse()
		public String createReport() {
	        String report = String.format("adjacent %.4f, opposite %.4f, hypotenuse %.4f", 
	        		getAdjacent(), getOpposite(),calculateHypotenuse());
	        return report;
			
		}
		
}
