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
	public void testAdd() throws Exception {
		assertEquals(1, calculatorService.add(1, 0));
		assertEquals(2, calculatorService.add(1, 1));
		assertEquals(10, calculatorService.add(5, 5));
		assertEquals(100, calculatorService.add(75, 25));
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testAddWithNegativeNumbers() throws Exception {
		assertEquals(-1, calculatorService.add(-1, 0));
		assertEquals(-2, calculatorService.add(-1, -1));
		assertEquals(0, calculatorService.add(1, -1));
		assertEquals(-5, calculatorService.add(5, -10));
		assertEquals(-50, calculatorService.add(-75, 25));

	}
}