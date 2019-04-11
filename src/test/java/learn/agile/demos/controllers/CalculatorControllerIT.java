package learn.agile.demos.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import learn.agile.demos.DemoApplication;

/**
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
     * @throws Exception
     */
	@SuppressWarnings("deprecation")
    @Test
	public void testAdder() throws Exception {
		assert (new Float(2f).equals(new Float(calculatorController.adder(1f, 1f))));
		assert (new Float(-1f).equals(new Float(calculatorController.adder(-2f, 1f))));
		assert (new Float(999f).equals(new Float(calculatorController.adder(1000f, -1f))));
    }

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
	public void testSubtracter() throws Exception {
		assert (new Float(0f).equals(new Float(calculatorController.subtracter(1f, 1f))));
		assert (new Float(1f).equals(new Float(calculatorController.subtracter(2f, 1f))));
		assert (new Float(998f).equals(new Float(calculatorController.subtracter(999f, 1f))));
		assert (new Float(-1.2099999f).equals(new Float(calculatorController.subtracter(1.123f, 2.333f))));
		assert (new Float(-3.5640001f).equals(new Float(calculatorController.subtracter(-2.342f, 1.222f))));
		assert (new Float(28.768f).equals(new Float(calculatorController.subtracter(-2.232f, -31f))));
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
	
	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testDivider() throws Exception {
		assert (new Float(2f).equals(new Float(calculatorController.divider(2f, 1f))));
        assert (new Float(20f).equals(new Float(calculatorController.divider(100f, 5f))));
	}
	
	 /**
     * @throws Exception
     */
    @SuppressWarnings("deprecation")
	@Test
    public void testDividerRealNumbers() throws Exception {
        assert (new Float(2f).equals(new Float(calculatorController.divider(2f, 1f))));
        assert (new Float(4.2468f).equals(new Float(calculatorController.divider(21.234f, 5f))));
        assert (new Float(-4.2468f).equals(new Float(calculatorController.divider(-21.234f, 5f))));
        assert (new Float(-4.2468f).equals(new Float(calculatorController.divider(21.234f, -5f))));
        assert (new Float(4.2468f).equals(new Float(calculatorController.divider(-21.234f, -5f))));

        assert (new Float(4.0137615f).equals(new Float(calculatorController.divider(21f, 5.232f))));
        assert (new Float(-4.012995f).equals(new Float(calculatorController.divider(-21f, 5.233f))));
        assert (new Float(-3.9444027f).equals(new Float(calculatorController.divider(21f, -5.324f))));
        assert (new Float(3.857883f).equals(new Float(calculatorController.divider(-21f, -5.4434f))));
        
        assert (new Float(4.09633f).equals(new Float(calculatorController.divider(21.432f, 5.232f))));
        assert (new Float(-4.05752f).equals(new Float(calculatorController.divider(-21.233f, 5.233f))));
        assert (new Float(-4.0050716f).equals(new Float(calculatorController.divider(21.323f, -5.324f))));
        assert (new Float(3.9778447f).equals(new Float(calculatorController.divider(-21.653f, -5.4434f))));
    }
}