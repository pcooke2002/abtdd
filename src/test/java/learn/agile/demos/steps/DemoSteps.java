package learn.agile.demos.steps;

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

	@Autowired
	DemoPage demoPage;

	/**
	 * go to first page.
	 */
	@Given("^I am on the demo page$")
	public void i_am_on_the_demo_page() {
		demoPage.go();
	}

	/**
	 * add 2 numbers
	 * 
	 * @param x first operand.
	 * @param y second operand.
	 */
	@When("^I add the numbers (-?\\d+\\.?\\d*) and (-?\\d+\\.?\\d*)$")
	public void i_add_the_numbers_and(final float x, final float y) {
		demoPage.addNumbers(x, y);
	}

	/**
	 * @param sum
	 * @throws Throwable
	 */
	@SuppressWarnings("deprecation")
	@Then("^the result is (-?\\d+\\.?\\d*)$")
	public void the_result_is(final float sum) throws Throwable {
		assert (new Float(sum).equals(new Float(demoPage.getCalculatorResults())));
	}
}
