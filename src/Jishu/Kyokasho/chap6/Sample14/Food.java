package Jishu.Kyokasho.chap6.Sample14;

public class Food extends Item implements Eatable {
    private int calories;
    public Food(String name, int calories) {
        super(name);
        this.calories = calories;
    }
    @Override
    public void showalories() {
        System.out.println(name + ": " + calories + "kcal/100g");
    }
}
