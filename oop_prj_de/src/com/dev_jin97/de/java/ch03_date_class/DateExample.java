package com.dev_jin97.de.java.ch03_date_class;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date(1000));

        System.out.println(new Date().after(new Date(1)));
        System.out.println(new Date().compareTo(new Date(1)));
        long future = 2228562001000L;
        System.out.println(new Date(future));

        System.out.println(new Date().compareTo(new Date(future)));


        // Date 클래스의 단점
        /*
        * 1. Thread safe 하지 않다.
        * 2. API 가 이해하거나 사용하기 쉽지 않다.
        * 3. Timezone 을 적용하기 어렵다.
        */
    }
}
