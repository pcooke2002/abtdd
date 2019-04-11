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