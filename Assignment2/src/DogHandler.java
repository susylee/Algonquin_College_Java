import java.io.IOException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * This class demonstrates the use of try catch blocks which throw exceptions of various types.
 * 
 * @see
 * @author Su Yeoun Lee
 */

public class DogHandler {
	/**
	 * Inner class ExceptionDog extends Exception class
	 */
	public static class ExceptionDog extends Exception {
	}
	/**
	 * Inner class ExceptionPuppy extends ExceptionDog class
	 */
	public static class ExceptionPuppy extends ExceptionDog {
	}

	/**
	 * main method
	 * @param args arguments
	 * @throws Exception 
	 */

	public static void main(String[] args)  {

		/**
		 * Try catch Block which throw exception of type ExceptionPuppy
		 */
		try {	
			throw new ExceptionPuppy();
		} 
		catch (ExceptionPuppy e) {
			System.err.println("getMessage():" + e.getMessage());
			System.err.println("ExceptionPuppy  caught.");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/**
		 * Try catch Block which throw exception of type IOException
		 */
		try {	
			throw new IOException();
		} 
		catch (IOException e) {
			System.err.println("IOException exception caught.");
			System.err.println("getMessage():" + e.getMessage());

		} catch (Exception e) {
			e.printStackTrace();
		} 
		/**
		 * Try catch Block which throw exception of type NullPointerException
		 */
		try {	
			throw new NullPointerException();
		} 
		catch (NullPointerException e) {
			System.err.println("NullPointerException caught.");
			System.err.println("printStackTrace():" );
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		/**
		 * Try catch Block which throw exception of type ExceptionDog
		 */	
		try {	
			throw new ExceptionDog();
		} 
		catch (ExceptionDog e) {
			System.err.println("ExceptionDog caught.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**
		 * Try catch Block which throw exception of type Exception
		 */	
		try {	
			throw new Exception();
		} catch (Exception ex) {
			System.err.println("Exception caught.");
			ex.printStackTrace(); 
			
		}
	}
}

		
