package Kyokasho.chap6.Sample6_26;

public class Sample {
    String val;                   // 例5で使用するメンバ変数
    public static void main(String[] args) {
        Sample sample = new Sample();
        String text = "Duke";
        sample.test1(text);       // 例1
        sample.test2(text);       // 例2
        sample.test3(text);       // 例3
        sample.test4(text);       // 例4
        sample.test5(text);       // 例5
        sample.test6(text);       // 例6
        sample.test7(text);       // 例7
    }
    void test1(Object obj) {
        if(obj instanceof String s) {
            System.out.println("test1(): " + s);  // scope
        } else {
//            System.out.println(s);
        }
    }
    void test2(Object obj) {
        if(!(obj instanceof String s)) {
//                System.out.println(s);
            return;
        }
        System.out.println("test2(): " + s);      // scope
    }
    void test3(Object obj) {
        if(obj instanceof String s && s.length() == 4) {
            System.out.println("test3(): " + s);  // scope
        }
//            System.out.println(s);
    }
    void test4(Object obj) {
//        if(obj instanceof String s & s.length() == 4) {
//            System.out.println(s);
//        }
//            System.out.println(s);
    }
    void test5(Object obj) {
        if(obj instanceof String val) {
            System.out.println("test5(): " + val);
        }
        System.out.println("field: " + val);
    }
    void test6(Object obj) {
        if (obj instanceof String s) {
            s += "-san";
            System.out.println("test6(): " + s);
        }
    }
    void test7(Object obj) {
//        if(obj instanceof Object s) {}
    }
}

