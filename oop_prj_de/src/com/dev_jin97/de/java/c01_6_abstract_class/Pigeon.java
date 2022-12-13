package com.dev_jin97.de.java.c01_6_abstract_class;

public class Pigeon extends Bird{

    @Override
    Boolean flyable(int z) {
        return z < 10000;
    }
}
