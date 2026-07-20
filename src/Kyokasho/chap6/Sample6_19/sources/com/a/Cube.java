package Kyokasho.chap6.Sample6_19.sources.com.a;
public final class Cube extends Square {
    @Override
    public double calcArea() { return 6 * Math.pow(side, 2.0); }
    public double calcVolume() {return Math.pow(side, 3.0); }
}
