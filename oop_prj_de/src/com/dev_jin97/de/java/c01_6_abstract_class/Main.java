package com.dev_jin97.de.java.c01_6_abstract_class;

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();
        System.out.println("---비둘기---");
        pigeon.fly(1, 2, 120000);
        System.out.println("---공작새---");
        peacock.fly(1, 2, 100);

    }
}
