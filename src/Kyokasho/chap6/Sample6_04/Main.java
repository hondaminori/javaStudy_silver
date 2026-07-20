package Kyokasho.chap6.Sample6_04;

public class Main {
    public static void main(String[] args) {
        Sub obj = new Sub();
    //  Super obj = new Sub();
        System.out.println("instance field - obj.x:" + obj.x);
        System.out.println("static field   - Super.y:"
                + Super.y + " | Sub.y:" + Sub.y);
        Super.statMethod();
        Sub.statMethod();
        obj.instMethod();
    }
}
