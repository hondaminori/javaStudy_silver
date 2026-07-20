import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(20);
        HashSet<Integer> values = new HashSet<>();
        values.add(i1);
        values.add(i2);
        System.out.println("values.add(20): " + values.add(20));
        System.out.println("values.add(30): " + values.add(30));
        System.out.println("values.size(): " + values.size());
        System.out.println(values);
    }
}
