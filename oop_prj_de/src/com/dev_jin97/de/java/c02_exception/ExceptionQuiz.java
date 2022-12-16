package com.dev_jin97.de.java.c02_exception;

public class ExceptionQuiz {
    int [] arr = {0, 1, 2, 3, 4};


    public int divide(int denominatorIndex, int numeratorIndex){
        return  arr[denominatorIndex] / arr[numeratorIndex];
    }

}

class Main{
    public static void main(String[] args) {
        ExceptionQuiz calc = new ExceptionQuiz();

        System.out.println("2 / 1 = "+ calc.divide(2, 1));
        System.out.println("1 / 0 = "+ calc.divide(1, 0));
        System.out.println("Try to divide using out of index element = "+ calc.divide(5, 0));
    }
}
