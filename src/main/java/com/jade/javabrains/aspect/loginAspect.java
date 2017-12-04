package com.jade.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.jade.javabrains.model.Circle;

//@Aspect
public class loginAspect {
	
	
//	@Around("allGetters()")
	public Object myAround(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		try {
			System.out.println("Before the myAround ");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After the myAround");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("After throwing");
			e.printStackTrace();
		}
		
		System.out.println("After finally");
		return returnValue; // the returnValue can be changed.
	}
	
//	@Pointcut("execution(public * get*(..))")
//	public void allGetters(){}
//	
	
	public void loggingAdvice() {
		System.out.println("Logging from advice");
	}
}
