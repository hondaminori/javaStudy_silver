package Kyokasho.chap6.Sample6_32;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "U", "K", "E");
        Collections.reverse(list);
        System.out.println("Collections.reverse():" + list);
        int[] numArray = {1, 5, 3};
        Arrays.sort(numArray);
        System.out.println("Sorted:" + Arrays.toString(numArray));
        int[] small = {1, 3};
        int[] same = {1, 3, 5};
        int[] large = {5, 3, 1};
        System.out.print("Arrays.compare(): ");
        System.out.print(Arrays.compare(numArray, small)  + " ");
        System.out.print(Arrays.compare(numArray, same)  + " ");
        System.out.print(Arrays.compare(numArray, large)  + "\n");
        System.out.print("Arrays.mismatch(): ");
        System.out.print(Arrays.mismatch(numArray, small)  + " ");
        System.out.print(Arrays.mismatch(numArray, same)  + " ");
    }
}
