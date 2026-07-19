package Kyokasho.chap5.Mondai5_15;

public class Main {
    public static void main(Sample s) {
        s.val++;
        System.out.print(s.val);
    }
    public static int main(int i) {
        return i * i;
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        main(s);
        int num = main(10);
        System.out.print(s.val + num);
    }
}
