package Mondai.chap7.Mondai04;

public class Sample {
    public static void main(String[] args) {
        String a = new String("sample");
        String b = a;
        String c = a.intern();
        String d = "sample";

        if (a == b) {
            System.out.println("A");
        }
        if (a == c) {
            System.out.println("B");
        }
        if (a == d) {
            System.out.println("C");
        }
        if (b == c) {
            System.out.println("D");
        }
        if (b == d) {
            System.out.println("E");
        }
        if (c == d) {
            System.out.println("F");
        }
    }
}
