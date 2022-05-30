package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // DI with Annotations
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student obj = (Student)context.getBean("student");
        obj.Learn();

        System.out.println(obj.getPh());
    }
}
