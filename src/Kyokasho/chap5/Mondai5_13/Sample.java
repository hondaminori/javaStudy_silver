package Kyokasho.chap5.Mondai5_13;

public class Sample {
    public Sample() {
        this(1);
        System.out.print(0);
    }
    public Sample(int x) {
        this(x, 2);
        // this();  // 警告回避のため
        System.out.print(x);
    }
    public Sample(int x, int y) {
        System.out.print(x + "" + y);
    }
    public static void main(String[] args) {
        new Sample(3);
    }
}

