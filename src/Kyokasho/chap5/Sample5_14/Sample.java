package Kyokasho.chap5.Sample5_14;

public class Sample {
    int value = 100;
    static int commonValue = 500;
    public void printValues() {
        System.out.println(" * instance value : " + value);
        System.out.println(" * static common value : " + commonValue);
    }
    public static void printCommonValue() {
//      int val = value;
        System.out.println(" * static common value : " + commonValue);
    }
    public static void main(String[] args) {
        printCommonValue();
        System.out.println("static field : " + commonValue);
//      printValues();
        Sample s1 = new Sample();
        Sample s2 = new Sample();
        System.out.println("instance field : " + s1.value);
        s2.printValues();
    }
}
