package learn.agile.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * This is the Spring configuration file that allows us to get the webdriver.
 */
@Configuration
public class TestConfig {

	private static final String LINUX_CHROME_DRIVER = "./src/test/resources/bin/linux-chromedriver";
	private static final String MAC_CHROME_DRIVER = "./src/test/resources/bin/mac-chromedriver";
	private static final String WINDOWS_CHROME_DRIVER = "./src/test/resources/bin/chromedriver.exe";
	private static final String EDGE_DRIVER = "./src/test/resources/bin/MicrosoftWebDriver.exe";
	private static final String IE_DRIVER = "./src/test/resources/bin/IEDriverServer.exe";
	private static final String LINUX_FIREFOX_DRIVER = "./src/test/resources/bin/linux-geckodriver";
	private static final String MAC_FIREFOX_DRIVER = "./src/test/resources/bin/mac-geckodriver";
	private static final String WINDOWS_FIREFOX_DRIVER = "./src/test/resources/bin/geckodriver.exe";

	/**
	 * @return a reference to chrome WebDriver or specific OS
	 */
	@Bean(destroyMethod = "quit")
	@Lazy
	@Scope("singleton")
	public WebDriver getWebDriver() {
		WebDriver webDriver = null;
		String browserName = System.getProperty("browser.name");
		if (browserName == null) {
			browserName = "chrome";
		}

		if ("chrome".equalsIgnoreCase(browserName)) {
			webDriver = createChromeWebDriver();
		}
		if ("firefox".equalsIgnoreCase(browserName)) {
			webDriver = createFirefoxWebDriver();
		}
		if ("edge".equalsIgnoreCase(browserName)) {
			webDriver = createEdgeWebDriver();
		}
		if ("ie".equalsIgnoreCase(browserName)) {
			webDriver = createIEWebDriver();
		}

		return webDriver;
	}

	private WebDriver createIEWebDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(IE_DRIVER, true);
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

		String driverPath = IE_DRIVER;
		System.setProperty("webdriver.ie.driver", driverPath);
		@SuppressWarnings("deprecation")
		WebDriver webDriver = new InternetExplorerDriver(capabilities);
		return webDriver;
	}

	private WebDriver createEdgeWebDriver() {
		String driverPath = EDGE_DRIVER;
		System.setProperty("webdriver.edge.driver", driverPath);
		WebDriver webDriver = new EdgeDriver();
		return webDriver;
	}

	private WebDriver createFirefoxWebDriver() {
		String driverPath = LINUX_FIREFOX_DRIVER;
		String osType = System.getProperty("os.name");
		if (osType.toLowerCase().contains("win")) {
			driverPath = WINDOWS_FIREFOX_DRIVER;
		}
		if (osType.toLowerCase().contains("mac")) {
			driverPath = MAC_FIREFOX_DRIVER;
		}

		FirefoxOptions options = new FirefoxOptions();
		String headlessMode = System.getProperty("headless");
		if ("true".equalsIgnoreCase(headlessMode)) {
			options.addArguments("--headless");
		}
		System.setProperty("webdriver.gecko.driver", driverPath);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(options);

		return driver;
	}

	private WebDriver createChromeWebDriver() {
		WebDriver webDriver;
		String driverPath = LINUX_CHROME_DRIVER;
		String osType = System.getProperty("os.name");
		if (osType.toLowerCase().contains("win")) {
			driverPath = WINDOWS_CHROME_DRIVER;
		}
		if (osType.toLowerCase().contains("mac")) {
			driverPath = MAC_CHROME_DRIVER;
		}

		ChromeOptions options = new ChromeOptions();
		String headlessMode = System.getProperty("headless");
		if ("true".equalsIgnoreCase(headlessMode)) {
			options.addArguments("--headless");
		}

		System.setProperty("webdriver.chrome.driver", driverPath);
		webDriver = new ChromeDriver(options);
		return webDriver;
	}

}
