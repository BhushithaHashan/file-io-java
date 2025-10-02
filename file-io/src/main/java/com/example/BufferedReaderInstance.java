package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInstance {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("enter the message here:");
            String message=br.readLine();
            System.out.println(message);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
