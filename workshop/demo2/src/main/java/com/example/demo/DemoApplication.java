package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.config.JdbcConfiguration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context
				= SpringApplication.run(DemoApplication.class, args);

		for (String name: context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}


