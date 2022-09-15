
public class Sept14 {

	public static void main(String[] args) {

		int lengthOfArray =7;
		int[] anIntegerArray;
		anIntegerArray = new int[lengthOfArray];
		anIntegerArray[0] = 5;
		anIntegerArray[1] = 9;
		
		for(int i=0; i<anIntegerArray.length; i++) 
			anIntegerArray[i] = (int)Math.pow(i, 2);
		
		
		System.out.println("the first item is " + anIntegerArray[0]);
		
		for (int i=0; i<anIntegerArray.length; i++) 
			System.out.println("Item number "+ i+ " is "+ anIntegerArray[i]);
			
			String[] someWords = {"whale","dog", "centipede"};
			
	}

}
