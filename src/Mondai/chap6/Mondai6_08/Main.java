package Mondai.chap6.Mondai6_08;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("A");
        } finally {
            System.out.println("B");
        // } finally {
        //     System.out.println("C");
        }
    }
}
