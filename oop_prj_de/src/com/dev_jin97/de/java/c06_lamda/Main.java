package com.dev_jin97.de.java.c06_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Lamda
        List<String> stringList = new ArrayList<>(Arrays.asList("Korea", "Japan", "China", "France", "England"));
//        Stream<String> stream = stringList.stream();
//        stream.map( (str) -> str.toUpperCase()).forEach(System.out::println);
        stringList.forEach(System.out::println);

        /*
        * 간단한 함수를 만들 때 간결하게 적용가능합니다만 재사용이 불가합니다.(익명함수)
        * 람다 중복이 계속 되면 코드가 지저분해질 수 있습니다.
        * 로그 혹은 디버깅이 어렵습니다. (함수의 정확한 이름과 위치가 나타나지 않을 수 있기 때문)
        * */
    }
}