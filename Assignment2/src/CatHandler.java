
public class CatHandler {

	class ExceptionAlpha extends Exception {
		// catch block of type ExceptionAlpha.
	}


	//Add two exception subclasses named ExceptionBeta and ExceptionGammer
	class ExceptionBeta extends ExceptionAlpha {
		
	}

	class ExceptionGammer extends ExceptionBeta{
	}
	
	public static void main(String[] args) {
		
		CatHandler cat = new CatHandler();
		ExceptionBeta exBeta = cat.new ExceptionBeta();
	
		try {
		} catch (NullPointerException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
	
		}
		
		System.out.println("--------------------------------------------------------\n");
		ExceptionGammer exGamm = cat.new ExceptionGammer();

	
		 
		
		/*
		3. For the output, one can use System.err.println(), getMessage() and
		printStackTrace() and other appropriate print statements to show that the
		exception subclasses have been successfully caught. You are required to
		select the right choice(s) of these method in each case to show that the
		exception subclasses have been successfully caught.
		 */
		
	}

}
