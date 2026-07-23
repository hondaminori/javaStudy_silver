package Jishu.Kyokasho.chap6.Sample12;

public class Airplane extends Transport{
    public Airplane(int speed) {super(speed);}
    @Override
    public void move() {
        System.out.println("Airplane: flying at " + getSpeed() + "Km/h");
    }
}
