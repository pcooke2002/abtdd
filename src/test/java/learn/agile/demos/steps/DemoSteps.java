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
	int count = 0;

	@Autowired
	DemoPage demoPage;

	/**
	 * @throws Throwable
	 */
	@Given("^I am on the demo page$")
	public void i_am_on_the_demo_page() throws Throwable {
		demoPage.go();
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

	@When("^I divide (-?\\d+\\.?\\d*) by (-?\\d+\\.?\\d*)$")
	public void iDivideTheNumbersBy(final float x, final float y) throws Throwable {
		demoPage.divideNumbers(x, y);
	}
}
