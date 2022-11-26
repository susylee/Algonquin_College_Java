import java.io.IOException;

public class OrderHandler {

	
	public static void main(String[] args) {

		// instantiate a new superclass exception type Exception
		new Exception() {
			
		};
		
		Exception ex = new Exception();
		
		class IOException extends Exception {
			
		};
		
		// instantiate a new subclass exception type IOException
		IOException ioe = new IOException(); 
		
		ex.printStackTrace();
		ioe.printStackTrace();
	}

}

/*
In this part of the assignment, you are required to show that the arrangement
(order) of the catch blocks in your program is essential.
1. In your program, create a class named OrderHandler.java
2. In main method, instantiate a new superclass exception type Exception
3. In main method, instantiate a new subclass exception type IOException
4. OrderHandler.java should show a compilation error when you try catching
the superclass exception type before the subclass exception type.
5. Rewrite your code in solution (4) above to show no compilation error
*/