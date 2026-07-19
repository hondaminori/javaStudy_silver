package Kyokasho.chap5.Sample5_10;

public class Sample {
 // public void method(int i) { System.out.print("int : " + i); }
    public void method(long l) { System.out.print("long : " + l); }
    public void method(float f) { System.out.print("float : " + f); }
    public void method(double d) { System.out.print("double : " + d); }
    public void method(Integer i) { System.out.print("Integer : " + i); }
    public void method(int... i) { System.out.print("int... : " + i[0]); }
    public void method(byte b) { System.out.print("byte : " + b); }
    public static void main(String... args) {
        Sample s = new Sample();
        s.method(100);
    }
}
