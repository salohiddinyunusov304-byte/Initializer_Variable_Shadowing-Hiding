package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Salohiddin");
        list.add(100);

        String s = (String) list.get(0); // Majburiy Casting

        List<String> list1 = new ArrayList<>();
        list1.add("Salohiddin"); // Casting kerak emas

        /// Generic Class
        // String uchun ishlatish
        Box<String> boxStr = new Box<>();
        boxStr.setItem("Java");
        System.out.println(boxStr.getItem());

        // Integer uchun
        Box<Integer> boxInt = new Box<>();
        boxInt.setItem(100);
        System.out.println(boxInt.getItem());

        /// Generic Method
        String[] names = {"Ali", "Vali", "Dali"};
        Integer[] numbers = {1, 2, 3};

        GenericMethod.printArray(names);
        GenericMethod.printArray(numbers);
    }
}
