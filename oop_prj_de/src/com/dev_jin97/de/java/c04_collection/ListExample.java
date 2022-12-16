package com.dev_jin97.de.java.c04_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // List

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(10);

        System.out.println(list);

        Collections.sort(list); // 정렬
        System.out.println(list);
        System.out.println(list.size()); // 사이즈

        list.remove(4); // index 위치의 내용 삭제
        System.out.println(list);


        /* 배열과 비교 */
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 5;
        intArr[2] = 4;

        int[] intArr2 = new int[5];
        intArr2[0] = intArr[0];
        intArr2[1] = intArr[1];
        intArr2[2] = intArr[2];
        intArr2[3] = 11;
        intArr2[4] = 10;


        // for 문
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 모든 Collection 은 Iterable 을 상속받기 때문에 foreach 문을 활용할 수 있다.
        for (int cur : list) {
            System.out.println(cur);
        }
    }
}
