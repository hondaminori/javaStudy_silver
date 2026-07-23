package Jishu.Kyokasho.chap6.Sample19;

public sealed class Square extends Shape permits Cube {
    double side = 5.0;
    @Override
    public double calcArea() { return Math.pow(side, 2.0); }    
}
