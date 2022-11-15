package org.sistema.springmvc.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Controller class form default action.
 */
@Controller
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * Default constructor.
     */
    public HelloController() {
        logger.info("BEAN instantiated");
    }

    /**
     * Handles default / or /hello request.
     *
     * @param model - Map with a String key and an Object value
     * @return the name of the view to show RequestMapping({"/hello"})
     */
    @RequestMapping(value = "/hello")
    public String sayHelloPage(Map<String, Object> model) {
        logger.info("Say hello action /hello");
        model.put("greet", "Hello World, welcome to my app");

        // Se suele retornar el nombre de la vista (hello.jsp)
        return "hello";
    }
}
