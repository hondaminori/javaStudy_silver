package Kyokasho.chap6.Sample6_19.sources.com.a;
public sealed class Square extends Shape permits Cube {
    double side = 5.0;
    @Override
    public double calcArea() { return Math.pow(side, 2.0); }
}
