package com.dev_jin97.de.java.c01_5_access_modifier;

public class AccessModifierTest {
    // Access modifier

    private void messageInside(){
        System.out.println("This is private modifier");
    }

    void messageDefault(){
        messageInside();
        System.out.println("This is default(package-private) modifier");
    }

    protected void messageProtected(){
        messageInside();
        System.out.println("This is protected modifier");

    }

    public void messageOutside(){
        messageInside();
        System.out.println("This is public modifier");
    }


}
