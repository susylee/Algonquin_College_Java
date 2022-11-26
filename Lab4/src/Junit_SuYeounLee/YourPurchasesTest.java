package Junit_SuYeounLee;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
/**
 * This class is created for jUnit test on method twoPurchases.
 * 
 * @see
 * @author Su Yeoun Lee
 */
public class YourPurchasesTest
{
	/**
	 * this variable acts as a delta value between the expected and actual values
	 * for jUnit test method
	 */
   private static final double EPSILON = 1E-12;
	/**
	 * the test method for testing twoPurchases(). Will use jUnit assertEquals()
	 * method with required parameters test the provided values
	 */

   @Test public void twoPurchases()
   {
      YourPurchases register = new YourPurchases();
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      double expected = 0.25;
      Assert.assertEquals(expected, register.giveChange(), EPSILON);
    }
   
   // YOUR TASKS ARE STATED HERE: 
   // RUN THE CODE YOU RECEIVED AND DEMO THAT THERE IS NO ERROR in YourPurchasesTest.java 
   
  
     
   }

