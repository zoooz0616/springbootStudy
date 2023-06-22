package com.example.myapp.hr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config.xml");
		
		EmpController empController =context.getBean(EmpController.class);
		empController.printInfo();

		context.close();
	}

}
