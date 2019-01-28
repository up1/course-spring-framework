package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hello2")
public class Hello {
	
	@Autowired
	NameFormatter formatter;

	public String sayHi(String name) {
        return "Hi, " + formatter.format(name);
    }

}
