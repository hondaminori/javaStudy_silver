package Kyokasho.chap7.Mondai7_14;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("MyEx");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
