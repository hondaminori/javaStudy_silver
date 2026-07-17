package Kyokasho.chap4.Sample12;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println("skip!");
                continue;
            }
            System.out.println(i);
        }
    }
}
