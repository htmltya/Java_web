package com.hit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Appcontroller {
	@GetMapping("/student")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("okngonngon");
		
		List<Student> ListStudent= new ArrayList<Student>();
		ListStudent.add(new Student(43,"Corbin Edgington","cedgington0@tamu.edu","1596 Hoffman Terrace"));
		ListStudent.add(new Student(75, "Talbert Mulheron ","tmulheron1@fastcompany.com","119 Clove Circle"));
		ListStudent.add(new Student(49, "Pen Folkard", "pfolkard3@flavors.me","77 Stone Corner Point"));
		ListStudent.add(new Student(98, "Paulina Earp", "pearp4@weibo.com","632 Tennessee Parkway" ));
	
		mav.addObject("ListStudent",ListStudent);
		return mav;
	}
		
}
