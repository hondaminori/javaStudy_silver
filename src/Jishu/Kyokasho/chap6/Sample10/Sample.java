package Jishu.Kyokasho.chap6.Sample10;

public record Sample(int x, int y) {
    // private double a = 100;
    private static double b = 200.0;
    public double calc() { return x + y;}
    public static double getB() { return b; }
    // @Override double y(double z) { return 1.0}
    @Override
    public String toString() {
        return "Sample record... x:" + x + " , y:" + y;
    }
}
