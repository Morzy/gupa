package com.gupao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gupao.exception.UserNotExistingException;

@RestController
@PropertySource(value="classpath:application.yml")
@RequestMapping("/user")
public class UserController {

//	@Value("${my.age}")
//	int name;
	
	
	@Value("${zzp2.name}")
	private String name2;
	
	@RequestMapping
//	@ApiOperation(value = "教程", httpMethod = "POST", notes = "教程")
//	@ApiParam(required = true, name = "test", value = "教程入参")
	public String getUserTest(){
		System.out.println(name2);
		//throw new UserNotExistingException();
		return "success";
	}
}
