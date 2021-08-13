package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class formController {
	
	@RequestMapping("/")
	public String showForm() {
		return "form" ;
	}
	
	@RequestMapping(path = "/showData", method = RequestMethod.POST)
	public String showData(@ModelAttribute formInputData inputData) {
		System.out.println("Form Data is : " + inputData) ;
		return "showData" ;
	}
}
