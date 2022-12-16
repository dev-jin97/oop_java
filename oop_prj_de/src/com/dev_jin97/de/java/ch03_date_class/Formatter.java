package com.dev_jin97.de.java.ch03_date_class;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatter {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));

        System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.KOREA)));


        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy@MM@dd HH:mm:ss")));
    }
}
