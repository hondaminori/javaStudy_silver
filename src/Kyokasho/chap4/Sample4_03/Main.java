package Kyokasho.chap4.Sample4_03;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.print(a + " ");
            a += 2;
        } while (a < 10);
        System.out.println("\n---");
        int b = 1;
        do 
            System.out.print(b + " ");
            // b += 2;
        while((b += 2) < 10);
    }
}
