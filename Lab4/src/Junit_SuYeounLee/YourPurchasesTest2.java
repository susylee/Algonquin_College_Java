package Junit_SuYeounLee;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/**
 * This class is created for jUnit test on method testCalculateChange. Created
 * more test methods sequentially to find the error in jUnit test of first
 * method
 * 
 * @see
 * @author Su Yeoun Lee
 */
public class YourPurchasesTest2 {
	/**
	 * this variable acts as a delta value between the expected and actual values
	 * for jUnit test method
	 */
	private static final double EPSILON = 1E-12;

	//THIS TEST WOULD FAIL. 
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
		Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
	}


	// Test 1 created
	@Test
	public void testRecordPurchase() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.50);
		double expected = 1.50;
	   Assert.assertEquals(expected, aPurchase.getPurchase() , EPSILON);
		assertTrue(true);
	}
	
	// Test 2 created 
	@Test
	public void testReceivePayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(5, 0, 0, 0, 0); //3.5
		double expected = 5.0;
	   Assert.assertEquals(expected, aPurchase.getPayment() , EPSILON);
		assertTrue(true);
	}
	
	// Test 3 created, failure found on this method.
	@Test
	public void testCalculateChange2() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0); //5.0
		double changeResult = aPurchase.CalculateChange();
		double expected = 6.5;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}	

}
