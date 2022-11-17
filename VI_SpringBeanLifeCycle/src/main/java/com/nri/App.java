package com.nri;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nri.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        Customer cobj = (Customer) ioc.getBean("custbean");
        System.out.println(cobj.getMsg());
        ioc.registerShutdownHook();
    }
}
