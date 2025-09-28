package com.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
    }
    
}
