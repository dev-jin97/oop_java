package com.dev_jin97.de.java.c_01_5_2;

import com.dev_jin97.de.java.c01_5_access_modifier.AccessModifierTest;

public class Anonymous {
    public void call()  {
        AccessModifierTest accessModifierTest = new AccessModifierTest();

//        accessModifierTest.messageDefault();
//        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }
}
