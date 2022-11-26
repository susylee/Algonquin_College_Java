
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;

	//THIS TEST WOULD FAIL. 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
		//changeResult = 6.50 with error
		Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
	}

	// New test 1 created

	@Test
	public void testCalculateChange1() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 6.50;
		//changeResult = 6.50;
		Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
	}


	// New test 2 created
	@Test
	public void testCalculateChange2() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(8.10);
		aPurchase.receivePayment(10, 0, 1, 0, 0); //10.10
		double changeResult = aPurchase.CalculateChange();
		double expected = 2.00; //addition: 18.20
		Assert.assertNotEquals(expected, changeResult, EPSILON);
		assertTrue(true);
	}



}
