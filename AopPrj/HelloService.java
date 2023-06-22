package com.example.myapp.aop;

public class HelloService implements IHelloService{

	@Override
	public String sayHello(String name) {
//		System.out.println(">>>LOG: "+new java.util.Date());
//		HelloLog.log(); //공통코드. 횡당관점, <--AOP는 이것도 없애자.
		return "Hello~" + name;
	}

	@Override
	public String sayGoodbye(String name) {
		return "Bye~" + name;
	}
	
}
