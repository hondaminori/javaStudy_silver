package Kyokasho.chap5.Mondai5_17;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = { new Fruit("Lemon"), new Fruit("Kiwi"), new Fruit("Lime")};
        method(fruits);
        fruits[1] = null;
        for (var f : fruits)
            if(f != null) System.out.print(f.name + " ");
    }
    public static void method(Fruit[] x) {
        for (var f : x)
            if(f.name.length() == 5) f = null;
    }
}
