
public class Main {
    public static void main(String[] args) {
        int i = 10, j = 10, x, y;
        ++i;                      // 1つの変数に対して単体で使用
        j++;
        System.out.println("i:" + i + ", j:" + j);

        i = 10; j = 10;
        x = ++i;                  // 代入演算子との組み合わせ(前置)
        y = --j;
        System.out.println("i:" + i + ", j:" + j + ", x:" + x + ", y:" + y);
        i = 10; j = 10;
        x = i++;                  // 代入演算子との組み合わせ(後置)
        y = j--;
        System.out.println("i:" + i + ", j:" + j + ", x:" + x + ", y:" + y);
        System.out.println("----------");

        int a = 1, b = 1, c = 1, d = 1;
        System.out.println(a++);  // 他の処理との組み合わせ
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);
        System.out.println("a: " + a + ", " + "c: " + c);
    }
}
