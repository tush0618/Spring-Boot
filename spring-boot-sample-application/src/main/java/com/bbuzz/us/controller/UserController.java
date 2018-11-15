package com.bbuzz.us.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bbuzz.us.bean.User;
import com.bbuzz.us.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/addUser")
	public String addUser(@RequestBody User user) {
		boolean registrationStatus = userService.addUser(user);
		if (registrationStatus == true) {
			return "Success";
		} else {
			return "Failed";
		}
	}

}
