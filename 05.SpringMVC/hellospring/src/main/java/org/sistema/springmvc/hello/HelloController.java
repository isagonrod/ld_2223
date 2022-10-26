package org.sistema.springmvc.hello;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller class form default action
 * 
 * @author Eugenia Pérez Martínez
 */
@Controller
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	/**
	 * default constructor
	 */
	public HelloController() {
		logger.info("BEAN instantiated");
	}

	/**
	 * handles default / or /hello request
	 * 
	 * @param model
	 * @return the name of the view to show RequestMapping({"/hello"})
	 */

	//Se podría haber especificado: @RequestMapping(value = { "/", "/hello" })
	
	@RequestMapping(value = "/hello")
	public String sayHelloPage(Map<String, Object> model) {
		logger.info("say hello action /hello");
		
		model.put("greet", "Hello World, welcome to my app");
		
		//Se suele retornar el nombre de la vista (hello.jsp)
		return "hello";
	}
}