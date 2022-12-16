package com.dev_jin97.de.java.c04_collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack (Last In First Out)
        Stack<Integer> stack = new Stack<>(); // List 중에 하나

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        // 순서대로 쌓임
        System.out.println(stack);

        System.out.println("last element  = " + stack.peek()); // peek 은 꺼내지 않고 보기만 하는 것
        System.out.println("size : " + stack.size());
        System.out.println("last element  = " + stack.pop()); // Pop 은 꺼내서 보는 것.
        System.out.println("size : " + stack.size()); // 그렇기에 pop 후에는 stack 변수에 마지막 데이터는 없다.
        System.out.println("last element  = " + stack.peek());
        System.out.println("exist 1 " + stack.contains(1));
        System.out.println("exist 7 " + stack.contains(7));

        int lastSizeOfStack = stack.size();
        for (int i =0; i<lastSizeOfStack; i++){
            stack.pop();
        }

        System.out.println("isEmpty " + stack.isEmpty());
        System.out.println(stack); // stack 의 사이즈가 줄어들면서 for 문 조건과 교차하는 지점이 생겨 1이라는 element 가 남게됨.

        stack.pop(); // .EmptyStackException 발생
    }
}
