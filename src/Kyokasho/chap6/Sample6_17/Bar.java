package Kyokasho.chap6.Sample6_17;

interface Bar extends Foo {
    default void x() {
        System.out.print("a call from Bar#x()... ");
        Foo.statMethod();       // staticメソッドアクセス
    }
}
