package Jishu.Kyokasho.chap6.Sample26;

public abstract sealed class Shape permits Square {
    public abstract double calcArea();
    @Override
    public String toString() {
        return getClass().getName() + ": " + calcArea() + " sq cm";
    }
}
