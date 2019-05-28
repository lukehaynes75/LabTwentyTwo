package com.lab22.LabTwentyTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("Home");
	}
	@RequestMapping("regButton")
	public ModelAndView userRegistration() {
		return new ModelAndView("UserReg");
	}
	@PostMapping("userInfo")
	public ModelAndView userInfo(@RequestParam("userName") String userName, 
	@RequestParam("myPwd") String PassW, @RequestParam("first") String fName, 
	@RequestParam("last") String lName, @RequestParam("email") String email,
	@RequestParam("gender") String gender, @RequestParam("bdaymonth") String bdaymonth,
	@RequestParam("phone") String phone){
		UserProfile user = new UserProfile(userName,PassW,fName,lName,email,gender,bdaymonth, phone);
		return new ModelAndView("NewUserHello", "hello", fName);
	}
	
}
