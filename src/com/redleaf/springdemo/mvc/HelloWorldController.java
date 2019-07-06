package com.redleaf.springdemo.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	@RequestMapping("/shoutLoud")
	public String yellOut(@RequestParam("studentName") String name, Model model) {
		System.out.println("name here: " + name);
		if (name != null && name.length() > 0) { 
			name = name.toUpperCase();
			model.addAttribute("message", "Yo " + name + "!");
		}
		else
			model.addAttribute("message", "Ooops!");
		return "process-form";
	}

}
