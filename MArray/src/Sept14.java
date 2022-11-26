
public class Sept14 {

	public static void main(String[]args) {
		
		int lengthOfArray = 7;
		int[]anIntegerArray;
		anIntegerArray = new int[lengthOfArray];
		anIntegerArray[0] = 5;
		anIntegerArray[1] = 9;
		
		for (int i = 0; i < anIntegerArray.length; i ++)
			anIntegerArray[i] = (int)Math.pow(i, 2);
		
		
		System.out.println("the first item is " +anIntegerArray[0]);
		
		for (int i = 0; i < anIntegerArray.length; i ++)
			System.out.println("Item number "+i+" is "+ anIntegerArray[i]);
		
		String[]someWords = {"whale","dog","centipede"};
		double[][]arrayOfArrays = { {1,2,3},
									{4,5,6},
									{7,8,9}};
		
		String[][]squareOfWords = new String[5][];
		
		squareOfWords[0] = new String[3];
		squareOfWords[0][0]="someWord";
		squareOfWords[0][1]="someOtherWord";
		
		System.out.println(squareOfWords[0][1]);
		
	}
	
}
