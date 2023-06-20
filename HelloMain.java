package com.example.myapp.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		//xml 파일 읽고 토대로 bean파일 만듦.
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config.xml");
		System.out.println("------------------");
		HelloController controller = context.getBean(HelloController.class);
		controller.hello("Jinkyoung");
		System.out.println("------------------");
		context.close();
	}

}
