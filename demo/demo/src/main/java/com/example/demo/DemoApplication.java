package com.example.demo;

import com.example.demo.case01.Hello;
import com.example.demo.case01.ITask;
import com.example.demo.case02.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(DemoApplication.class, args);

		// Hello
		Hello hello = (Hello)context.getBean("hello");
		System.out.println(hello.sayHi("somkiat"));

		// Task
		System.out.println(hello.sayHiWithTask(""));

		// Account
		Person p1 = (Person) context.getBean("p1");
		Person p2 = (Person) context.getBean("p1");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);

		context.close();
	}

	@Bean(name = "p1")
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Person p1() {
		return new Person();
	}

	@Bean(name = "p2")
	public Person p2() {
		return new Person();
	}

}

