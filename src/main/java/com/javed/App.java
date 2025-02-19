package com.javed;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dev = (Dev) context.getBean("dev");
        Dev dev1 = (Dev) context.getBean("dev1");
        System.out.println(dev.getAge());
        System.out.println(dev1.getAge());
//        obj.build();
    }
}
