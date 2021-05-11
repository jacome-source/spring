package com.jacome.spring.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	// Sintaxe do PointCut indicando o método que irá receber advice
	@Before("execution(* com.jacome.spring.springaop.services.ProductServiceImpl.multiply(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before calling the method");
	}

	// Sintaxe do PointCut indicando o método que irá receber advice
	@After("execution(* com.jacome.spring.springaop.services.ProductServiceImpl.multiply(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("After the method execution");
	}
}