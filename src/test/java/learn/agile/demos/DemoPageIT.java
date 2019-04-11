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
	public void simpleDivideTest() throws Exception {
		demoPage.go();
		demoPage.divideNumbers(5, 5);
		Thread.sleep(100); // timing - for some reason on some OS's webdriver returns too quickly;
		assertEquals(1, demoPage.getCalculatorResults());
	}
}
