package learn.agile.demos.services;

import static org.junit.Assert.assertEquals;

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
	@Test
	public void testSubtract() throws Exception {
		assertEquals(1, calculatorService.subtract(1, 0));
		assertEquals(0, calculatorService.subtract(1, 1));
		assertEquals(0, calculatorService.subtract(5, 5));
		assertEquals(50, calculatorService.subtract(75, 25));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testSubtractWithNegativeNumbers() throws Exception {
		assertEquals(-1, calculatorService.subtract(-1, 0));
		assertEquals(0, calculatorService.subtract(-1, -1));
		assertEquals(2, calculatorService.subtract(1, -1));
		assertEquals(15, calculatorService.subtract(5, -10));
		assertEquals(-100, calculatorService.subtract(-75, 25));
	}
}