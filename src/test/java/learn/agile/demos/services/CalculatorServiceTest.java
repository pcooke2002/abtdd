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
	public void testDivideIntegerByIntResultWholeInt() throws Exception {
		assertEquals(1, calculatorService.divide(1, 1));
		assertEquals(5, calculatorService.divide(25, 5));
	}

}