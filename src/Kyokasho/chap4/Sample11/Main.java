package Kyokasho.chap4.Sample11;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            System.out.print(i);
            if (i == 3) {
                break;
                // System.out.println("break!");
            }
            i++;
        }
        System.out.println("\n----");
        System.out.println("i : " + i);
    }
}
