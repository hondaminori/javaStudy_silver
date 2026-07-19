package Kyokasho.chap5.Sample5_09;

public class Sample {
    public void method(char... c) {             // 1
        System.out.print("method(char... c) : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
    public void method(String s, int... i) {    // 2
        System.out.print("method(String s, int... i) : " + s + ":");
        for (int v : i) { System.out.print(v); }
        System.out.println(" / i.length:" + i.length);
    }
    public void method(int i, int... j) {       // 3
        System.out.print("method(int i, int... j) : " + i + ":");
        for (int v : j) { System.out.print(v); }
        System.out.println();
    }
    public void method(int i, int j) {          // 4
        System.out.println(
            " * method(int i, int j) : " + i + ":" + j);
    }
    // NG
    // public void method(String... s, int i) {}      // 5
    // public void methodF(String... s, int... i) {}  // 6

    public static void main(String... args) {
        Sample s = new Sample();
        s.method('a', 'b', 'c');                // 例1
        s.method(new char[]{'A', 'B', 'C'});    // 例1、配列も可
        // s.method(null);                      // 例1、nullの代入も可
        s.method("Sample with data", 1, 2, 3);  // 例2
        s.method("Sample without data");        // 例2、0個も可
        s.method(1, 2, 3);                      // 例3
        s.method(100, 200);                     // 例4
    }
}

