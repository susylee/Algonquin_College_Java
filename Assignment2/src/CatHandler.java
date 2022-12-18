/**
 * This class demonstrates if the subclass exceptions will be caught in the catch block.
 * 
 * File name: CatHandler.java
 * Course: CST8284_313
 * Professor: Fedor Ilitchev
 * Assignment: Assignment02
 * Date: November 30, 2022 
 * 
 * @author Su Yeoun Lee
 * @version 11.0.16
 * @since 1.8.0_342
 * 
 */
public class CatHandler {
	  /**
     * Inner class ExceptionAlpha extends Exception
     */
	class ExceptionAlpha extends Exception {
	}
	  /**
     * Inner class ExceptionBeta extends ExceptionAlpha
     */
	 class ExceptionBeta extends ExceptionAlpha {
	}
	  /**
     * Inner class ExceptionGammer extends ExceptionBeta
     */
	 class ExceptionGammer extends ExceptionBeta{
	}
	
	/**
	 * the main method
	 * @param args arguments
	 */
	
	public static void main(String[] args) {
		/**
		 * Instance of CatHandler class
		 */
		CatHandler catHandler = new CatHandler();
		
		/**
		 * Try catch Block which throw catHandler.new ExceptionBeta().
		 */
		try {
			throw catHandler.new ExceptionBeta();
		} catch (ExceptionAlpha e) {
			System.err.println("Catching ExceptionBeta: ");
			e.printStackTrace();
		}
		
		/**
		 * Try catch Block which throw catHandler.new ExceptionGammer().
		 */
		try {
			throw catHandler.new ExceptionGammer();
		}catch (ExceptionAlpha e) {
			System.err.print("Catching ExceptionGammer: ");
			System.out.println("getMessage():" + e.getMessage());
			e.printStackTrace();
	
		}

	}

}
