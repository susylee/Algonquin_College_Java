// Student Name: Su Yeoun Lee (041054723)
// Lab Professor: Fedor Ilitchev
// Due Date: June 13, 2022
// Description: Lab Exam 01
  
public class SuYeounLeeLabExam1Section323 {

	public static void main(String[] args) {
		double weight = 19.5;
		double yarnCost = 1.25;
		
		Sweater sw1 = new Sweater(); //Instantiate one object(using no parameter constructor)
		
		sw1.setWeight(weight); //set a weight value
		sw1.setYarnCost(yarnCost); //set a yarn cost
		System.out.println("getOunces() is: " + sw1.getWeight()); // get a weight
		System.out.println("getCostPerOunce() is " + sw1.getYarnCost()); //get a yarn cost
		
		double total = sw1.wholesaleCost(); //call method wholesaleCost()
		
		System.out.println("Testing worker method: " + total); //print out the value of wholesaleCost()
		System.out.println("Program by Su Yeoun Lee");
		
	}

}
