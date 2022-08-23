// Student Name: Su Yeoun Lee (041054723)
// Lab Professor: Fedor Ilitchev
// Due Date: June 13, 2022
// Description: Lab Exam 01

public class Sweater {
	//private data members
	private double weight;
	private double yarnCost;
	
	Sweater() { //default constructor(no parameter constructor)
		weight = 0;
		yarnCost = 0;
	}
	
	//getter for weight
	public double getWeight() {
		return weight;
	}

	//setter for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	//getter for yarnCost
	public double getYarnCost() {
		return yarnCost;
	}

	//setter for yarnCost
	public void setYarnCost(double yarnCost) {
		this.yarnCost = yarnCost;
	}

	//a worker method
	//this method multiplies the weight of the sweater times the cost per ounce of yarn
	//To calculate the wholesale cost of the sweater
	public double wholesaleCost() {
		double multiply = weight * yarnCost;
		return multiply;
	}
}
