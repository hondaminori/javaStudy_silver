package Kyokasho.chap6.Sample6_21;

sealed interface Item permits Food {
    double TAX_RATE = 0.1;
    int calcPrice();
}
