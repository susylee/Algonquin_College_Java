
public class FishHandler {

	// easterEnding(), which should initially throw an Exception.
	public void easterEnding() throws Exception{
		
	}
	
	//easterStarting(), which calls easterEnding, and catches the Exception and rethrows it.
	public void easterStarting() {
		
		try {
			easterEnding();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Throwable t) {
			throw t;
		}
	}
	
	
	public static void main(String[] args) {

		//From your main method, initiate a call to easterStarting, and catch the rethrown exception
		
		FishHandler fish = new FishHandler();
		fish.easterStarting();
		
		
		
		
		/* 
		2. For the output, one can use System.err.println(), getMessage() and
		printStackTrace() and other appropriate print statements to show that the
		exception subclasses have been successfully caught. You are required to
		select the right choice(s) of these method in each case to show that the
		exception subclasses have been successfully caught. 
		*/
		
	}

}
