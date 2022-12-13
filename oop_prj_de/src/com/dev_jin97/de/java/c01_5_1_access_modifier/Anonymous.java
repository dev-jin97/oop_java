package com.dev_jin97.de.java.c01_5_1_access_modifier;

public class Anonymous {
    public void call()  {
        AccessModifierTest accessModifierTest = new AccessModifierTest();

        accessModifierTest.messageDefault();
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }

    public static void main(String[] args) {
        Anonymous Anonymous = new Anonymous();
        Anonymous.call();
    }
}
