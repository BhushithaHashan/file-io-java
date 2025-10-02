package com.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderInstance {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("notes.txt")) {
            int letters = fileReader.read();
            while (fileReader.ready()) {
                System.out.println((char)letters);
                letters = fileReader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
