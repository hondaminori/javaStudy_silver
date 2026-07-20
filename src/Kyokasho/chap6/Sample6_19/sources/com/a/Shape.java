package Kyokasho.chap6.Sample6_19.sources.com.a;
// import com.b.Heart;
public abstract sealed class Shape
                permits Circle, Triangle, Square {
//              permits Circle, Triangle, Square, Heart {
    public abstract double calcArea();
    @Override
    public String toString() {
        return getClass().getName() + ": " + calcArea() + " sq cm";
    }
}
