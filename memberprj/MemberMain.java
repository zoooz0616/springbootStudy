package com.sample.myapp.member;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config-member.xml");
		MemberController memberController = context.getBean(MemberController.class);
		memberController.PrintInfo();
		context.close();
	}

}
