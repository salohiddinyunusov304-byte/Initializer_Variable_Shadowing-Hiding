package org.example;

import static org.example.Static_Block.dbUrl;
import static org.example.Static_Block.timeout;

public class Main {
    public static void main(String[] args) {

        /// Non-static - har bir obyekt uchun bir xil qiymatni bervorish uchun
        Non_static_block nonStaticBlock = new Non_static_block("Salohiddin");
        System.out.println(nonStaticBlock.id);

        Non_static_block nonStaticBlock1 = new Non_static_block("Jasur");
        System.out.println(nonStaticBlock1.id);

        /// Static - (Main dan oldin ishga tushadi) dastur ilk bor yuklanganda faqat 1 martta ishga tushadi, 1 martta qiymat berish uchun
        System.out.println("Main metod boshlandi.");
        System.out.println("DB URL: " + dbUrl);
        System.out.println("Timeout: " + timeout);

        // Ikkinchi marta classga murojaat qilinsa ham static blok qayta ishlamaydi
        Static_Block config = new Static_Block();
    }
}