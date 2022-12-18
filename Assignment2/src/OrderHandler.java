import java.io.IOException;
/**
 * This class demonstrates the arrangement(order) of the catch blocks in your program is essential.
 * 
 * @see
 * @author Su Yeoun Lee
 */
public class OrderHandler {

	/**
	 * main method
	 * @param args arguments
	 */
	public static void main(String[] args) {
		/**
		 * Instantiate a new superclass exception type Exception.
		 * Instantiate a new subclass exception type IOException.
		 */
		Exception e = new Exception();
		IOException i = new IOException();

		/**
		 * Compilation error when trying to catch superclass Exception type before
		 * subclass IOException type.
		 */

		//		try {
		//			throw new Exception();
		//		}
		//		catch (Exception exception) {
		//			System.err.println("Catching " + exception);
		//		} 
		//		catch (IOException ioException) {
		//			System.err.println("Catching " + ioException);
		//		}finally {
		//			System.out.println("Compilation error");
		//		}


		/**
		 * Rewriting the code to show no compilation error
		 */
		try {
			throw new Exception();
		}
		catch (IOException ioException) {
			System.err.println(ioException + " IOException caught");
		} 
		catch (Exception exception) {
			System.err.println(exception + " Exception caught");
			e.printStackTrace();
		}
		

	}

}
