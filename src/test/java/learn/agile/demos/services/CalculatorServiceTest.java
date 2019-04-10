package learn.agile.demos.services;

import org.junit.Test;

/**
 * @author pcooke
 *
 */
public class CalculatorServiceTest {
	CalculatorService calculatorService = new CalculatorService();

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
	public void testMultiplyWithNegativeDecimal() throws Exception {
		assert (new Float(-0f).equals(new Float(calculatorService.multiply(-1.34534f, 0f))));
		assert (new Float(1.8063351f).equals(new Float(calculatorService.multiply(-1.345f, -1.343f))));
		assert (new Float(-28.53162f).equals(new Float(calculatorService.multiply(5.34f, -5.343f))));
		assert (new Float(28.376348f).equals(new Float(calculatorService.multiply(-5.434f, -5.222f))));
	}
}