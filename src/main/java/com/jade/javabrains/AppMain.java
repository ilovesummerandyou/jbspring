package com.jade.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jade.javabrains.service.ShapeService;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService s = (ShapeService) ctx.getBean("shapeService");
		
	}

}
