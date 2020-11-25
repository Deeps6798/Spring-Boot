package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	
	@RequestMapping("/")
	public String getBaseFile(Model m)
	{
		Student s = new Student();
		m.addAttribute("Student", s);
		return "enterStudentInfo.jsp";
	}
	
	@RequestMapping("abcd")
	public String readStudentData(@ModelAttribute Student s, Model m) 
	{
		m.addAttribute("Student", s);
		System.out.println(s.fname);
		System.out.println(s.lname);
		
		return "displayStudentInfo.jsp";
	}
}
