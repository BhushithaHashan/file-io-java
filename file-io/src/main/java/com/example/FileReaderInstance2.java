package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderInstance2 {
    public static void main(String[] args) {
        String filePath = "/home/bhushitha/Documents/practice/file-io-practice/file-io/src/main/java/com/example/InputStream.java";
        try(FileReader fr = new FileReader(filePath);BufferedReader br = new BufferedReader(fr)) {
            String classFile = "";
            while (true ) {
                String line = br.readLine();
                if (line==null) {
                    break;
                }
                if (classFile==null) {
                    classFile = line+"\n";
                }
                classFile +=(line+"\n");
            }
            System.out.println(classFile);
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
