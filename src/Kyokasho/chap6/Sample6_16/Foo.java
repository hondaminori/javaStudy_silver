package Kyokasho.chap6.Sample6_16;

interface Foo {
    default void x() {
        System.out.println("Foo#x()");
    }
    default void y() {
        System.out.println("Foo#y()");
    }
}
