package com.gupao.exception.handler;

import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gupao.exception.UserNotExistingException;

@ControllerAdvice
public class UserNotExistExceptionHandler {

	
	@ExceptionHandler(UserNotExistingException.class)
	public Map<String,Object> handlerUserNotExistingException(){
		System.out.println("______________________");
		return null;
	}
}
