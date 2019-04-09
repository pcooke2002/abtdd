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
	public void testSubtractPostiveIntegers() throws Exception {
		assert (new Float(1f).equals(new Float(calculatorService.subtract(1f, 0f))));
		assert (new Float(0f).equals(new Float(calculatorService.subtract(1f, 1f))));
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
	public void testSubtractPostiveDecimals() throws Exception {
		assert (new Float(0.987f).equals(new Float(calculatorService.subtract(1.232f, 0.245f))));
		assert (new Float(-0.30000007f).equals(new Float(calculatorService.subtract(1.3f, 1.6f))));
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
}