package Kyokasho.chap6.Sample6_12;

class Ship extends Transport {
    public Ship(int speed) { super(speed); }
    @Override
    public void move() {          // 抽象メソッドのオーバーライド
        System.out.println("Ship: cruising at "
                                  + getSpeed() + "knots");
    }
}
