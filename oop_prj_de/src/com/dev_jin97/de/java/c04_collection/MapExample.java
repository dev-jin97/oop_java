package com.dev_jin97.de.java.c04_collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "berry");
        map.put(3, "cherry");
        map.put(100, "pineapple");
        System.out.println(map);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("first", "apple");
        stringMap.put("second", "berry");
        // stringMap.put("second", "cherry"); key 중복 불가
        stringMap.putIfAbsent("second", "pineapple");
        stringMap.putIfAbsent("third", "pineapple"); // putIfAbsent : key 값이 존재하지 않는다면 넣어줌.
        System.out.println(stringMap);

        //
        if (stringMap.containsKey("first")) {
            System.out.println("exist! " + stringMap.get("first"));
        }
        if (!stringMap.containsKey("nonexist")) {
            System.out.println("doesn't exist!");
        }

        // key 들의 집합 set 형태를 통해 foreach 문 가능
        for (String key : stringMap.keySet()){
            System.out.println(stringMap.get(key));
        }
        // 혹은 values 를 통해 배열로서 key에 존재하는 값을 리턴해줌.
        System.out.println(stringMap.values());

        // remove
        stringMap.remove("first");
        System.out.println(stringMap);

        stringMap.clear();
        System.out.println("size = " + stringMap.size());
    }
}
