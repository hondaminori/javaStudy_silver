package Kyokasho.chap5.Mondai5_06;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        double v = obj.x(10);
        System.out.println(v);  // 警告回避のため
    }
    public float x(int a) {
        return a * 0.5F;
    }
}
