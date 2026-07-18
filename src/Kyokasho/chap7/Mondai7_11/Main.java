package Kyokasho.chap7.Mondai7_11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Resource r1 = new Resource("r1");
        try(r1; Resource r2 = new Resource("r2")) {
            System.out.print("try");
        } catch (IOException e) {
            System.out.print("IOException");
        }
    }
}
