package com.dev_jin97.de.java.c02_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchStatement {
    // 에외처리
    public static void main(String[] args) {
        int number = 10;
        for (int i = 10; i >= 0 ; i--) {
            try{
                int result =  number / i;
                System.out.println(result);
            } catch (Exception e){
                System.out.println("Exception occurred " + e.getMessage());
            } finally {
                System.out.println("Always executed");
            }
        }
    }
}
