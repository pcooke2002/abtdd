package learn.agile.demos;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pcooke
 *
 */
@Configuration
@ComponentScan(basePackages = "person.pcooke.demos")
public class CucumberConfiguration {
}
