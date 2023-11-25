package com.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        parser.runParser();
        // parser.task1();
        // parser.task2(); //не работает (Не выводит)
        // parser.task3();
        parser.task4(); 
    }
}