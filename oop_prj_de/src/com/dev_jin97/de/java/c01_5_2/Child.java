package com.dev_jin97.de.java.c01_5_2;

import com.dev_jin97.de.java.c01_5_1_access_modifier.AccessModifierTest;

public class Child  extends AccessModifierTest{
    public void call()  {
        this.messageOutside();
        this.messageProtected();

    }
}
