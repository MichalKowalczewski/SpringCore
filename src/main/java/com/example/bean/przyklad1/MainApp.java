package com.example.bean.przyklad1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Konfiguracja poprzez XML
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("przyklad1/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("myBean");
        obj.getMessage();
    }
}
