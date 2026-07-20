package Kyokasho.chap6.Sample6_17;

public class Main {
    public static void main(String[] args) {
        System.out.print("a call from Main#main()... ");
        Foo.statMethod();       // staticメソッドアクセス
        Concrete c = new Concrete();
        c.x();
        c.y();
//      c.statMethod();         // X：参照経由
    }
}

