package org.example;

public class GenericMethod {
    // Generic Method
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
