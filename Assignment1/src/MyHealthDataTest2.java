import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
/**
 * This class is created for jUnit test on method getBMI
 *
 * @see
 * @author Su Yeoun Lee
 */
public class MyHealthDataTest2 {
	/**
	 * this variable acts as a delta value between the expected and actual values
	 * for jUnit test method
	 */
	private static final double EPSILON = 1E-12; //0.000000000001

	/**
	 * the test method for testing getBMI(). Will use jUnit assertEquals()
	 * method with required parameters test the provided values
	 */
	@Test
	public void testGetBMI0() {
		MyHealthData pData = new MyHealthData();
		pData.setHeight(65);
		pData.setWeight(150);
		double result = pData.getBMI();
		double expected = 24.958579881656803;
		Assert.assertEquals(expected, result, EPSILON);
	}

	//testGetBMI1 created
	@Test
	public void testGetBMI1() {
		MyHealthData pData = new MyHealthData();
		pData.setHeight(70);
		pData.setWeight(180);
		double result = pData.getBMI();
		double expected = 25.824489795918367;
		Assert.assertEquals(expected, result, EPSILON);
	}

}
