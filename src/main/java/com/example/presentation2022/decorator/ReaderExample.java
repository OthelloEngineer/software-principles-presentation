package com.example.presentation2022.decorator;

import java.io.*;

public class ReaderExample {
    public static void main(String[] args){
        byte[] bytes = new byte[0];
        Reader reader =
                new BufferedReader(
                        new LineNumberReader(
                                new InputStreamReader(
                                        new ByteArrayInputStream(bytes))));
    }
}




interface Unamable{}

class Voldemort implements Unamable{}