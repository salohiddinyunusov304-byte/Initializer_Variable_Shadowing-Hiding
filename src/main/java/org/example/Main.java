package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        /// Variable shadowing - mwtodni ichidagi ozgaruvchi bn metodni tashqarisidagi
        /// class ichida ozgaruvchi bir xil nom qiymat har xil:
        /// Ichki ozgaruvchi tashqini soyalaydi (yopadi).

        Employee emp = new Employee();
        emp.printName("Local ozgaruvchi: Jasur");

        /// Variable hiding - sub va superda bir xil variable, sub supperni yashirib qoyadi.
        Parent parent = new Child();

        // Diqqat! Polymorphism o'zgaruvchilar uchun ishlamaydi!
        // Havola turi Parent boYo'l olgani uchun Parent'dagi o'zgaruvchi chiqadi.
        System.out.println(parent.role);

        /// UUID
        System.out.println(UUID.randomUUID());

        /// Error - dastur daraajasidagi, kop holatda tuzatib bolmaydigan xatolik. Masalan, OutOfMemoryError, StackOverflowError
        // try-catch tavsiya etilmaydi

        /// Exception - dastur kodi ichida sodir boladi.
        // try-catch orqali ushlash zarur, 2 ta turi bor.

        /// Checked Exception - try catch orqali ushlnadigan exception turi
//        try {
//            // Mavjud bolmagan fileni ochish
//            FileInputStream fileInputStream = new FileInputStream("files/text.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        /// Unchecked Exception - Tekshirilmaydigan.
        // ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xatolik ushlandi !");
        }
        // NullPointerException
//        String s = null;
//        System.out.println(s.length());

        // ArifmeticException
        int a = 10;
//        System.out.println(a / 0);

        try {
            a /= 0;
        } catch (ArithmeticException e) {
            System.out.println("0 ga bolish mumkin emas !");
        }

    }
}