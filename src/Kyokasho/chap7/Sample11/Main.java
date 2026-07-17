package Kyokasho.chap7.Sample11;

public class Main {
    public static void main(String[] args) {
        try (FirstResource r1 = new FirstResource();
                SecondResource r2 = new SecondResource();) {
            System.out.println("try");
        } finally {
            System.err.println("finally");
        }
    }
}
