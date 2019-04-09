package learn.agile.demos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * This represents a page in the application. Ideally we want to isolate all the details
 * about the page to this class. That way if we change an id or class name, there is just
 * a single place where we have to update it and our step files can remain unchanged.
 */

@Component
public class DemoPage {

    private WebDriver driver;

    private Environment env;

    /**
     * @param driver
     * @param env
     */
    @Autowired
    public DemoPage(final WebDriver driver, Environment env) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.env = env;
    }

    /**
     * 
     */
    public void go() {
        driver.get("http://localhost:" + env.getProperty("local.server.port") + "/");
    }

    /**
     * @param x
     * @param y
     */
    public void addNumbers(final int x, final int y) {
        driver.findElement(By.id("first-number")).sendKeys(Integer.toString(x));
        driver.findElement(By.id("second-number")).sendKeys(Integer.toString(y));
        driver.findElement(By.id("adder-button")).click();
    }

    /**
     * @return add results
     * @throws InterruptedException 
     */
    public int getCalculatorResults() throws InterruptedException {
        WebElement resultEl = (new WebDriverWait(driver, 300))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("calculator-result")));
		Thread.sleep(100);  // timing - for some reason on some OS's webdriver returns too quickly;
        return Integer.parseInt(resultEl.getText());
    }
}
