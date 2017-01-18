package com.yys.user;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



 @RestController
@EnableAutoConfiguration
public class Usercontroller {

	@RequestMapping(value="/user/{name}",method=RequestMethod.GET)
	@ResponseBody
	User getUser(@PathVariable String name) {
		
		return new User(name);
	}

	@Override
	public String toString() {
		return "Usercontroller [getUser()=" + getUser(null) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Usercontroller.class, args);
	}
}