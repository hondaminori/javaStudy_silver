package Kyokasho.chap6.Sample6_21;

record Food(String name, int price) implements Item {
    @Override
    public int calcPrice() {
        return (int)(price * (1+TAX_RATE));
    }
}
