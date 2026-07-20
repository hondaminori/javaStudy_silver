package Kyokasho.chap6.Sample6_10;

class Main {
    public static void main(String[] args) {
        Sample s = new Sample(10, 20);
        System.out.println("s.calc(): " + s.calc());
        System.out.println("Sample.getB(): " + Sample.getB());
        System.out.println("s.x(): " + s.x());
        System.out.println(s);                      // s.toString() と同様に出力
    }
}
