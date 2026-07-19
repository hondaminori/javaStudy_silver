package Kyokasho.chap3.Mondai3_04;

public class Main {
    public static void main(String[] args) {
        byte data = 10;
        int[] array = {data, (int)10.5};
        System.out.println(array[0] < array[1]);
    }
}
