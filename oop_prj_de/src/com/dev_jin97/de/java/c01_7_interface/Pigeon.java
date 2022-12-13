package com.dev_jin97.de.java.c01_7_interface;

public class Pigeon implements Bird, Pet {
    private int x, y, z;

    // Bird 의 구현부를 여기서 구현
    @Override
    public void fly(int x, int y, int z) {
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        this.z = z;

        printLocation();
    }

    @Override
    public String getBreed() {
        return "Pigeon";
    }

    @Override
    public void abstractMethod() {
        System.out.println("this is abstract method implemeted pigeon");
    }


    public void printLocation() {
        System.out.println("현재 위치 (" + x + ", " + y + ", " + z + ")");
    }

    @Override
    public String getHome() {
        System.out.println("집으로 돌아왔습니다.");
        return null;
    }
}
