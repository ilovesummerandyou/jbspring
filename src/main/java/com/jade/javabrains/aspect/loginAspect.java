package com.jade.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void stringArgMethods(String name, Object returnString){
		System.out.println("Methods that take string arg is called. The value is: " + name +"and the output value is : " + returnString.toString());
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void exceptionAdvice(String name, Exception ex){
		System.out.println("exceptionAdvice is called. The ex is: " + ex.toString());
	}
	
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(com.jade.javabrains.model.Circle)")
	public void allCircleMethods(){}
	
	//@Pointcut("args(com.jade.javabrains.model.Circle)")
}
