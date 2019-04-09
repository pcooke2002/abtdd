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
	public void testAddWithNegativeNumbers() throws Exception {
		assert (new Float(-1f).equals(new Float(calculatorService.add(-1f, 0f))));
		assert (new Float(-2f).equals(new Float(calculatorService.add(-1f, -1f))));
		assert (new Float(0f).equals(new Float(calculatorService.add(1f, -1f))));
		assert (new Float(-5f).equals(new Float(calculatorService.add(5f, -10f))));
		assert (new Float(-50f).equals(new Float(calculatorService.add(-75f, 25f))));
	}
}