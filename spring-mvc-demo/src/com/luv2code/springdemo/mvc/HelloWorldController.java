package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show the initial HTML Form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
				
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName = request.getParameter("studentName");
		
		String result = "Yo! " + theName.toUpperCase();
		
		model.addAttribute("message", result);		
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam ("studentName") String theName, Model model) {
		String result = "Version Three! " + theName.toUpperCase();
		
		model.addAttribute("message", result);		
		
		return "helloworld";
	}
}
