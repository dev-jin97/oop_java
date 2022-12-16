package com.dev_jin97.de.java.c04_collection;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // ArrayDeque 실무에서 사용, Stack, Queue 대신에 사용
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(4); // 첫번째 자리에 집어넣는 것
        System.out.println(arrayDeque);


        arrayDeque.addLast(0); // 마지막 자리에 집어넣는 것
        System.out.println(arrayDeque);


        arrayDeque.offer(10); // queue 에서도 존재하는 offer 사용가능 뒤로 넣음
        System.out.println(arrayDeque);
        arrayDeque.offerLast(11);
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(5); // addFirst() 와 동작이 같음.
        System.out.println(arrayDeque);

        arrayDeque.push(6);
        System.out.println(arrayDeque); // == addFirst()

        arrayDeque.pop();
        System.out.println(arrayDeque);
        // pop() 이든 poll() 이든 FO(First OUT) 이기 때문에 먼저 나오는 것이지만
        arrayDeque.poll();
        System.out.println(arrayDeque);
        arrayDeque.pollLast(); // pollLast() 는 마지막 데이터를 빼줌.
        System.out.println(arrayDeque);

        arrayDeque.remove(0);
        System.out.println(arrayDeque); // 0 이라는 element 접근하여 삭제
    }
}
