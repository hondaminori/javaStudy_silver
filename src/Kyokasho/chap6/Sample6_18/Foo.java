package Kyokasho.chap6.Sample6_18;

interface Foo {
    default void a() {
        common(); System.out.println("default a()");
    }
    default void b() {
        common(); System.out.println("default b()");
        statCommon(); System.out.println("default b()");
    }
    static void x() {
        statCommon(); System.out.println("static x()");
    }
    static void y() {
        statCommon(); System.out.println("static y()");
     // common();
    }
    private void common() {             // privateメソッド
        System.out.print("cmmon(): ");
    }
    private static void statCommon() {  // private staticメソッド
        System.out.print("statCommon(): ");
    }
}
