package com.dev_jin97.de.java.c01_6_abstract_class;

public abstract class Bird {
    private int x, y, z;

    void fly(int x, int y, int z){
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;

        if (flyable(z)){
            this.z = z;
        } else{
            System.out.println("그 높이로는 날 수 없습니다.");
        }
        printLocation();
    }


    public void printLocation(){
        System.out.println("현재 위치 ( " + x + ", " + y+", "+z+" )");
    }

    abstract Boolean flyable(int z);
}
