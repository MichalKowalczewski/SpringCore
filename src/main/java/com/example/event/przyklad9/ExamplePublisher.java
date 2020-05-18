package com.example.event.przyklad9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ExamplePublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(final String message) {
        System.out.println("Publishing custom event. ");
        ExampleEvent customSpringEvent = new ExampleEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }
}
