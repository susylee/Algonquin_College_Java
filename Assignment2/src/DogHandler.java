import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DogHandler {

	class ExceptionDog extends Exception {
		//These exception subclasses are empty; they contain no code
	}
	
	class ExceptionPuppy extends ExceptionDog {
		//These exception subclasses are empty; they contain no code
	}
	
	public static void main(String[] args) throws IOException {
	
		DogHandler dogHandler = new DogHandler();
		
		try {
			ExceptionDog exDog = (ExceptionDog) new Exception();
//			if(exDog instanceof Exception) {
//				System.out.println("exDog instance of Exception");
//			}
			
		} catch (ClassCastException e) {
			System.out.println(e.getMessage()); //ClassCastException
			//e.printStackTrace();
		}
		
		System.out.println("----------------\n");
		try {
			ExceptionPuppy exPuppy = (ExceptionPuppy) new Exception();
		} catch (Exception e){
			System.err.println("Error"); //ClassCastException
			e.printStackTrace();
		}
		
		System.out.println("----------------\n");
		try {
			String str = null;
			System.out.println(str.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException Error");
			System.out.println(e.getMessage());
		}
	
		
		
//		2. Your program must have try catch blocks which throw exceptions of types:
//			a. ExceptionDog
//			b. ExceptionPuppy
//			c. NullPointerException
//			d. IOException
		
		/*
		4. For the output, one can use System.err.println(), getMessage() and
		printStackTrace() and other appropriate print statements to show that the
		exception subclasses have been successfully caught. You are required to
		select the right choice(s) of these method in each case to show that the
		exception subclasses have been successfully caught
		*/
		
		
	}
	
	
}

