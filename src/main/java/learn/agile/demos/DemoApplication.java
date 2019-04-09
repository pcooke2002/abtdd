package learn.agile.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pcooke
 *
 */
@SpringBootApplication
@Controller
public class DemoApplication {

    /**
     * Main.
     * @param args arguments for main.
     */
    public static final void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * location where to redirect HttpRequest when not specified.
     * @return string index.
     */
    @RequestMapping("/")
    public final String index() {
        return "index";
    }
}
