package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.service.PaymentService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        
        PaymentService payment = ioc.getBean("paybean", PaymentService.class);
        
        payment.makePayment(); //PointCut  --> appears after advice
        
    }
}

