package learn.agile.demos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import learn.agile.demos.pages.DemoPage;

/**
 * @author pcooke
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoPageIT {

	@Autowired
	DemoPage demoPage;

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void simpleSubtractIntegerTest() throws Exception {
		demoPage.go();
		demoPage.subtractNumbers(5f, 5f);
		Thread.sleep(100); // timing - for some reason on some OS's webdriver returns too quickly;
		assert (new Float(0f).equals(new Float(demoPage.getCalculatorResults())));
	}

	/**
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void simpleSubtractDecimalTest() throws Exception {
		demoPage.go();
		demoPage.subtractNumbers(5.123f, 5.456f);
		Thread.sleep(100); // timing - for some reason on some OS's webdriver returns too quickly;
		assert (new Float(-0.3329997f).equals(new Float(demoPage.getCalculatorResults())));
	}
}