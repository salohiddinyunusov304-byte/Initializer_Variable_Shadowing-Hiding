package org.example;

public class Non_static_block {
    private String name;
    int id;

    {
        System.out.println("Har bir obyekt uchun yangi id: ");
        id = 100;
    }

    public Non_static_block(String name) {
        this.name = name;
    }
}
