package Jishu.Kyokasho.chap6.Sample19;

public final class Circle extends Shape {
    private double radius = 5.0;
    @Override
    public double calcArea() { return Math.PI * Math.pow(radius, 2.0); }
}
