package learn.agile.demos.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import learn.agile.demos.DemoApplication;

/**
 * 
 * <p>
 * This tests the controller. It autowires the controller using Spring and
 * verifies that it works as expected. This is different than the service level
 * unit test that are run directly against the class without starting up Spring.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerIT {

	@Autowired
	CalculatorController calculatorController;
	
	/**
     * @throws Exception
     */
    @Test
	public void testAdder() throws Exception {
        assertEquals(2, calculatorController.adder(1, 1));
        assertEquals(3, calculatorController.adder(2, 1));
        assertEquals(1000, calculatorController.adder(999, 1));
    }

	/**
	 * @throws Exception
	 */
	@Test
	public void testSubtracter() throws Exception {
		assertEquals(0, calculatorController.subtracter(1, 1));
		assertEquals(1, calculatorController.subtracter(2, 1));
		assertEquals(998, calculatorController.subtracter(999, 1));
		assertEquals(-1, calculatorController.subtracter(1, 2));
		assertEquals(-3, calculatorController.subtracter(-2, 1));
		assertEquals(29, calculatorController.subtracter(-2, -31));
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testMultiplyer() throws Exception {
		assertEquals(0, calculatorController.multiplyer(1, 0));
		assertEquals(2, calculatorController.multiplyer(2, 1));
		assertEquals(500, calculatorController.multiplyer(100, 5));
		assertEquals(-2200, calculatorController.multiplyer(100, -22));
	}
}