package Kyokasho.chap7.Mondai7_06;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        try {
            disp(values);
            System.out.print(" try-end");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" catch");
        } finally {
            System.out.print("finally");
        }
    }

    public static void disp(int[] x) {
        for (int i = 0; i <= 4; i++) {
            System.out.print(x[i]);
        }
    }
}
