package com.jade.javabrains.service;

import com.jade.javabrains.aspect.loginAspect;
import com.jade.javabrains.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new loginAspect().loggingAdvice();
		return super.getCircle();
	}
}
