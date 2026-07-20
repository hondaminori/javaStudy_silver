package Kyokasho.chap6.Sample6_21;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("Chocolate", 750);
        System.out.println(food.name() + ": "
                            + food.calcPrice() + "yen");
    }
}
