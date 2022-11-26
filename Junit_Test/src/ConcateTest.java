import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		Junit junit = new Junit();
		String result = junit.concatenate("one", "two");
		assertEquals("onetwo", result);
	}

}
