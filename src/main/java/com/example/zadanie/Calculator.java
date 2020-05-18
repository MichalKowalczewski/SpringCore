package com.example.zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void calculate(){
        for (int i = 0; i<100; i++){
            if (i%2==0){
                applicationEventPublisher.publishEvent(new EvenEvent(this));
            }
        }
        applicationEventPublisher.publishEvent(new FinishedEvent(this));
    }

}
