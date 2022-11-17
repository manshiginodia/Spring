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
        System.out.println( "Spring DI of collections - lists and set" );
    
        ApplicationContext ioc = new ClassPathXmlApplicationContext("appconfig.xml");
    
        Customer cobj = ioc.getBean("custone",Customer.class);
        
        cobj.showGenInfo();
        cobj.showHobbies();
        cobj.showAddress();
        cobj.showPets();
        cobj.showCreditCard();
    }
}