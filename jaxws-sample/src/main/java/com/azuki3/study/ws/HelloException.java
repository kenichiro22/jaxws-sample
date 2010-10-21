package com.azuki3.study.ws;

public class HelloException extends Exception {
	private String code;

	private String name;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


}
