package Kyokasho.chap7.Sample7_14;

import java.io.*;
class Base { public void method() throws IOException {} }

class A extends Base { public void method() throws IOException {} }
class B extends Base { public void method()
                            throws FileNotFoundException {} }
class C extends Base { public void method() {} }
class D extends Base { public void method()
                            throws RuntimeException {} }
// class E extends Base { public void method() throws Exception {} }
// class F extends Base { public void method()
//                          throws ClassNotFoundException {} }
class Main{
    public static void main(String[] args) {
        Base obj = new Base();
        // obj = new A();
        try {
            obj.method();
        } catch(IOException e) {}
    }
}
