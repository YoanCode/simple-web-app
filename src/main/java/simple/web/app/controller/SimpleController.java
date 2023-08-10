package simple.web.app.controller;

import org.springframework.stereotype.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
	

	private static final Logger logger = LogManager.getLogger(SimpleController.class);
	
	@RequestMapping("/MyFirstPage")
	public String greeting(@RequestParam(value = "title", required = false, defaultValue = "xiao") String title,
			Model model) {
		model.addAttribute("name", title);
		logger.info("Yeah my log!!!!!");
		
		logger.info("Yeah my log!!!!!\n\ntestest");
		return "index";
	}
}
