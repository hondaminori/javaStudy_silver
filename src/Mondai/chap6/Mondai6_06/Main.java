package Mondai.chap6.Mondai6_06;

public class Main {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result); // 警告回避のため
    }
    private static int sample() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return 10;
        } finally {
            // return 20;  //警告回避のため
        }
    }
}
