package com.dev_jin97.de.java.c02_exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {

    public static void main(String[] args) {
        // AutoClosable 객체를 이용한 것만 사용가능
        try (FileOutputStream out = new FileOutputStream("test.txt")){
            out.write("Hello World".getBytes(StandardCharsets.UTF_8));
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
