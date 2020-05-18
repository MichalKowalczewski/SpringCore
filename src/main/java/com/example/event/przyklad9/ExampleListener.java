package com.example.event.przyklad9;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//Można to samo zrobić za pomocą interfejsu lub adnotacji.

/*@Component
public class ExampleListener implements ApplicationListener<ExampleEvent> {*/

@Component
public class ExampleListener {

    @EventListener
    public void onEvent(ExampleEvent exampleEvent) {
        System.out.println("Event has been triggered " + exampleEvent.getMessage());
    }
}
