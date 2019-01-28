package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class NameFormatter {

	public String format(String name) {
		return name.toUpperCase();
	}

}
