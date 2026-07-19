package Kyokasho.chap3.Mondai3_16;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        if (x < 100)
            System.out.print("A");
        else if (x <= 100 && x >= 50)
            System.out.print("B");
        else
            System.out.println("C");
    }
}
