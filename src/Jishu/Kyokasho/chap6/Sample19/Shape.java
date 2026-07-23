package Jishu.Kyokasho.chap6.Sample19;

public abstract sealed class Shape
    permits Circle, Triangle, Square {
    
    public abstract double calcArea();
    @Override
    public String toString() {
        return getClass().getName() + ": " + calcArea() + " sq cm";
    }
}
