package com.example.autowired.przyklad7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld{
    private String message;

    @Autowired
    private TextMessage textMessage;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + textMessage.getText());
    }

}
