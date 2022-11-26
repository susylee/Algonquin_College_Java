import java.util.Random;

public class Lab2_comment{

   public void printSquare(char[][] myArray) {

      char[] left = {'+', '|', '|', '|', '+'};
      char[][] squares = {
            {'-','-','-','-','-','+'},
            {' ', ' ', ' ', ' ',' ', '|'},
            {' ', ' ',  97, ' ',' ', '|'},
            {' ', ' ', ' ', ' ',' ', '|'},
            {'-','-','-','-','-','+'}

      };
      System.out.println("myArray.length"+myArray.length);
      for(int row = 0;row<myArray.length;row++) {
         // row개 만큼의 사각형줄을 만들어야 하므로 반복문 사용
         int col = 0;
         // row개의 col갯수를 저장하기 위한 변수
         System.out.println("myArray[row].length"+myArray[row].length);
         if(myArray[row].length==0) {
            // 0일 경우 넘어감
            continue;
         }
         for(int i=0; i<left.length; i++) {
            System.out.print(left[i]);
            // 가장 왼쪽의 변을 붙임
            for(int j=0; j<(myArray[row].length)*(squares[row].length); j++) {
               // 거꾸로 된 ㄷ자를 붙임
               if(i==2&&j%6==2) {
                  // 가운데(2,2)에 알파벳을 넣음
                  // 여기서 6은 squares[row]값
                  // row행의 col열의 알파벳(메인문에서 쓰여진 배열을 읽음)
                  System.out.print(myArray[row][col++]);
               }else {
                  // 언니가 만든 소스 였던 것 응용한 것
                  // 언니는 System.out.print((squares[i][j]));로 사용
                  // 이러면 j가 6을 넘어가게 되어서 에러발생
                  // 여기서 6은 squares[row]값
                  // 따라서 6으로 나눠준 나머지로 계산하게 되면 에러없어짐
                  // 나누기만 하면 된거니까 언니 잘 짠거야!!
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
