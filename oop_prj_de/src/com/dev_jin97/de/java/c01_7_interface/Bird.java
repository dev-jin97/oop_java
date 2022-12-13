package com.dev_jin97.de.java.c01_7_interface;

public interface Bird {

    // 정적 변수
    String STATIC_VARIABLE = "STATIC";

    // Bird 특징 - 구현 x , 함수를 명세하지만 구현체를 담지 않음.
    void fly (int x, int y, int z);

    default void printBreed(){
        System.out.println("나는 새 중에 " + getBreed() + " 입니다.");
    }

    String getBreed();

    static void staticMethod(){
        System.out.println("This is staticMethod.");

    }
    abstract void abstractMethod();
}
