package Kyokasho.chap7.Mondai7_05;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.err.println(result); // 警告回避用
        } catch (ArithmeticException e) {
            // System.out.println(e.getMessage() + ":" + a + ":" + b);
        }
    }
}
