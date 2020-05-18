package com.example.postprocess.przyklad6;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld{
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

    @PostConstruct
    public void postConstruct() throws Exception {
        System.out.println("Bean is going through init.");
    }
}
