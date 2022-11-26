import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void multiply() {
		
		Junit unit = new Junit();
		int result = unit.multiply(3,4);
		assertEquals(12,result);
		
	}

}
