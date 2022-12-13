package com.dev_jin97.de.java.c01_7_interface;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1, 2, 3);
        bird.printBreed();
        bird.abstractMethod();
        Bird.staticMethod();
        System.out.println(Bird.STATIC_VARIABLE);
    }
}
