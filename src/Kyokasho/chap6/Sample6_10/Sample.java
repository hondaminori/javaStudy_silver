package Kyokasho.chap6.Sample6_10;

public record Sample(int x, int y) {
//  private double a = 100;                         // X ：インスタンス変数
    private static double b = 200.0;                // static変数
    public double calc() { return x + y; }          // インスタンスメソッド
    public static double getB() { return b; }       // staticメソッド
    @Override public int x() { return x; }          // アクセサ
//  @Override double y(double z) { return 1.0; }    // X ：アクセサではない
    @Override
    public String toString() {
        return "Sample record... x:" + x + ", y:" + y;
    }
}
