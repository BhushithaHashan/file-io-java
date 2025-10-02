package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderInstance2 {
    public static void main(String[] args) {
        String filePath = "/home/bhushitha/Documents/practice/file-io-practice/file-io/src/main/java/com/example/InputStream.java";
        try(FileReader fr = new FileReader(filePath);BufferedReader br = new BufferedReader(fr)) {
            int letter;
            while ( (letter=br.read())!=-1) {
                System.out.println((char)letter+br.readLine());
            }
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
