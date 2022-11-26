import java.util.Random;

public class Lab2 {

   public void printSquare(char[][] myArray) {

      char[] left = {'+', '|', '|', '|', '+'};
      char[][] squares = {
            {'-','-','-','-','-','+'},
            {' ', ' ', ' ', ' ',' ', '|'},
            {' ', ' ',  ' ', ' ',' ', '|'},
            {' ', ' ', ' ', ' ',' ', '|'},
            {'-','-','-','-','-','+'}

      };
      System.out.println("myArray.length"+myArray.length);
      for(int row = 0;row<myArray.length;row++) { //myArray 행의 갯수만큼 반복
         int col = 0;
         System.out.println("myArray[row].length"+myArray[row].length); 
         if(myArray[row].length==0) { 
            continue;
         }
         for(int i=0; i<left.length; i++) {
            System.out.print(left[i]); 
            for(int j=0; j<(myArray[row].length)*(squares[row].length); j++) { // 거꾸로된 ㄷ자 출력
               if(i==2 && j % 6==2) { // char(alphabet)
                  System.out.print(myArray[row][col++]);
               }else {
                  System.out.print((squares[i][j%(squares[row].length)]));
               }
            }
            System.out.println();
         }
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
