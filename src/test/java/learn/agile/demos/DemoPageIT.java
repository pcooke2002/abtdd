package learn.agile.demos;

import static org.junit.Assert.assertEquals;

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
	@Test
	public void simpleMultiplyTest() throws Exception {
		demoPage.go();
		demoPage.multiplyNumbers(5, 5);
		Thread.sleep(100); // web driver on some OSs respond too quickly
		assertEquals(25, demoPage.getCalculatorResults());
	}
}
