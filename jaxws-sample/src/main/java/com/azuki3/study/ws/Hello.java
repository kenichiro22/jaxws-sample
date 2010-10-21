package com.azuki3.study.ws;

import javax.jws.WebService;

@WebService
public class Hello {
	public String sayHello(String name){
		System.out.println(name.toString());
		return "Hello " + name + "!";
	}

	public String sayHello2(String name) throws Exception{
		return "Hello " + name + "!";
	}

	public String sayHello3(String name) throws HelloException{
		HelloException e = new HelloException();
		e.setCode("1");
		e.setName(name);
		throw e;
//		return "Hello " + name + "!";
	}

}