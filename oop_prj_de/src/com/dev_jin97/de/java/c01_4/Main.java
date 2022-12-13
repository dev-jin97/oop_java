package com.dev_jin97.de.java.c01_4;

public class Main {
    // Parent Class
    static class Animal {
        String name;

        public void cry(){
            System.out.println(name + " asd crying.");
        }

    }

    // 👨🏻‍💻Child Class
    static class Dog  extends Animal{
        Dog(String name){
            this.name = name;
        }


        @Override
        public void cry() {
            super.cry();
        }

        public void swim(){
            System.out.println(name + " is swimming.");
        }
    }
    static class Cat  extends Animal{
        Cat(String name){
            this.name = name;
        }

        public void mew() {
            System.out.println(name + " is meeew~");
        }


    }

    public static void main(String[] args) {
        Dog dog = new Dog("강아지");
        dog.cry();
        dog.swim();

    }
}
