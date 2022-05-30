package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // DI with XML
        ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionProject.xml");
        Student obj = (Student)context.getBean("Student");
        obj.Learn();

    }
}
