package com.example.zadanieSamodzielne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.zadanieSamodzielne")
public class AppConfig {


    @Bean
    public BookReader bookReader(){
        return new BookReader();
    }


}
