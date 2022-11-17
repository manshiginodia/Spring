package com.nri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Customer;

 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        
        Customer custobj = ioc.getBean("custbean",Customer.class);
        
        custobj.showGenInfo();
        custobj.showToppingDetails();
        custobj.showOrderPriceDetails();
    }
}
