package org.example;

public class Child extends Parent {
    String role = "Child";

    public void displayInfo() {
        System.out.println(role);
        System.out.println(super.role);
    }
}
