package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ExampleEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleEndpoint.class);

    @RequestMapping("/starter/hello")
    public String example() {
        LOGGER.info("example sayHello ");
        return "Hello World again - 2005";

    }
}