package learn.agile.demos.controllers;

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

	/**
	 * Calculator service.
	 */
	@Autowired
	CalculatorController calculatorController;

	/**
	 * ensure existing integer tests continue to work
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testIntegerMultiplyer() throws Exception {
		assert (new Float(0f).equals(new Float(calculatorController.multiplyer(1f, 0f))));
		assert (new Float(-2f).equals(new Float(calculatorController.multiplyer(-2f, 1f))));
		assert (new Float(-500f).equals(new Float(calculatorController.multiplyer(100f, -5f))));
		assert (new Float(2200f).equals(new Float(calculatorController.multiplyer(-100f, -22f))));
	}

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testDecimalMultiplyer() throws Exception {
		assert (new Float(0.77197933f).equals(new Float(calculatorController.multiplyer(2.323f, 0.33232f))));
		assert (new Float(-0.77197933f).equals(new Float(calculatorController.multiplyer(-2.323f, 0.33232f))));
		assert (new Float(-0.77197933f).equals(new Float(calculatorController.multiplyer(2.323f, -0.33232f))));
		assert (new Float(0.77197933f).equals(new Float(calculatorController.multiplyer(-2.323f, -0.33232f))));
	}
}