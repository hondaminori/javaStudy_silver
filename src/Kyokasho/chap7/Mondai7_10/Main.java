package Kyokasho.chap7.Mondai7_10;

public class Main {
    public static void main(String[] args) {
        // try (MyResource resource = new MyResource()) { // 問題文のとおり、エラーになる
        try { // エラー回避のため
            System.out.print("A");
        } finally {
            System.out.print("B");
        }
    }
}
