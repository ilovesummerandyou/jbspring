package com.jade.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jade.javabrains.service.ShapeService;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		ShapeService s = ctx.getBean("shapeService", ShapeService.class);
		s.getCircle().setName("Dummy name");
		System.out.println(s.getCircle().getName());
	}

}
