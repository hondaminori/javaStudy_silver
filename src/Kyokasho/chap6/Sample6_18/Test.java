package Kyokasho.chap6.Sample6_18;

public class Test implements Foo {
    public static void main(String[] args) {
        Test t = new Test();
        t.a();   t.b();            // defaultメソッドにアクセス
        Foo.x(); Foo.y();          // staticメソッドにアクセス
    }
}
