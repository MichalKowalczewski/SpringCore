package com.example.zadanieSamodzielne;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookReader {

    List<Book> books;

    @PostConstruct
    public void postConstruct() throws IOException {
        File file = new File("C:\\Users\\Alberon\\Downloads\\demo\\demo\\src\\main\\java\\com\\example\\zadanieSamodzielne\\Books.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        books = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null){
        String[] split = line.split(";");
        books.add(new Book(split[0], split[1]));
        }
    }

    public void addPricesList(List<Double> prices){
        if (prices.size() != books.size()){
            System.out.println("lists are different size");
        }
        else {
            for(int i=0; i<prices.size(); i++){
                books.get(i).setPrice(prices.get(i));
            }
        }
    }

    @PreDestroy
    public void destroy() throws IOException {
        File fout = new File("new_books.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            bw.write(book.getAuthor()+";"+book.getTitle()+";"+book.getPrice());
            bw.newLine();
        }

        bw.close();
        books.forEach(book -> System.out.println(book.getPrice()));
        System.out.println("Bean will destroy now.");
    }


}
