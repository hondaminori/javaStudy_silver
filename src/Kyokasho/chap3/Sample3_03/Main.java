
public class Main {
    public static void main(String[] args) {
        // 複合代入演算子
        int a = 1, b = 2, c = 3, d = 10, e = 10;
        int x = 3;
        System.out.println("a += x : " + (a += x));     // a = a + x;
        System.out.println("b -= x : " + (b -= x));     // a = b - x;
        System.out.println("c *= x : " + (c *= x));     // a = c * x;
        System.out.println("d /= x : " + (d /= x));     // a = d / x;
        System.out.println("e %= x : " + (e %= x));     // a = e % x;

        System.out.println();

        // 関係演算子
        int y = 10, z = 10;
        System.out.println("x == y : " + (y == z));     // true
        System.out.println("x != y : " + (y != z));     // false
        System.out.println("x > y  : " + (y > z));      // false
        System.out.println("x >= y : " + (y >= z));     // true
        System.out.println("x < y  : " + (y < z));      // false
        System.out.println("x <= y : " + (y <= z));     // true
    }
}
