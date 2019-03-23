package com.spring.mvc.pedro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreatureClass {

	@RequestMapping("/creature")
	public String showForm() {
		return "add-creature";
	}
	
	@RequestMapping("/processCreature")
	public String processCreature() {
		return "show-creature";
	}
}
