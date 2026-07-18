package Kyokasho.chap7.Sample7_15;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Cause: " + e.getCause());
        }
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
    static void methodA() throws Exception {
        try {
            throw new IOException();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
    static void methodB() throws FileNotFoundException {
        try {
            throw new FileNotFoundException("FileNotFound!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
