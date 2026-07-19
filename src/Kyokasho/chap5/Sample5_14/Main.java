package Kyokasho.chap5.Sample5_14;

public class Main {
    // static初期化子
    static { System.out.println("static Initializer... Main"); }
    // main()メソッド
    public static void main(String[] args) { new Test("new Test()"); }
}
