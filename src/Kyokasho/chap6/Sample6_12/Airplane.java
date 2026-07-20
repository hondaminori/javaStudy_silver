package Kyokasho.chap6.Sample6_12;

class Airplane extends Transport {
    public Airplane(int speed) { super(speed); }
    @Override
    public void move() {          // 抽象メソッドのオーバーライド
        System.out.println("Airplane: flying at "
                                  + getSpeed() + "km/h");
    }
}
