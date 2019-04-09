package learn.agile.demos.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import learn.agile.demos.DemoApplication;

/**
 * <p>
 * This tests the controller. It autowires the controller using Spring and verifies that it works
 * as expected. This is different than the service level unit test that are run directly against
 * the class without starting up Spring.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorControllerIT {

    @Autowired
    CalculatorController calculatorController;

    /**
     * @throws Exception
     */
	@SuppressWarnings("deprecation")
    @Test
	public void testAdder() throws Exception {
		assert (new Float(2f).equals(new Float(calculatorController.adder(1f, 1f))));
		assert (new Float(-1f).equals(new Float(calculatorController.adder(-2f, 1f))));
		assert (new Float(999f).equals(new Float(calculatorController.adder(1000f, -1f))));
    }
}