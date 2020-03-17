package com.mvc;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	import com.mvc.User;

	@Controller
	public class UserController {

		@RequestMapping(value = "/login")
		public ModelAndView loginPage() {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("login");
			modelAndView.addObject("user", new User());
			return modelAndView;
		}
		
		@RequestMapping(value = "/authenticate")
		public ModelAndView authenticateUser(@ModelAttribute User user) {

			if (user.getUname().equals("sunil") && user.getPwd().equals("patil")) {
				
				return new ModelAndView("sucess", "msg", "Login Success");
			} else {
				return new ModelAndView("failure", "msg", "Login Failed");
			}
		}

	}




