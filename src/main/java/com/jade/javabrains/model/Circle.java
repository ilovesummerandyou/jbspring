package com.jade.javabrains.model;

public class Circle {
	
	private String name;

	public String getName() {
	
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("setNameAndReturn is called");
		return name;
	}
	

}
