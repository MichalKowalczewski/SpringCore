package com.example.zadanie;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Napisz program wykorzystujący beany i eventy.
//Napisz klasę Calculator, która będzie inkrementować liczby od 0 do 100, w przypadku wystąpienia liczby parzystej opublikuje event EvenEvent
//natomiast po zakończeniu pętli opublikuje FinishedEvent
//Stwórz listener, który po wywołaniu eventu EvenEvent doda losową liczbę do listy, a po wywołaniu Eventu FinishedEvent - wyświetli tą listę w konsoli.

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("zadanie/Beans.xml");
        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.calculate();
    }
}
