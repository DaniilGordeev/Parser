package com.example;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.stream.Stream;

import com.example.Data.Datum;
import com.example.Data.Issuer;
import com.example.Data.Root;
import com.example.Data.Status;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Parser {
    public Stream<Datum> runParser() throws IOException{
        File file = new File("demo/src/main/resources/data.json");
        ObjectMapper ob = new ObjectMapper();
        ob.findAndRegisterModules();
        Root root = ob.readValue(file, Root.class); 
        Stream<Datum> dStream = Stream.of(root.getData());
        return dStream;
    }
    void task1() throws IOException{
        // Первое задание
        // Вывести ФИО всех активных пользователей 
    
        System.out.println("1");
        runParser().filter(d -> d.getStatus() == Status.ACTIVE)
                .forEach(d -> System.out.println(d.getName().getFirst() + 
                                                " " +  
                                                d.getName().getLast()));
    }

    void task2() throws IOException{

        // Второе задание
        // Вывести всех пользователей, которые исппользуют только почту @gmail.com
        System.out.println("2");
        runParser().filter(s -> s.getEmails().toString().contains("@gmail.com"))
                .forEach(s -> System.out.println(s.getID()));
    }

    void task3() throws IOException{

        // Третье задание 
        // Вывести статистику какими картами и сколько человек пользуется 
        System.out.println("3");
        for(Issuer t : Issuer.values()) {
            Long amountLong = runParser().filter(s -> s.getCreditCard().getIssuer() == t).count();
            System.out.println(t + " - " + amountLong);
        }

    }

    void task4() throws IOException{
        System.out.println("4");
        // Четвертое задание
        // Вывести список в отсортированом (в алфавитном порядке) виде, название профессий 
        // за которые платят больше 500.00

        // Comparator<Datum> jComparator = Comparator.comparing(Data.Datum(Job::getTitle));
        BigDecimal decimal = new BigDecimal(500.00);

        runParser().filter(s -> s.getMonthlySalary().compareTo(decimal) == 1)
                    .sorted()
                    .forEach(s -> System.out.println(s.getJob().getTitle()));
    }

}
