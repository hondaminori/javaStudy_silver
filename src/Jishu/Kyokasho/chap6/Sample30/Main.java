package Jishu.Kyokasho.chap6.Sample30;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> depts = new HashMap<>();
        depts.put(10, "HR");
        depts.put(20, "Tech");
        depts.put(30, "Learning");
        depts.put(40, "Sales");
        System.out.println("depts.get(30): " + depts.get(30));
        System.out.println("depts.put(10, \"Executive\"): " 
                            + depts.put(10, "Executive"));
        System.out.println("depts.remove(40): " + depts.remove(40));
        System.out.print("Keys..... ");
        for( Integer k : depts.keySet()) {
            System.out.print(k + " ");
        }
        System.out.print("\nValues... ");
        for(String v : depts.values()) {
            System.out.print(v + " ");
        }
    }
}
