package Kyokasho.chap7.Mondai7_15;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception ex) {
            System.out.print("Exception! ");
        }
    }
    static void test() throws FileNotFoundException {
        try {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.print("RuntimeException! ");
            }
            throw new FileNotFoundException("FileNotFoundException! ");
        } catch (IOException e) {
            System.out.print("IOException! ");
        }
    }
}
