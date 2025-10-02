package com.example;


import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) {
      try(InputStreamReader inputStreamReader = new InputStreamReader(System.in)){
            System.out.println("enter the message");
            System.out.println(inputStreamReader.ready());
            int letters =inputStreamReader.read();
            while (inputStreamReader.ready()) {
                System.out.println((char)letters);
                letters=inputStreamReader.read();
                
            }
            inputStreamReader.close();
            System.out.println();
      }catch(IOException e){
            System.out.println(e.getMessage());
      }
    }
    
}
