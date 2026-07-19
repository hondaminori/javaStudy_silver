package Kyokasho.chap5.Mondai5_08;

public class Test {
    String text = "A";
    void method() {
        text = "B";
    }
    void method(String t) {
        String text = "C";
        System.out.print(text);
    }
    public static void main(String[] args) {
        String text = "D";
        Test t = new Test();
        t.method("E");
        System.out.print(t.text);
        t.method();
        System.out.print(text);
        System.out.print(t.text);
    }
}
