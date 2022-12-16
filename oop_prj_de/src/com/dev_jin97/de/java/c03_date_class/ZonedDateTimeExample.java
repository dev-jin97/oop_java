package com.dev_jin97.de.java.c03_date_class;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(ZoneId.getAvailableZoneIds());

        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime, zoneId);

        System.out.println(zoneDateTime);
        System.out.println(zoneDateTime.parse("2022-12-16T16:23:43.603+09:00[Asia/Seoul]"));


        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);

    }
}
