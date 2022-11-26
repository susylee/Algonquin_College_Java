import java.util.Random;

public class Lab2 {

	char[] side = {'+','-','|',' '};

	public void printSquare(char[][] myArray) {
		System.out.println("myArray.length: "+myArray.length);
		for(int i=0; i<myArray.length; i++) {
			System.out.println("myArray[i].length: "+myArray[i].length);
			if(myArray[i].length!=0) {
				makeSquare(myArray[i]);
			}	
		}
	}

	public void makeSquare(char[] myArray1) {
		int cnt = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<6*myArray1.length+1; j++) {
				if(i%4==0) {
					if(j%6==0) {
						System.out.print(side[0]);
					}else {
						System.out.print(side[1]);
					}
				}else {
					if(j%6==0) {
						System.out.print(side[2]);
					}else {
						if(i==2&&j%6==3) {
							System.out.print(myArray1[cnt++]);
						}else {
							System.out.print(side[3]);
						}
					}
				}
				
			}
			System.out.println();
		}
	}
	
	  public static void main(String[] args) {
	      Lab2 thisLab = new Lab2();
	      int counter = 97; //ASCII lowercase a.
	      Random myrand = new Random(); //For random number generation
	      
	      int rows = myrand.nextInt(5)+1; 
	      char[][] myArray = new char[rows][]; //Creation of random-height 2D array.

	      for(int i=0; i<rows; i++) {
	         int cols = myrand.nextInt(6); //Value from 0 to 6.
	         myArray[i] = new char[cols]; //NB: There may be 0-width rows!
	         for (int j=0; j<cols; j++) {
	            myArray[i][j] = (char) counter++; //Fill array with chars.
	         }
	      }
	      thisLab.printSquare(myArray); // Call to your method.

	      
	   }
	  
}

