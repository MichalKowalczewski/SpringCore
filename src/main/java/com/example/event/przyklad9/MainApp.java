package com.example.event.przyklad9;

import com.example.bean.przyklad3.AppConfig;
import com.example.bean.przyklad3.HelloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Konfiguracja poprzez adnotacje
public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("przyklad9/Beans.xml");

        ExamplePublisher publisher =
                (ExamplePublisher) context.getBean("examplePublisher");

        publisher.publish("test");
    }
}
