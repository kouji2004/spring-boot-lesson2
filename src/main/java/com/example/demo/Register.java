package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {
	public class Register{
		@RequestMapping("/")
		public String start() {
			return "lesson";
		}
		
		@RequestMapping("/register")
		public ModelAndView register
			(@ModelAttribute RegisterBean rb, ModelAndview m) {
			m.addObject("rb",rb);
			m.setViewName("register.thml");
			retun m;
		}
	}
}
