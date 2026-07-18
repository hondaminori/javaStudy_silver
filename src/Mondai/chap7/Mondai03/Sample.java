package Mondai.chap7.Mondai03;

public class Sample {
    public static void main(String[] args) throws Exception {
        try (A a = new A("A");
            A b = new A("B")) {
        } finally {
            System.out.println("C");
        }
    }
}
