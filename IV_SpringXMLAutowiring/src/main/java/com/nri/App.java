package com.nri;

import org.springframework.context.ApplicationContext;
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
        System.out.println( "Spring auto wiring using XML config....byname, byType or byConstructor" );
    
        
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
        
        Customer custobj = ioc.getBean("custbean",Customer.class);
        
        System.out.println(custobj);
    
    
    }
    
    
}
