package Kyokasho.chap6.Sample6_14;

class Food extends Item implements Eatable { // 実装クラス/サブクラス
    private int calories;
    public Food(String name, int calories) {
        super(name);
        this.calories = calories;
    }
    @Override
    public void showCalories() {
        System.out.println(name + ": " + calories + "kcal/100g");
    }
}
