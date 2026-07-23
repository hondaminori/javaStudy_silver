package Jishu.Kyokasho.chap6.Sample12;

public class Ship extends Transport {
    public Ship(int speed) {super(speed);}
    @Override
    public void move() {
        System.out.println("Ship: cruising at" + getSpeed() + "knots");
    }
}
