package Kyokasho.chap6.Sample6_22;

public class Main {
    static Sub methodA() { return new Sub(); }      // 例2
    static void methodB(Super s) {}                 // 例3
    static Foo methodC() { return new FooImpl(); }  // 例4
    static void methodD(Foo f) {}                   // 例4

    public static void main(String[] args) {
        // Super s1 = new Sub();   // 例1
        // Super s2 = methodA();   // 例2
        // methodB(new Sub());     // 例3
        // // 例4
        // Foo f1 = new FooImpl();
        // Foo f2 = methodC();
        // methodD(new FooImpl());
    }
}
