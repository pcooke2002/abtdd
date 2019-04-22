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
	 * @throws Exception if assert fails.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void simpleBasicTest() throws Exception {
		demoPage.go();
		demoPage.addNumbers(5f, 5f);
		Thread.sleep(100); // timing - for some reason on some OS's webdriver returns too quickly;
		assert (new Float(10).equals(new Float(demoPage.getCalculatorResults())));
	}
	
	/**
	 * @throws Exception if assert fails.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void simpleDecimalTest() throws Exception {
		demoPage.go();
		demoPage.addNumbers(5.24f, 5.36f);
		Thread.sleep(100);  // timing - for some reason on some OS's webdriver returns too quickly
		assert (new Float(10.6f).equals(new Float(demoPage.getCalculatorResults())));
	}
}
