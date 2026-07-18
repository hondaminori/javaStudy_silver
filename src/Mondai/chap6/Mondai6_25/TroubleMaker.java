package Mondai.chap6.Mondai6_25;

public class TroubleMaker {
    public static void main(String[] args) {
        try (TroubleResource a = new TroubleResource()) {
            throw new Exception();
        } catch (RuntimeException e) {
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}
