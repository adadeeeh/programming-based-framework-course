package com.spring.mvc.pedro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hobbit")
public class HobbitController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
	
		//create hobbit object
		Hobbit theHobbit = new Hobbit();
		
		//add student object to the model
		theModel.addAttribute("hobbit", theHobbit);
		
		return "show-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("hobbit") Hobbit theHobbit) {
		
		return "hobbit-confirmation";
	}
}
