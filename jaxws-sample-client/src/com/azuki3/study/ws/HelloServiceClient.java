package com.azuki3.study.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

public class HelloServiceClient {

	public static void main(String[] args) {
		HelloService service;
		try {
			service = new HelloService(new URL("http://localhost:80/jaxws-sample/hello.ws?wsdl"), new QName("http://ws.study.azuki3.com/", "HelloService"));
			System.out.println(service.getHelloPort().sayHello3("world"));
		} catch (MalformedURLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (HelloException_Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
