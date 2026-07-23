package Jishu.Kyokasho.chap6.Sample19;

public non-sealed class Triangle extends Shape {
    private double base = 5.0;
    private double height = 3.0;
    @Override
    public double calcArea() { return base * height / 2;}
}

