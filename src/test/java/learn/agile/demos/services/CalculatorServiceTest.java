package learn.agile.demos.services;

import org.junit.Test;

/**
 * @author pcooke
 *
 */
public class CalculatorServiceTest {
	CalculatorService calculatorService = new CalculatorService();

	/**
	 * existing integer oriented operations
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAdd() throws Exception {
		assert (new Float(1f).equals(new Float(calculatorService.add(1f, 0f))));
		assert (new Float(2f).equals(new Float(calculatorService.add(1f, 1f))));
		assert (new Float(10f).equals(new Float(calculatorService.add(5f, 5f))));
		assert (new Float(100f).equals(new Float(calculatorService.add(75f, 25f))));
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtractPostiveIntegers() throws Exception {
		assert (new Float(1f).equals(new Float(calculatorService.subtract(1f, 0f))));
		assert (new Float(0f).equals(new Float(calculatorService.subtract(1f, 1f))));
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testMultipyInteger() throws Exception {
		assert (new Float(0f).equals(new Float(calculatorService.multiply(1f, 0f))));
		assert (new Float(1f).equals(new Float(calculatorService.multiply(1f, 1f))));
		assert (new Float(25f).equals(new Float(calculatorService.multiply(5f, 5f))));
		assert (new Float(1875f).equals(new Float(calculatorService.multiply(25f, 75f))));
	}

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testDivideIntegerByIntResultWholeInt() throws Exception {
		assert (new Float(1f).equals(new Float(calculatorService.divide(1f, 1f))));
		assert (new Float(5f).equals(new Float(calculatorService.divide(25f, 5f))));
		assert (new Float(-5f).equals(new Float(calculatorService.divide(25f, -5f))));
		assert (new Float(-5f).equals(new Float(calculatorService.divide(-25f, 5f))));
		assert (new Float(5f).equals(new Float(calculatorService.divide(-25f, -5f))));
	}

	/**
	 * existing integer oriented operations
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testAddWithNegativeNumbers() throws Exception {
		assert (new Float(-1f).equals(new Float(calculatorService.add(-1f, 0f))));
		assert (new Float(-2f).equals(new Float(calculatorService.add(-1f, -1f))));
		assert (new Float(0f).equals(new Float(calculatorService.add(1f, -1f))));
		assert (new Float(-5f).equals(new Float(calculatorService.add(5f, -10f))));
		assert (new Float(-50f).equals(new Float(calculatorService.add(-75f, 25f))));
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test	
	public void testSubtractWithNegativeIntegers() throws Exception {
		assert (new Float(0f).equals(new Float(calculatorService.subtract(1f, 1f))));
		assert (new Float(0f).equals(new Float(calculatorService.subtract(-1f, -1f))));
		assert (new Float(2f).equals(new Float(calculatorService.subtract(1f, -1f))));
		assert (new Float(0f).equals(new Float(calculatorService.subtract(-1f, -1f))));
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test	
	public void testMultiplyWithNegativeInteger() throws Exception {
		assert (new Float(-0f).equals(new Float(calculatorService.multiply(-1f, 0f))));
		assert (new Float(1f).equals(new Float(calculatorService.multiply(-1f, -1f))));
		assert (new Float(-25f).equals(new Float(calculatorService.multiply(5f, -5f))));
		assert (new Float(25f).equals(new Float(calculatorService.multiply(-5f, -5f))));
	}

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtractPostiveDecimals() throws Exception {
		assert (new Float(0.987f).equals(new Float(calculatorService.subtract(1.232f, 0.245f))));
		assert (new Float(-0.30000007f).equals(new Float(calculatorService.subtract(1.3f, 1.6f))));
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testMultipyDecimal() throws Exception {
		assert (new Float(0f).equals(new Float(calculatorService.multiply(1.222f, 0f))));
		assert (new Float(1.233f).equals(new Float(calculatorService.multiply(1.233f, 1f))));
		assert (new Float(26.17115f).equals(new Float(calculatorService.multiply(5f, 5.23423f))));
		assert (new Float(26.810774f).equals(new Float(calculatorService.multiply(5.1222f, 5.23423f))));
	}

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testSubtractWithNegativeDecimals() throws Exception {
		assert (new Float(0.010900021f).equals(new Float(calculatorService.subtract(1.233f, 1.2221f))));
		assert (new Float(-0.33200002).equals(new Float(calculatorService.subtract(-1.654f, -1.322f))));
		assert (new Float(2.7982001f).equals(new Float(calculatorService.subtract(1.564f, -1.2342f))));
		assert (new Float(-0.10906601f).equals(new Float(calculatorService.subtract(-1.3433f, -1.234234f))));
	}
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test	public void testMultiplyWithNegativeDecimal() throws Exception {
		assert (new Float(-0f).equals(new Float(calculatorService.multiply(-1.34534f, 0f))));
		assert (new Float(1.8063351f).equals(new Float(calculatorService.multiply(-1.345f, -1.343f))));
		assert (new Float(-28.53162f).equals(new Float(calculatorService.multiply(5.34f, -5.343f))));
		assert (new Float(28.376348f).equals(new Float(calculatorService.multiply(-5.434f, -5.222f))));
	}
	
	/**
	 * @throws Exception
	 */
	public void testDivideFloatByIntResultWholeInt() throws Exception {
		assert (new Float(6.616f).equals(new Float(calculatorService.divide(13.232f, 2f))));
		assert (new Float(7.332f).equals(new Float(calculatorService.divide(36.66f, 5f))));

		assert (new Float(-5.086f).equals(new Float(calculatorService.divide(25.43f, -5f))));
		assert (new Float(-4.6790195f).equals(new Float(calculatorService.divide(25f, -5.343f))));

		assert (new Float(-5.0464f).equals(new Float(calculatorService.divide(-25.232f, 5f))));
		assert (new Float(-4.757374f).equals(new Float(calculatorService.divide(-25f, 5.255f))));

		assert (new Float(5.0688f).equals(new Float(calculatorService.divide(-25.344f, -5f))));
		assert (new Float(4.776279f).equals(new Float(calculatorService.divide(-25f, -5.2342f))));
	}
}