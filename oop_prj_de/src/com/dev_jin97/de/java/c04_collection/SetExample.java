package com.dev_jin97.de.java.c04_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // SET
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(9);
        // integerSet.add(9);  --> 중복 데이터를 허용하지 않음.

        // 자동 정렬되어 처리(즉, 넣은 순서를 고려하지 않음.)
        System.out.println(integerSet);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("LA");
        stringSet.add("New York");
        stringSet.add("LasVegas");
        stringSet.add("San Francisco");
        stringSet.add("Seoul");
        System.out.println(stringSet);

        // remove
        stringSet.remove("Seoul");
        System.out.println(stringSet);

        //
        System.out.println("exist LA? " + stringSet.contains("LA"));

        // removeAll
        List<String> removeTargets = new ArrayList<>();
        removeTargets.add("LA");
        removeTargets.add("New York");
        // removeAll 함수는 파라미터로 collection 타입을 가져와야하기 때문에 ArrayList 도 넣을 수 있음.
        stringSet.removeAll(removeTargets);

        System.out.println(stringSet);
        System.out.println("exist LA? " + stringSet.contains("LA"));

        System.out.println("size " + stringSet.size());
        stringSet.clear(); // 데이터 초기화
        System.out.println(stringSet);

    }
}
