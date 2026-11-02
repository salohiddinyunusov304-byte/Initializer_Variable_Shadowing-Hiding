package org.example;

public class Static_Block {
    static String dbUrl;
    static int timeout;

    static {
        System.out.println("statik blok ishga tushdi, sinf xotiraga yuklandi !");
        dbUrl = "jdbc:postgresql://localhost:5432/bank_db";
        timeout = 30; // Soniyada
    }
}
