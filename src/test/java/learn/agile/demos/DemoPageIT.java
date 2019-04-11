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
	public void simpleDivideTest() throws Exception {
		demoPage.go();
		demoPage.divideNumbers(15.2324f, 5.333f);
  	    Thread.sleep(100); // timing - for some reason on some OS's webdriver returns
		assert (new Float(2.8562534f).equals(new Float(demoPage.getCalculatorResults())));
	}
}
