package learn.agile.demos.steps;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import learn.agile.demos.CucumberConfiguration;
import learn.agile.demos.DemoApplication;
import learn.agile.demos.pages.DemoPage;

/**
 * @author pcooke
 *
 */
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = { CucumberConfiguration.class })
public class DemoSteps {
	int count = 0;

	@Autowired
	DemoPage demoPage;

	/**
	 * Go to index.html
	 */
	@Given("^I am on the demo page$")
	public void i_am_on_the_demo_page() {
		demoPage.go();
	}

	/**
	 * Get the result from the webpage
	 * @param result The expected value after the operation.
	 * @throws Throwable If assert fails.
	 */
	@Then("^the result is (-?\\d+)$")
	public void the_result_is(final int result) throws Throwable {
		assertEquals(demoPage.getCalculatorResults(), result);
	}

	/**
	 * fill out the web page
	 * @param x first operand.
	 * @param y second operand.
	 */
	@When("^I subtract (-?\\d+) from (-?\\d+)$")
	public void i_subtract(final int y, final int x) {
		demoPage.subtractNumbers(x, y);
	}
}
