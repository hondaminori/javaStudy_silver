package b;

import a.Foo;

public class Main {
    public static void main(String[] args) {
        Foo obj = new Foo();
        obj.setVal(3);
        System.out.println(obj.getVal());
    }
}
