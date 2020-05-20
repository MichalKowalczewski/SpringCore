package com.example.zadanieSamodzielne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        List<Double> prices = new ArrayList<>();
        prices.add(16.0);
        prices.add(10.0);
        prices.add(22.0);
        prices.add(13.0);
        BookReader bookReader = (BookReader) context.getBean("bookReader");
        bookReader.addPricesList(prices);
        context.registerShutdownHook();
    }
}
