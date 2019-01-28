package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Controller {
	
	@Autowired
	private UserService userService;  // interface

	public void process() {
		System.out.println(userService.getData());
	}
	

}

@Component
@Primary
class UserServiceImpl2 implements UserService {
	@Override
	public String getData() {
		return "IMPL2";
	}
}

@Component
class UserServiceImpl implements UserService {

	@Override
	public String getData() {
		return "IMPL";
	}
	
}
