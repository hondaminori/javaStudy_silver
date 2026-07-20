package Kyokasho.chap6.Sample6_16;

/*
// defaultメソッドの衝突によりコンパイルエラーが発生する例
interface A { default void x() {} }
interface B extends A { default void x() {} }
interface C extends A { default void x() {} }
interface D extends B, C {}
public class Test2 implements B, C {}
*/

// 実装クラス
public class Test2 implements B, C {
    @Override
    public void x() {
        B.super.x(); // Bのx()にアクセス
    }
}

/*
// 暗黙的に衝突が解決される例1
// 階層構造がある場合は一番サブインタフェースが優先 - インタフェースCのx()が優先
interface A { default void x() {} }
interface B extends A { default void x() {} }
interface C extends B { default void x() {} }
*/

/*
// 暗黙的に衝突が解決される例2
// インタフェースとクラスでは常にクラスが優先 - クラスCのx()が優先
interface A { default void x() {} }
interface B extends A { default void x() {} }
class C implements A { public void x() {} }
public class Test2 extends C implements B {}
*/
