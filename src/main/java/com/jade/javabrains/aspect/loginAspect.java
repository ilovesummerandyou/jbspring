package com.jade.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class loginAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void LoginAdvice(){
		System.out.println("LoginAdvice is called");
	}
	
	@Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("SecondAdvice is called");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(com.jade.javabrains.model.Circle)")
	public void allCircleMethods(){}
	
	//@Pointcut("args(com.jade.javabrains.model.Circle)")
}
