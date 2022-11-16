package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Customer;
import model.Order;

public class ISpringCoreApplication {

	public static void main(String[] args) {

		ApplicationContext iocContainer = new ClassPathXmlApplicationContext("appconfig.xml");

		Order ordobjone = (Order) iocContainer.getBean("oone");
		System.out.println(ordobjone);

		Order ordobjtwo = (Order) iocContainer.getBean("otwo");
		System.out.println(ordobjtwo);
		
		Order ordobjthree = (Order) iocContainer.getBean("othree");
		System.out.println(ordobjthree);
		
		Customer custobjone = (Customer) iocContainer.getBean("cone");
		System.out.println(custobjone);
		
		Customer custobjtwo = (Customer) iocContainer.getBean("ctwo");
		System.out.println(custobjtwo);
		
		Customer custobjthree = (Customer) iocContainer.getBean("cthree");
		System.out.println(custobjthree);
	}

}
