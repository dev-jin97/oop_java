package com.dev_jin97.de.java.c07_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        // Stream
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("속초");
        list.add("서울");

        System.out.println(list);

        // Collect
        List<String> result = list.stream() // 데이터 소스를 변경하지 않고 결과를 새로운 객체에 반환
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);

        // Filter : 인자의 조건에 맞는 데이터를 뒤로 넘김.
        Set<String> result2 = list.stream()
                .filter("서울"::equals)
                .collect(Collectors.toSet());

        System.out.println(result2);



    }
}
