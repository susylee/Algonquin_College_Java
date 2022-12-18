/**
 * This class demonstrates throws and rethrows of an exception.
 * 
 * @see
 * @author Su Yeoun Lee
 */

public class FishHandler {

	/**
	 * easterEnding() that which should initially throw an Exception.
	 */
	public static void easterEnding() throws Exception{
		System.err.println("ending");
		throw new Exception();
	}

	/**
	 * easterStarting() that calls easterEnding, and catches the Exception and rethrows it.
	 */
	public static void easterStarting() throws Exception {
		try{
			System.err.println("recall ending");
			easterEnding();
		}
		catch(Exception e){
			System.err.println("rethrow exception");
			throw e;
		}
	}

	/**
	 * the main method
	 * @param args arguments
	 */
	public static void main(String[] args) throws Exception{
		/**
		 * try catch block to throw new Exception.
		 */
		try {
			easterStarting();
		} catch (Exception e) {
			System.err.println("Excpetion caught.");
			e.getStackTrace();
		}

	}

}
