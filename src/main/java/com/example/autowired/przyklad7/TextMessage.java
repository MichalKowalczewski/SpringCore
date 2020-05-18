package com.example.autowired.przyklad7;

import org.springframework.stereotype.Component;

@Component
public class TextMessage {

    public String getText(){
        return "Hello World";
    }
}
