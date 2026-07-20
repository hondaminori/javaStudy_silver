package Kyokasho.chap6.Sample6_16;

// インタフェース
interface D extends B, C {
    default void x() {
        // 独自処理を実装
    }
}
