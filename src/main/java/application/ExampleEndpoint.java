package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleEndpoint.class);

    @RequestMapping("/starter/hello")
    public String example() {
        LOGGER.trace("example sayHello ");
        return "Hello World again";

    }
}