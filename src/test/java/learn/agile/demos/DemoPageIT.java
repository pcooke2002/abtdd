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
	public void simpleMultiplyTest() throws Exception {
		demoPage.go();
		demoPage.multiplyNumbers(5f, 5f);
		Thread.sleep(100); // web driver on some OSs respond too quickly
		assert (new Float(25f).equals(new Float(demoPage.getCalculatorResults())));
	}
}
