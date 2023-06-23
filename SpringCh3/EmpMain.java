package com.example.myapp.jdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config.xml");
		IEmpService service=context.getBean(IEmpService.class);
		System.out.println("---------------------");
		System.out.println(service.getEmpCount());
		System.out.println("---------------------");
		System.out.println(service.getEmpCount(50));
		System.out.println("---------------------");
		System.out.println(service.getEmpInfo(103));
		context.close();
	}

}
