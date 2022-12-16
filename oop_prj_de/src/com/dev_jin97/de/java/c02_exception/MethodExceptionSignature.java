package com.dev_jin97.de.java.c02_exception;

public class MethodExceptionSignature {
    static void methodThrowsException() throws Exception{

    }
    static void methodThrowsRuntimeException() throws RuntimeException{

    }

    public static void main(String[] args) {
        methodThrowsRuntimeException();

        try{
            methodThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
