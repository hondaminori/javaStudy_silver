package Kyokasho.chap6.Sample6_21;

// final interface Baz extends Bar{}          // final指定は不可
sealed interface Eatable permits Vegetable {} // 実装クラスの限定
