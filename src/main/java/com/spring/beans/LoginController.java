package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
		
	@Autowired
	LoginService ls;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String checkCredential(@RequestParam("uid") String userid,
			@RequestParam("pwd")  String pwd) {
		boolean result=ls.checkUser(userid, pwd);
		if(result == true )
			return "welcome";
		else
			return "login failed";
	}
}