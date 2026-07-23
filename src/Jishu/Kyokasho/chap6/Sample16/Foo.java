package Jishu.Kyokasho.chap6.Sample16;

public interface Foo {
    default void x() {
        System.out.println("Foo#x()");
    }
    default void y() {
        System.out.println("Foo#y()");
    }
}
