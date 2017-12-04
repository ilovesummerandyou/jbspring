package com.jade.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.jade.javabrains.model.Circle;

@Aspect
public class loginAspect {
	
	@Before("allCircleMethods()")
	public void LoginAdvice(JoinPoint joinPoint){//the places(methods) in the code you can apply the advices
		System.out.println("LoginAdvice is called::" + joinPoint.getTarget() + " target is called");
		Circle c = (Circle) joinPoint.getTarget();
		System.out.println(c.getName());
	}
	
	@Before("args(name)")
	public void stringArgMethods(String name){
		System.out.println("Methods that take string arg is called. The value is: " + name);
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(com.jade.javabrains.model.Circle)")
	public void allCircleMethods(){}
	
	//@Pointcut("args(com.jade.javabrains.model.Circle)")
}
