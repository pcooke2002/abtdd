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
	public void testMultipyInteger() throws Exception {
		assertEquals(0, calculatorService.multiply(1, 0));
		assertEquals(1, calculatorService.multiply(1, 1));
		assertEquals(25, calculatorService.multiply(5, 5));
		assertEquals(1875, calculatorService.multiply(75, 25));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testMultiplyWithNegativeInteger() throws Exception {
		assertEquals(0, calculatorService.multiply(-1, 0));
		assertEquals(1, calculatorService.multiply(-1, -1));
		assertEquals(-1, calculatorService.multiply(1, -1));
		assertEquals(-50, calculatorService.multiply(5, -10));
		assertEquals(-1875, calculatorService.multiply(-75, 25));
	}

}