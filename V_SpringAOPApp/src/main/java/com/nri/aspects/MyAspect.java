package com.nri.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	//Expression
	@Before("execution(* com.nri.service.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		
		//Advice --> the fun that needs to run first
		System.out.println("Auth done...Payment service can get started...");
	}
}
