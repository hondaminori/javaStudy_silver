package Kyokasho.chap4.Sample4_04;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        while(a > 10) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println("\n----");
        int b = 1;
        do {
            System.out.println(b + " ");
            b--;
        } while (b > 10);
    }
}
